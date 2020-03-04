package city_commute;



import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SUHANEE PATEL
 */
public class Map extends javax.swing.JFrame {

    ArrayList name = new ArrayList();
    boolean go = false;
    int q1, q2, w1, w2;

    public Map() {
        initComponents();
         this.setSize(1020, 750);
        this.data();
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oopproject", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM `profile2`");
            while (rs1.next()) {
                String name = rs1.getString("name");
                jLabel5.setText(name);
            }
            ResultSet rs2 = stmt.executeQuery("select `cust` from visit;");
            while (rs2.next()) {
                String cust = rs2.getString("cust");
                jLabel10.setText(cust);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        if (go) {
            g.setColor(new Color(240, 16, 152));
            g.fillOval(q1, q2, 15, 15);//gota
            g.fillOval(w1, w2, 15, 15);//sola
            //g.drawLine(q1, q2, w1, w2);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 730));
        setPreferredSize(new java.awt.Dimension(1020, 720));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mapimg.JPG"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 580, 570);

        jTextField1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(630, 110, 350, 100);

        jTextField2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(630, 270, 350, 90);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("GO");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 400, 80, 40);

        jTextField3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(630, 520, 350, 90);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("SELECT MODE");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(670, 620, 280, 70);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("Map of Ahmedabad City");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 580, 300, 50);

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("to");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 230, 60, 30);

        jLabel7.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("from");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(770, 60, 80, 40);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("distance");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 470, 140, 40);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(910, 30, 10, 0);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 640, 0, 0);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/suhu11.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(930, 10, 50, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/capture2.JPG"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                jTextField1.setText(jTextField1.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        String txt = jTextField1.getText();
                        Complete(txt);
                    }
                });
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                jTextField2.setText(jTextField2.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        String txt2 = jTextField2.getText();
                        Complete2(txt2);
                    }
                });
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        data();
        go = true;
        repaint();
        data2();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(new java.awt.Color(255, 102, 255));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));

    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));

    }//GEN-LAST:event_jLabel1MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        String str = jLabel10.getText();
        String str2 = "0";
        boolean check = str.equals(str2);
        Connection con = null;
        if (check) {
            try {

                Class.forName("com.mysql.jdbc.Driver");

                String dbURL = "jdbc:mysql://localhost:3306/oopproject";

                con = DriverManager.getConnection(dbURL, "root", "");

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from route_details_2 where pickup_location='" + jTextField1.getText() + "' AND drop_location='" + jTextField2.getText() + "';");
                while (rs.next()) {
                    jTextField3.setText(rs.getString("distance"));
                    String insertString = "UPDATE profile2 SET name = '" + jLabel5.getText() + "',pickup = '" + jTextField1.getText() + "',drop_l = '" + jTextField2.getText() + "',distance = '" + rs.getString("distance") + "'" + "WHERE name = '" + jLabel5.getText() + "'";
                    int j = stmt.executeUpdate(insertString);
                    if (j == 1) {
                        System.out.println("Successfull");
                       
                    }
                     modes x = new modes();
                     x.setVisible(true);
                     this.setVisible(false);
                     this.dispose();
                }
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Exception caught --> " + e);
            }
        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver");

                String dbURL = "jdbc:mysql://localhost:3306/oopproject";

                con = DriverManager.getConnection(dbURL, "root", "");

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from route_details_2 where pickup_location='" + jTextField1.getText() + "' AND drop_location='" + jTextField2.getText() + "';");

                while (rs.next()) {
                    jTextField3.setText(rs.getString("distance"));

                    String insertString = "UPDATE visit SET cust = '" + jLabel10.getText() + "',pickup = '" + jTextField1.getText() + "',drop_l = '" + jTextField2.getText() + "',distance = '" + rs.getString("distance") + "'" + "WHERE cust = '" + jLabel10.getText() + "'";
                    int j = stmt.executeUpdate(insertString);

                    if (j == 1) {
                        System.out.println("Successfull for visit");
                        modes x = new modes();
                        x.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }

                }

                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Exception caught --> " + e);
            }
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        loginHome x = new loginHome();
        x.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
private void data() {
        Connection con = null;
        System.out.println("data()");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/oopproject";
            con = DriverManager.getConnection(dbURL, "root", "");
            Statement stmt = con.createStatement();

            String sql = "select * from location_1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String l = rs.getString("Location");
                //System.out.println("x = " + x);
                name.add(l);
            }
            String a = jTextField1.getText();
            String x = "SELECT x,y FROM location_1 WHERE Location = '" + a + "'";
            ResultSet rs1 = stmt.executeQuery(x);
            while (rs1.next()) {
                int x1 = rs1.getInt("x");
                int y1 = rs1.getInt("y");
                System.out.println(x1);
                q1 = x1;
                q2 = y1;
            }
            String b = jTextField2.getText();
            String y = "SELECT x,y FROM location_1 WHERE Location = '" + b + "'";
            ResultSet rs2 = stmt.executeQuery(y);
            while (rs2.next()) {
                int x2 = rs2.getInt("x");
                int y2 = rs2.getInt("y");
                System.out.println(x2);
                w1 = x2;
                w2 = y2;
            }
            rs.close();
            rs1.close();
            rs2.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Exception caught --> " + e);
            e.printStackTrace();
        }

    }

    private void data2() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/oopproject";
            con = DriverManager.getConnection(dbURL, "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT distance FROM route_details_2 WHERE pickup_location = '" + jTextField1.getText() + "' AND drop_location= '" + jTextField2.getText() + "'");
            while (rs.next()) {
                jTextField3.setText(rs.getString("distance") + " kms");

            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Complete(String txt) {
        String comp = "";
        int start = txt.length();
        int last = txt.length();
        int a;
        for (a = 0; a < name.size(); a++) {
            if (name.get(a).toString().startsWith(txt)) {
                comp = name.get(a).toString();
                last = comp.length();
                break;
            }
        }
        if (last > start) {
            jTextField1.setText(comp);
            jTextField1.setCaretPosition(last);
            jTextField1.moveCaretPosition(start);
        }
    }

    public void Complete2(String txt2) {
        String comp = "";
        int start = txt2.length();
        int last = txt2.length();
        int a;
        for (a = 0; a < name.size(); a++) {
            if (name.get(a).toString().startsWith(txt2)) {
                comp = name.get(a).toString();
                last = comp.length();
                break;
            }
        }
        if (last > start) {
            jTextField2.setText(comp);
            jTextField2.setCaretPosition(last);
            jTextField2.moveCaretPosition(start);
        }
    }
}
