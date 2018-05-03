/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.sql.SQLException;
import sun.applet.Main;

/**
 *
 * @author edu
 */
public class ShopDAO {
    Connection con;
    
    public ShopDAO() throws ClassNotFoundException, SQLException {
         //1드라이버 등록
        Class.forName("com.mysql.jdbc.Driver");
        //2드라이버 연결
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MYSQL");
    }
    
    public  String getInfo(int productNo) throws ClassNotFoundException, SQLException {
        //jdbc 6
       
        //3스테이트먼트 얻기(sql을 실어나르는 상자:)
        Statement stmt = con.createStatement();
        //4 sql 전송 //resultSet은 결과가 담긴 상자 이터레이터 형식
       ResultSet rs =  stmt.executeQuery("select * from shop where productNo=" + productNo);
       //5결과 받기
       String data = "";
       if(rs.next()){
           String name = rs.getString("name");
           String price = rs.getString("price");
           String color = rs.getString("color");
           String size = rs.getString("size");
           
           data = "상품명" + name + "\n가격:" + price + "\n색상:" + color + "\n사이즈:" + size;
       }
       //6스트림은 수도꼭지 다루듯이 잠궈줘야함
       rs.close();
       stmt.close();
       
       return data;
    }
}
