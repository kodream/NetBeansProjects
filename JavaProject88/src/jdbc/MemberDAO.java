/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import common.MyException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edu
 */
public class MemberDAO {
     Connection con;
    
    public MemberDAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phones", "root", "MYSQL");
    }
    
    public  void insertMember(String []data) throws  MyException {
        
        try{    
                System.out.println("회원가입:" + data[0] + data[1]+data[2]+data[3]);
                PreparedStatement stmt = con.prepareStatement("insert into membert (mname,memail,mpw) values(?,?,?)");
                stmt.setString(1, data[1]);
                stmt.setString(2, data[2]);
                stmt.setString(3, data[3]);
                int i =  stmt.executeUpdate();
                System.out.println(i + "행이 insert되었습니다.");
                stmt.close();

        }catch(SQLException ex){
            System.out.println("server erro:" + ex);
            throw new MyException("회원가입 실패하였습니다.");
        }
    }

    public String loginMember(String[] data) throws MyException{
        try {
                PreparedStatement stmt1 = con.prepareStatement("select mname from membert where memail=? and mpw=?");
                stmt1.setString(1,data[1]);
                stmt1.setString(2, data[2]);
                ResultSet rs = stmt1.executeQuery();
                String name=null;
                if(rs.next()){
                    name=rs.getString("mname");
                }
            return name;
            
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("로그인 오류");
          }

    }

  
    public String viewList(String[] data) throws MyException{
        try {
                PreparedStatement stmt1 = con.prepareStatement("select * from phonet where pcom=?");
                stmt1.setString(1,data[1]);
                ResultSet rs = stmt1.executeQuery();
                //List<String> list = new ArrayList<String>();
                //String name=null;
                StringBuilder sb = new StringBuilder();
                while(rs.next()){
                    sb.append(rs.getString("pname")).append(":");
                }              
                sb.setLength(sb.length()-1);
                
            return sb.toString();
            
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("DB 오류");
          }
    }
    
    
    public void insertChat(String[] ptc) throws SQLException, MyException {
             try{
                PreparedStatement stmt = con.prepareStatement("insert into chatt (cname,ccon) values(?,?)");
                stmt.setString(1,ptc[1]);
                stmt.setString(2, ptc[2]);
                int i = stmt.executeUpdate();
                System.out.println(i + "행이 추가되였습니다");
                List<String> list = new ArrayList<String>();
                
                stmt.close();
               
            }catch(SQLException ex){
                System.out.println("server erro:" + ex);
                throw new MyException("채팅 추가 실패하였습니다.");
            }
    }
        

   
}
