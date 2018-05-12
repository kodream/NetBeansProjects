/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject88;

import common.MyException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.MemberDAO;

/**
 *
 * @author edu
 */
public class Server {
        private int count=0;
        MemberDAO mdao;
        ArrayList<DataOutputStream> list=new ArrayList<DataOutputStream>();
        StringBuilder sbTotalChat = new StringBuilder();

        LinkedHashMap<String, Integer> dataSorted;
        public Server() throws IOException, ClassNotFoundException, SQLException {
                mdao= new MemberDAO();
                ServerSocket ss = new ServerSocket(9999);
                System.out.println("server ready..");
       
                while(true){
                    try{
                        Socket s=ss.accept();
                        ServerThread t=new ServerThread(s);
                        t.start();
                    }catch(IOException e){

                    }
                }
    }

        class ServerThread extends Thread {
            
            Socket s;
            DataOutputStream out;
            DataInputStream in;

            @Override
            public void run() {
                try{
                    while(true){
                        String req =in.readUTF();
                        System.out.println(req);
                        String[] ptc = req.split(":");
                        System.out.println(ptc[0]);
                        service(ptc);
                    }
                }catch (Exception e){ System.out.println("seero:run()");}
            }
        
            public ServerThread(Socket s) throws IOException {
                this.s = s;
                out = new DataOutputStream(s.getOutputStream());
                in = new DataInputStream(s.getInputStream());
                list.add(out);
                count++;    
            }

            private void service(String[] ptc) throws MyException, IOException {
                switch(ptc[0]){
                    case "회원가입":
                                    try {
                                        System.out.println("회원가입:" + ptc[0] + ptc[1]+ptc[2]+ptc[3]);
                                         mdao.insertMember(ptc);
                                         out.writeUTF("join_ok");
                                    }catch (MyException e) {out.writeUTF(e.getMessage());}
                                    break;
                    case "로그인":
                                    try {
                                         String name =mdao.loginMember(ptc);
                                         if(name==null){
                                            out.writeUTF("아이디를 확인하세요.");
                                         }else{
                                             out.writeUTF("login_ok:"+name);
                                             System.out.println(s.getInetAddress() +"님과 연결되였습니다.");
                                         }
                                    } catch (MyException e) {out.writeUTF(e.getMessage());}  
                                     break;
                    case "제조사":
                                    try {
                                          String str =mdao.viewList(ptc);
                                          System.out.println(str);
                                          out.writeUTF("모델명:"+ str);
                                          out.writeUTF("방문자수:"+count);
                                          out.writeUTF("이슈:"+getIssue());
                                    }catch (MyException e) {out.writeUTF(e.getMessage());}
                                    break;
                    case "모델명":
//                                    try {
//                                        mdao.viewPhone(ptc);
//                                        out.writeUTF("데스트중..");
//                                   }catch (MyException e) {out.writeUTF(e.getMessage());}
//                                    break;
                    case "채팅":    
                                     try{
                                         broadcast(ptc[1],ptc[2]);
                                     }catch(Exception e){
                                        try{
                                            System.out.println("서버 채팅:" +e);
                                            list.remove(out);
                                            System.out.println(s.getInetAddress() +"님과 연결 종료합니다.");
                                            count--;
                                            out.writeUTF("방문자수:" + count);
                                            this.stop();
                                            out.close();
                                            in.close();
                                            s.close(); 
                                        }catch(Exception ex){System.out.println("serro:채팅()");}
                                     }
                                     break;
                   case "로그아웃":
                                    try{
                                         System.out.println(s.getInetAddress() +"님이 로그아웃하였습니다.");
                                         count--;
                                         out.writeUTF("방문자수:" + count);
                                         this.stop();
                                         in.close();
                                         out.close();
                                         s.close();
                                    }catch(Exception ex){System.out.println("serro:로그아웃()");}
                                    break;
                }
            }
//        private void broadcastIV(){
//            
//             synchronized(list){
//                 for(DataOutputStream outBroad:list){
//                    try {
//                            outBroad.writeUTF("방문자수:" + count);                       
//                            outBroad.writeUTF("이슈:"+getIssue());
//                    }catch (IOException ex) {System.out.println("serro:"+ex);}       
//                }    
//            }
//        }
        private void broadcast(String name, String con) {
          
            synchronized(list){
                for(DataOutputStream outBroad:list){
                    try {
                         String conver = con.replace("18", "삐삐");
                         sbTotalChat.append(conver).append(" ");
                         outBroad.writeUTF("채팅:["+ name+ "] " +conver);
                         outBroad.writeUTF("방문자수:" + count);  
                         outBroad.writeUTF("이슈:"+getIssue());
                    } catch (IOException ex) {System.out.println("serro:"+ex);}
                }
            }
        }
        
        private String wordCount(String data) {
            StringBuilder sbr = new StringBuilder();
            String[] all = data.split(" ");
 
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            for(String key : all){
                Integer value = map.get(key);
                if(value==null){
                    map.put(key,new Integer(1));
                }else{
                    map.put(key, new Integer(value.intValue() +1));
                }
            }

            Set<String> keys = map.keySet();
            ArrayList<String> list = new ArrayList<String>();
            Iterator<String> iterator = keys.iterator();
            while(iterator.hasNext()){
                    String key = iterator.next();
                    if(!key.contains("[")){
                        list.add(key);
                    }

            }
            Collections.sort(list, new Comparator<String>(){
              @Override
                public int compare(String k1, String k2) {
                        Integer v1 = map.get(k1);
                        Integer v2 = map.get(k2);
                        return v1.compareTo(v2);
                    }
                });

                Collections.reverse(list); //내림차순
                LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<String,Integer>();
             
                try{
                 for(int i=0; i<10;i++){
                      String key =list.get(i);
                      sbr.append(key).append(":");
                 }
                  }catch(IndexOutOfBoundsException e){}
                
                return sbr.toString();
    }

        private String getIssue(){
                         
                         String str=wordCount(sbTotalChat.toString()).replace("삐삐", "");
                         
                         return str;
        }

       
        
      
    } //  
}//
