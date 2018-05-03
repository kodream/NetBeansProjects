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
public class BasketDAO {
    Connection con;
    
    public BasketDAO() throws ClassNotFoundException, SQLException {
         //1드라이버 등록
        Class.forName("com.mysql.jdbc.Driver");
        //2드라이버 연결
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MYSQL");
    }
    
    public  String insertBasket(String []data) throws  MyException {
       
       try{
            PreparedStatement stmt1 = con.prepareStatement("select quantity from basket where productNo=? and id=?");
            int productNo = Integer.parseInt(data[1]);
            stmt1.setInt(1,productNo);
            stmt1.setString(2, data[2]);
            ResultSet rs = stmt1.executeQuery();
            if(rs.next()){//장바구니에 이미 이 상품이 들어있는 경우
                int quantity = rs.getInt("quantity");//stmt 재사용 안됨
                PreparedStatement stmt2 = con.prepareStatement("update basket set quantity=? where productNo=? and id=?");
                int addNo = Integer.parseInt(data[3]);
                stmt2.setInt(1, quantity+addNo);
                stmt2.setInt(2, productNo);
                stmt2.setString(3, data[2]);
                int i = stmt2.executeUpdate();
                System.out.println(i + "행이 업데이트 되었습니다.");
                stmt2.close();
            }else{//장바구니에 이 상품을 처음 넣는 경우
                PreparedStatement stmt = con.prepareStatement("insert into basket (productNo,id,quantity) values(?,?,1)");
                stmt.setInt(1, productNo);
                stmt.setString(2, data[2]);
                int i =  stmt.executeUpdate();
                System.out.println(i + "행이 insert되었습니다.");
                stmt.close();
            }
            
            rs.close();
            stmt1.close();
            
            return selectAllBasket(data[2]);
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new MyException("장바구니 처리오류");
        }
    
    }

    public String selectAllBasket(String id) throws MyException {
        try {
            PreparedStatement stmt = con.prepareStatement("select * from basket where id=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            StringBuilder sb = new StringBuilder(id + "님의 장바구니 내역\n");
            while(rs.next()){
                int productNo = rs.getInt("productNo");
                int quantity = rs.getInt("quantity");
                switch(productNo){
                    case 1: sb.append("상품명:LG G7 \t 수량:");
                    break;
                    case 2: sb.append("상품명:iPhone X \t 수량:");
                    break;
                    case 3: sb.append("상품명:Sumsung S9 \t 수량:");
                    break;
                }
                sb.append(quantity).append("\n");
            }
            
            rs.close();
            stmt.close();
            
            return sb.toString();
            
        } catch (SQLException ex) {
            Logger.getLogger(BasketDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new MyException("장바구니 보기 오류");
        }
        
    }

    
}
