/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author edu
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ShopUI().setVisible(true);
    }
    
}
