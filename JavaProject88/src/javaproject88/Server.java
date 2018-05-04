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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.MemberDAO;

/**
 *
 * @author edu
 */
public class Server {
    MemberDAO mdao;

    public Server() throws IOException, ClassNotFoundException, SQLException {
        mdao= new MemberDAO();
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("server ready..");
        Socket s = ss.accept();
        ServerThread st = new ServerThread(s);
        st.start();
    }

    class ServerThread extends Thread {

            DataOutputStream out;
            DataInputStream in;
            

            @Override
            public void run() {
                try{
                    while(true){
                        String req =in.readUTF();
                        String[] ptc = req.split(":");
                        service(ptc);
                    }
                }catch (Exception e){

                }


            }
        
            public ServerThread(Socket s) throws IOException {
                out = new DataOutputStream(s.getOutputStream());
                in = new DataInputStream(s.getInputStream());
            }

            private void service(String[] ptc) throws MyException, IOException {
                switch(ptc[0]){
                    case "회원가입":
                                    try {
                                        mdao.insertMember(ptc);
                                        out.writeUTF("join_ok");
                                    } catch (MyException e) {
                                        out.writeUTF(e.getMessage());
                                    }  
                                    break;
                    case "로그인":
                                     try {
                                        mdao.loginMember(ptc);
                                        out.writeUTF("login_ok");
                                    } catch (MyException e) {
                                        out.writeUTF(e.getMessage());
                                    }  
                                     break;
                    case "로그아웃":
                    case "제조사":
                                    try {
                                        List<String> list = new ArrayList<String>();
                                                list =mdao.viewList(ptc);
                                        String str="";
                                                for(String s:list){
                                            str=str + ":"+ s;
                                        }
                                        out.writeUTF(str);
                                    } catch (MyException e) {
                                        out.writeUTF(e.getMessage());
                                    }  
                                    break;
                    case "모델명":
                                try {
                                        mdao.viewPhone(ptc);
                                        out.writeUTF("login_ok");
                                    } catch (MyException e) {
                                        out.writeUTF(e.getMessage());
                                    }  
                                break;
                    case "채팅":
                }
            }
    }   
}
