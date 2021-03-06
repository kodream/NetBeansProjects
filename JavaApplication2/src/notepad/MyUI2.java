/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import chart.PolylineBarChart;
import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edu
 */
public class MyUI2 extends javax.swing.JFrame {

    /**
     * Creates new form MyUI
     */
    public MyUI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jFileChooser1.setCurrentDirectory(new java.io.File("D:\\"));

            jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));

            jLabel1.setText("이 내용을 분석하시겠습니까?");

            jButton2.setText("예");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("아니오");

            javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
            jDialog1.getContentPane().setLayout(jDialog1Layout);
            jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)))
                    .addContainerGap(39, Short.MAX_VALUE))
            );
            jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addContainerGap(19, Short.MAX_VALUE))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);

            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField1ActionPerformed(evt);
                }
            });

            jButton1.setText("전송");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jMenu1.setText("File");

            jMenuItem1.setText("열기");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem1);

            jMenuItem2.setText("저장");
            jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem2);

            jMenuBar1.add(jMenu1);

            jMenu2.setText("Edit");
            jMenuBar1.add(jMenu2);

            jMenu3.setText("BigData");

            jMenuItem3.setText("단어 분석");
            jMenuItem3.setToolTipText("");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
                }
            });
            jMenu3.add(jMenuItem3);

            jMenuBar1.add(jMenu3);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(20, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //버튼 이벤트  
        jTextArea1.append("button click\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //텍스트 필드 이벤트 
        jTextArea1.append(jTextField1.getText()+"\n");
        jTextField1.setText((""));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // 파일 열기 
       fileRead(); //(14)
       jDialog1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jFileChooser1.showSaveDialog(this);
        File file = jFileChooser1.getSelectedFile();
        
        try (FileWriter fw = new FileWriter(file);) { 
            fw.write(jTextArea1.getText()); 
        } catch (IOException ex) {
            Logger.getLogger(MyUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        fileRead();
        jDialog1.setVisible(true);
             
                
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
        String data = jTextArea1.getText(); 
        Map map = wordCount(data); 
        new PolylineBarChart().viewChart(map); 
    }//GEN-LAST:event_jButton2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void fileRead() { 
        jFileChooser1.showOpenDialog(this);
        
        
        File file = jFileChooser1.getSelectedFile();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file));){ 
            
            String oneLine = ""; 
            jTextArea1.setText("");
            while((oneLine=br.readLine())!=null){
                jTextArea1.append(oneLine+"\n");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyUI2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private LinkedHashMap<String, Integer> wordCount(String data) { 
        //단어를 먼저 잘라야한다.
        String [] all = data.split(" "); 
        HashMap<String, Integer> map = new HashMap<>(); 
        for(String k:all){  
            Integer v = map.get(k);
            if(v==null){ 
                map.put(k, new Integer(1));
            }else {
                map.put(k,new Integer(v.intValue()+1));
            }
        }
        
        Set<String> keys = map.keySet(); 
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(keys);
        
        
        Collections.sort(list, new Comparator<String>(){
            public int compare(String k1, String k2){
                Integer v1 = map.get(k1);
                Integer v2 = map.get(k2);
                return v1.compareTo(v2); 
            }
            
        });
        Collections.reverse(list); 
        LinkedHashMap<String, Integer> mySortMap = new LinkedHashMap<String, Integer>();
            for(int i=0;i<10;i++){
                String key = list.get(i);
                Integer value = map.get(key);
                 mySortMap.put(key,value);
            }
            return mySortMap;
        
    }
}
