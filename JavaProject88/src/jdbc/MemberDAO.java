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
import java.sql.Statement;
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
                PreparedStatement stmt = con.prepareStatement("insert into membert (mbname,mbemail,mbpw) values(?,?,?)");
                stmt.setString(1, data[1]);
                stmt.setString(2, data[2]);
                stmt.setString(3, data[3]);
                int i =  stmt.executeUpdate();
               // System.out.println(i + "행이 insert되었습니다.");
                stmt.close();
//       try{
//            Statement stmt = con.createStatement();
//            int i =  stmt.executeUpdate("insert into membert (mbname,mbemail,mbpw) values('" + data[1]+ "','" + data[2]+"','"  + data[3] +"');");
//            System.out.println(i + "행이 insert되었습니다.");
//            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new MyException("회원가입 실패하였습니다.");
        }
    }

    public String loginMember(String[] data) throws MyException{
        try {
               // System.out.println(data[2]);
                // System.out.println("err-01");
                PreparedStatement stmt1 = con.prepareStatement("select mbname from membert where mbemail=? and mbpw=?");
                //int productNo = Integer.parseInt(data[1]);
               // System.out.println("err-02");
                stmt1.setString(1,data[1]);
                stmt1.setString(2, data[2]);
                ResultSet rs = stmt1.executeQuery();
                //System.out.println("err-03");
                String name=null;
                if(rs.next()){
                    name=rs.getString("mbname");
                }
            
            return name;
            
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("로그인 오류");
          }

    }

    
    public List<String> viewList(String[] data) throws MyException{
        try {
                //System.out.println(data[1]);
                // System.out.println("err-01");
                PreparedStatement stmt1 = con.prepareStatement("select * from phonet where pcom=?");
                //int productNo = Integer.parseInt(data[1]);
                //System.out.println("err-02");
                stmt1.setString(1,data[1]);
                //stmt1.setString(2, data[2]);
                ResultSet rs = stmt1.executeQuery();
                List<String> list = new ArrayList<String>();
               // System.out.println("err-03");
                String name=null;
                while(rs.next()){
                    //list.add(rs.getString("pname"));
                   
                
                   // name=rs.getString("pname");
                    list.add(rs.getString("pname"));
                }
//                for(String str:list){
//                    System.out.println(str);
//                }
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("로그인 오류");
          }

    }
    
    public void viewPhone(String[] data) throws MyException{
    
    }
        

   
}
