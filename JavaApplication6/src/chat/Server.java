/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import com.sun.org.apache.bcel.internal.util.ByteSequence;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edu
 */
public class Server {
    ArrayList<DataOutputStream> list=new ArrayList<DataOutputStream>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new Server();
    }

    public Server() throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        System.out.println("server ready...");
        while(true){
            try{
                Socket s=ss.accept();
                ServerThread t=new ServerThread(s);
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
            this.s=s;
            out=new DataOutputStream(s.getOutputStream());
            in=new DataInputStream(s.getInputStream());
            list.add(out);
        }
        @Override
        public void run() {
            try{
                while(true){
                    broadcast(in.readUTF());
                }
            }catch(Exception e){
                try{
                    list.remove(out);
                    out.close();
                    in.close();
                    s.close();
                }catch(Exception ex){}
            }
        }        

        private void broadcast(String msg) {
            synchronized(list){
                for(DataOutputStream out:list){
                    try {
                        out.writeUTF(msg);
                    } catch (IOException ex) {

                    }
                }
            }
        }
    }    
}