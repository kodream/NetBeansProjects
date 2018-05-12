/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject77;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author edu
 */
public class LoginFrame extends javax.swing.JFrame {

     static  DataInputStream in;
     static  DataOutputStream out;
     static  Socket s;
   
    public LoginFrame() throws IOException {
        s = new Socket("192.168.120.40",9999);
        out = new DataOutputStream(s.getOutputStream());
        in = new DataInputStream(s.getInputStream());
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_joinok = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_windowclose1 = new javax.swing.JLabel();
        jDialog_joinno = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_windowclose2 = new javax.swing.JLabel();
        jPanel_base = new javax.swing.JPanel();
        jPanel_side = new javax.swing.JPanel();
        jLabel_LoginImage = new javax.swing.JLabel();
        jPanel_top = new javax.swing.JPanel();
        jLabel_windowclose = new javax.swing.JLabel();
        jPanel_bottom = new javax.swing.JPanel();
        jPanel_main = new javax.swing.JPanel();
        jPanel_login = new javax.swing.JPanel();
        jLabel_signinfor = new javax.swing.JLabel();
        jLabel_signin_email = new javax.swing.JLabel();
        jLabel_signin_email1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_signup = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel_join = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_pw = new javax.swing.JPasswordField();
        jLabel_login = new javax.swing.JLabel();
        jLabel_signinfor1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jDialog_joinok.setAlwaysOnTop(true);
        jDialog_joinok.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("멤버 등록해주셔서 감사합니다!");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/joinok.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_windowclose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window2.png"))); // NOI18N
        jLabel_windowclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_windowclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_windowclose1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel_windowclose1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_windowclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDialog_joinokLayout = new javax.swing.GroupLayout(jDialog_joinok.getContentPane());
        jDialog_joinok.getContentPane().setLayout(jDialog_joinokLayout);
        jDialog_joinokLayout.setHorizontalGroup(
            jDialog_joinokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog_joinokLayout.setVerticalGroup(
            jDialog_joinokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_joinokLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDialog_joinno.setLocationByPlatform(true);
        jDialog_joinno.setResizable(false);
        jDialog_joinno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("멤버 등록에 실패했습니다. ");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/why-us-erro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jDialog_joinno.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 180));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setInheritsPopupMenu(true);
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 80));

        jLabel_windowclose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window2.png"))); // NOI18N
        jLabel_windowclose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel_windowclose2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_windowclose2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDialog_joinno.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_side.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_LoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        jLabel_LoginImage.setText("jLabel1");

        javax.swing.GroupLayout jPanel_sideLayout = new javax.swing.GroupLayout(jPanel_side);
        jPanel_side.setLayout(jPanel_sideLayout);
        jPanel_sideLayout.setHorizontalGroup(
            jPanel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, Short.MAX_VALUE))
        );
        jPanel_sideLayout.setVerticalGroup(
            jPanel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sideLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel_LoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel_base.add(jPanel_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 320, 530));

        jPanel_top.setBackground(new java.awt.Color(0, 153, 153));
        jPanel_top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_topMouseDragged(evt);
            }
        });
        jPanel_top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_topMousePressed(evt);
            }
        });

        jLabel_windowclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window2.png"))); // NOI18N
        jLabel_windowclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_windowclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_windowcloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_topLayout = new javax.swing.GroupLayout(jPanel_top);
        jPanel_top.setLayout(jPanel_topLayout);
        jPanel_topLayout.setHorizontalGroup(
            jPanel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topLayout.createSequentialGroup()
                .addContainerGap(808, Short.MAX_VALUE)
                .addComponent(jLabel_windowclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_topLayout.setVerticalGroup(
            jPanel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_windowclose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_base.add(jPanel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        jPanel_bottom.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel_bottomLayout = new javax.swing.GroupLayout(jPanel_bottom);
        jPanel_bottom.setLayout(jPanel_bottomLayout);
        jPanel_bottomLayout.setHorizontalGroup(
            jPanel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel_bottomLayout.setVerticalGroup(
            jPanel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel_base.add(jPanel_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 537, 850, 30));

        jPanel_main.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_login.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_signinfor.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel_signinfor.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_signinfor.setText("Sign in for Phone's world");
        jPanel_login.add(jLabel_signinfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, 303, -1));

        jLabel_signin_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_signin_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/email.png"))); // NOI18N
        jPanel_login.add(jLabel_signin_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 33));

        jLabel_signin_email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_signin_email1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password2.png"))); // NOI18N
        jPanel_login.add(jLabel_signin_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 38));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_login.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 310, 40));

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel_login.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 310, 40));

        jLabel_signup.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel_signup.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_signup.setText("회원가입");
        jLabel_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_signupMousePressed(evt);
            }
        });
        jPanel_login.add(jLabel_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 60, 20));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("로그인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_login.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 40));

        jPanel_join.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user2.png"))); // NOI18N

        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/email.png"))); // NOI18N

        jTextField_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password2.png"))); // NOI18N

        jPasswordField_pw.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel_login.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel_login.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_login.setText("로그인");
        jLabel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_loginMousePressed(evt);
            }
        });

        jLabel_signinfor1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel_signinfor1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_signinfor1.setText("Sign up for Phone's world");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("회원가입");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_joinLayout = new javax.swing.GroupLayout(jPanel_join);
        jPanel_join.setLayout(jPanel_joinLayout);
        jPanel_joinLayout.setHorizontalGroup(
            jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_joinLayout.createSequentialGroup()
                .addGroup(jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_joinLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_joinLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField_pw))
                            .addGroup(jPanel_joinLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_joinLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_joinLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel_signinfor1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_joinLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_joinLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_joinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_login)
                .addGap(155, 155, 155))
        );
        jPanel_joinLayout.setVerticalGroup(
            jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_joinLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel_signinfor1)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Name)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_email)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel_joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField_pw))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel_login)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_mainLayout = new javax.swing.GroupLayout(jPanel_main);
        jPanel_main.setLayout(jPanel_mainLayout);
        jPanel_mainLayout.setHorizontalGroup(
            jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_login, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_mainLayout.createSequentialGroup()
                    .addComponent(jPanel_join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_mainLayout.setVerticalGroup(
            jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_login, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
            .addGroup(jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_mainLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel_base.add(jPanel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       int lx,ly;
    private void jPanel_topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_topMousePressed
        // TODO add your handling code here:
        lx = evt.getX();
        ly = evt.getY();
    }//GEN-LAST:event_jPanel_topMousePressed

    private void jPanel_topMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_topMouseDragged
        // TODO add your handling code here:
        int lxx = evt.getXOnScreen();
        int lyy = evt.getYOnScreen();
        this.setLocation(lxx-lx, lyy-ly);
    }//GEN-LAST:event_jPanel_topMouseDragged
  
    private void jLabel_windowcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_windowcloseMousePressed
        // windows closing
        System.exit(0);
    }//GEN-LAST:event_jLabel_windowcloseMousePressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // LoginFrame 
        jPanel_login.setVisible(true);
        jPanel_join.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMousePressed
        // 회원가입란에서 로그인 라벨 클릭시
        jPanel_login.setVisible(true);
        jPanel_join.setVisible(false);
    }//GEN-LAST:event_jLabel_loginMousePressed

    private void jLabel_signupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_signupMousePressed
        // 로그인 화면에서 회원가입으로 넘어갈때
         jPanel_login.setVisible(false);
         jPanel_join.setVisible(true);
    }//GEN-LAST:event_jLabel_signupMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
             // 회원가입
             if(s==null){
                 s = new Socket("192.168.120.40",9999);
                 out = new DataOutputStream(s.getOutputStream());
                 in = new DataInputStream(s.getInputStream());
             }
         } catch (SocketException ex) {
             Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        String name = jTextField_Name.getText();
        String email = jTextField_email.getText();
        char[] pwch = jPasswordField_pw.getPassword();
        String pw =String.copyValueOf(pwch);
        System.out.println(pw);
       
        if(name !=null && !name.equals("")&&email !=null && !email.equals("")&& pw!=null && !pw.equals("")){
            try {
                 System.out.println("2:"+"회원가입:" + name +":" + email + ":" +pw);
                out.writeUTF("회원가입:" + name +":" + email + ":" +pw);
                System.out.println("1:"+"회원가입:" + name +":" + email + ":" +pw);
                String msg = in.readUTF();
                if(msg.equals("join_ok")){
                     JOptionPane.showMessageDialog(this, "회원가입되셨습니다.");
                }else{
                    JOptionPane.showMessageDialog(this, msg);
                }
                jTextField_Name.setText("");
                jTextField_email.setText("");
                jPasswordField_pw.setText("");
            } catch (IOException ex) {
                 System.out.println("erro"+ex);
            }
           
        }else{
            JOptionPane.showMessageDialog(this, "입력내용을 확인하세요");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel_windowclose1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_windowclose1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel_windowclose1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
             // 로그인
             if(s==null){
             s = new Socket("192.168.120.40",9999);
             out = new DataOutputStream(s.getOutputStream());
             in = new DataInputStream(s.getInputStream());
             }
         } catch (IOException ex) {
             Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         String email = jTextField2.getText();
         char[] pwch = jPasswordField1.getPassword();
      
         String pw =String.copyValueOf(pwch);
         if(email !=null && !email.equals("")&& pw!=null && !pw.equals("")){
            try {
                out.writeUTF("로그인:" + email + ":" +pw);
                String msg = in.readUTF();
                String[] ptc = msg.split(":");
                if(ptc[0].equals("login_ok")){
                      //new MainJFrame (this,s,out,in,ptc[1]).setVisible(true);
                      new MainJFrame (this,ptc[1]).setVisible(true);
                      this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, msg);
                }
                jTextField2.setText("");
                jPasswordField1.setText("");
            } catch (IOException ex) {
                System.out.println("erro"+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "입력내용을 확인하세요");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
      
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog_joinno;
    private javax.swing.JDialog jDialog_joinok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_LoginImage;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_signin_email;
    private javax.swing.JLabel jLabel_signin_email1;
    private javax.swing.JLabel jLabel_signinfor;
    private javax.swing.JLabel jLabel_signinfor1;
    private javax.swing.JLabel jLabel_signup;
    private javax.swing.JLabel jLabel_windowclose;
    private javax.swing.JLabel jLabel_windowclose1;
    private javax.swing.JLabel jLabel_windowclose2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_base;
    private javax.swing.JPanel jPanel_bottom;
    private javax.swing.JPanel jPanel_join;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JPanel jPanel_side;
    private javax.swing.JPanel jPanel_top;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField_pw;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_email;
    // End of variables declaration//GEN-END:variables
}
