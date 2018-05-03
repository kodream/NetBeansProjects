/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.BasketDAO;
import jdbc.MemberDAO;
import jdbc.MyException;
import jdbc.ShopDAO;

/**
 *
 * @author edu
 */
public class Server {
    
    ShopDAO dao ;
    MemberDAO mdao;
    BasketDAO bdao;
    Server() throws IOException, ClassNotFoundException, SQLException{
        dao = new ShopDAO();
        mdao = new MemberDAO();
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("shop server ready..");
        bdao = new BasketDAO();
        
        while(true){
            try{
                Socket s = ss.accept();
            ServerThread t = new ServerThread(s);
            t.start();
            }catch(IOException e){
                
            }
            
        }
    }
    
    
    class ServerThread extends Thread{
        Socket s;
        DataOutputStream out;
        DataInputStream in;
        
        private ServerThread(Socket s) throws IOException {
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
        }

        @Override
        public void run() {
            
                try {
                    while(true){
                        String req = in.readUTF();
                        
                        if(req.equals("g7_상세보기")){
                            out.writeUTF(dao.getInfo(1));
                        }else if(req.equals("iphonex_상세보기")){
                            out.writeUTF(dao.getInfo(2));
                        }else if(req.equals("s9_상세보기")){
                            out.writeUTF(dao.getInfo(3));
                        }else if (req.startsWith("회원가입")){
                            String[] all = req.split(":");
                            try{
                                mdao.insertMember(all);
                                out.writeUTF("회원가입 OK");
                            }catch(MyException e){
                                out.writeUTF(e.getMessage());
                            }
                            
                        }else if (req.startsWith("로그인")){
                            String[] all = req.split(":");
                            try{
                               String name =  mdao.login(all);
                               if(name!=null){
                                   out.writeUTF("[" + name + "]님 환영합니다.");
                               }else
                                   out.writeUTF("경고:회원가입하거나 ID/PW를 확인하세요");
                            }catch(MyException e){
                                out.writeUTF(e.getMessage());
                            }
                            
                        }else if(req.startsWith("장바구니 넣기")){
                            String[] all = req.split(":");
                            try{
                                String msg = bdao.insertBasket(all);
                                out.writeUTF(msg);
                            }catch(MyException e){
                                out.writeUTF(e.getMessage());
                            }
                        }
                        /*s
                        else if(req.startsWith("로그인")){                         
                            String[] all = req.split(":");
                            try{
                                String name=mdao.loginMember(all);
                                if(name==null){
                                    out.writeUTF("회원가입하시거나 ID/PW를 확인하세요");
                                }else{
                                    out.writeUTF(name+"님 환영합니다");
                                }
                               // out.writeUTF("회원가입 OK");
                            }catch(MyException e){
                                out.writeUTF(e.getMessage());
                            }
                        }*/
                    }
                } catch (Exception e) { 
                    
                }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        // TODO code application logic here
        new Server();
    }
    
}
