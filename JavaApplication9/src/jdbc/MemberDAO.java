/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/**
 *
 * @author edu
 */
public class MemberDAO {
    Connection con;
    
    public MemberDAO() throws ClassNotFoundException, SQLException {
         //1드라이버 등록
        Class.forName("com.mysql.jdbc.Driver");
        //2드라이버 연결
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MYSQL");
    }
    
    public  void insertMember(String []data) throws  MyException {
        //jdbc 6
       try{
            //3스테이트먼트 얻기(sql을 실어나르는 상자:)
            Statement stmt = con.createStatement();
            //4 sql 전송 //resultSet은 결과가 담긴 상자 이터레이터 형식

          int i =  stmt.executeUpdate("insert into member (name,id,pw) values('" + data[1]+ "','" + data[2]+"','"  + data[3] +"');");
           System.out.println(i + "행이 insert되었습니다.");
           //5결과 받기
            stmt.close();

        }catch(SQLException ex){
            ex.printStackTrace();
            throw new MyException("회원가입오류");
        }
    
    }

    public String loginMember(String[] data) throws MyException{
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM member WHERE id='" + data[1]+ "' and pw='"+data[2]+"'");
            
            String name=null;
            if(rs.next()){
                name=rs.getString("name");
               // System.out.println("name:"+name);
            }
            
            return name;
            
//"       if(rs.next()){\n" +
//"           String name = rs.getString(\"name\");\n" +
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("로그인 오류");
        }

    }

    public String login(String[] all) throws MyException{
       try{      //3스테이트먼트 얻기(sql을 실어나르는 상자:)
          /*
                PreparedStatement pstmt = con.prepareStatement("UPDATE EMPLOYEES
                                     SET SALARY = ? WHERE ID = ?");*/
           // Statement stmt = con.createStatement();
           PreparedStatement stmt = con.prepareStatement("select name from member where id =? and pw =?");
            //4 sql 전송 //resultSet은 결과가 담긴 상자 이터레이터 형식
          //  ResultSet rs =  stmt.executeQuery("select name from member where id ='" + all [1] + "'and pw ='" + all[2]+ "';");
          stmt.setString(1,all[1]);
          stmt.setString(2,all[2]);
          ResultSet rs =  stmt.executeQuery();
           //5결과 받기
            String name = null;
            if(rs.next()){
               name = rs.getString("name");
             }
            rs.close();
            stmt.close();

            return name;
       } catch(SQLException ex){
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("경고:로그인 오류");
       }
    }
}
