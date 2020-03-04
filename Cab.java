package city_commute;


import java.sql.*;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nancy Radadia
 */
public class Cab extends javax.swing.JFrame {

    String cost;
    String time;
    String cab;

    /**
     * Creates new form Cab
     */
    public Cab() {
        initComponents();
       this.setSize(1020, 750);
        this.setResizable(false);
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
        group.add(jRadioButton4);
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oopproject", "root", "");
            Statement stmt = conn.createStatement();

            ResultSet rs1 = stmt.executeQuery("SELECT * FROM `profile2`");
            if (rs1.next()) {
                String name = rs1.getString("name");
                jLabel16.setText(name);
            }
            ResultSet rs2 = stmt.executeQuery("select `cust` from visit;");
            while (rs2.next()) {
                String cust = rs2.getString("cust");
                jLabel18.setText(cust);
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            //System.out.println("connection was not established ");
        }

        String str = jLabel18.getText();
        String str2 = "0";
        boolean check = str.equals(str2);

        if (check) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/oopproject", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from profile2 where name='" + jLabel16.getText() + "';");
                if (rs.next()) {
                   String dis = rs.getString("distance");
                    double x = Double.parseDouble(dis);
                    int price1 = (int)Math.round(x * 30);
                    String final_p1 = Integer.toString(price1);
                    jLabel8.setText( final_p1);
                    int t1 = (int)Math.round(x * 1.40);
                    String t2 = Integer.toString(t1);
                    jLabel5.setText(t2 + " min");

                    int price2 = (int)Math.round(x * 22);
                    String final_p2 = Integer.toString(price2);
                    jLabel9.setText( final_p2);
                    double t3 = Math.round(x * 1.15);
                    String t4 = Double.toString(t3);
                    jLabel12.setText(t4 + " min");

                    int price3 = (int)Math.round(x * 45);
                    String final_p3 = Integer.toString(price3);
                    jLabel10.setText(final_p3);
                    double t5 = Math.round(x * 2.30);
                    String t6 = Double.toString(t5);
                    jLabel14.setText(t6 + " min");

                    int price4 = (int)Math.round(x * 35);
                    String final_p4 = Integer.toString(price4);
                    jLabel11.setText( final_p4);
                    double t7 = Math.round(x * 2.0);
                    String t8 = Double.toString(t7);
                    jLabel15.setText(t8 + " min");
                }
                stmt.close();
                con.close();
            } catch (Exception e) {
                //System.out.println("connection was not established " + e);
            }
        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/oopproject", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from visit where cust='" + jLabel18.getText() + "';");
                if (rs.next()) {
                   String dis = rs.getString("distance");
                    double x = Double.parseDouble(dis);
                    int price1 = (int)Math.round(x * 30);
                    String final_p1 = Integer.toString(price1);
                    jLabel8.setText( final_p1);
                    int t1 = (int)Math.round(x * 1.40);
                    String t2 = Integer.toString(t1);
                    jLabel5.setText(t2 + " min");

                    int price2 = (int)Math.round(x * 22);
                    String final_p2 = Integer.toString(price2);
                    jLabel9.setText( final_p2);
                    double t3 = Math.round(x * 1.15);
                    String t4 = Double.toString(t3);
                    jLabel12.setText(t4 + " min");

                    int price3 = (int)Math.round(x * 45);
                    String final_p3 = Integer.toString(price3);
                    jLabel10.setText(final_p3);
                    double t5 = Math.round(x * 2.30);
                    String t6 = Double.toString(t5);
                    jLabel14.setText(t6 + " min");

                    int price4 = (int)Math.round(x * 35);
                    String final_p4 = Integer.toString(price4);
                    jLabel11.setText( final_p4);
                    double t7 = Math.round(x * 2.0);
                    String t8 = Double.toString(t7);
                    jLabel15.setText(t8 + " min");
                }
                stmt.close();
                con.close();
            } catch (Exception e) {
                //System.out.println("connection was not established " + e);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 730));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 153));
        jLabel3.setText("CHOOSE YOUR RIDE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 98, 570, 63);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel8.setText("200");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 460, 170, 41);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel9.setText("130");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 460, 160, 41);

        jLabel10.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel10.setText("220");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(520, 460, 180, 41);

        jLabel11.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel11.setText("250");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(770, 450, 180, 41);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel5.setText("-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(48, 385, 166, 44);

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel12.setText("-");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 390, 186, 44);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel14.setText("-");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 390, 180, 44);

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel15.setText("-");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(770, 380, 180, 44);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 620, 10, 20);

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("PRIME SEDAN");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(20, 330, 210, 39);

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("MINI");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(300, 330, 121, 40);

        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("LUX");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(520, 330, 115, 40);

        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("PRIME SUV");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(750, 330, 190, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sedan.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 170, 84);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Mini_f.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 200, 170, 84);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Luxary_f.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 200, 171, 84);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Suv.PNG"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(740, 200, 183, 84);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 153));
        jLabel17.setText("BOOK NOW");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(376, 566, 215, 59);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(870, 620, 0, 0);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/suhu11.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(940, 10, 50, 45);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/suhu10.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20);
        jLabel20.setBounds(870, 10, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/capture2.JPG"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        cost = jLabel8.getText();
        time = jLabel5.getText();
        cab = "Prime Sedan";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        cost = jLabel9.getText();
        time = jLabel12.getText();
        cab = "Mini";

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        cost = jLabel10.getText();
        time = jLabel14.getText();
        cab = "Lux";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        cost = jLabel11.getText();
        time = jLabel15.getText();
        cab = "Prime Suv";
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject", "root", "");
            Statement stmt = conn.createStatement();

            String str = jLabel18.getText();
            String str2 = "0";
            boolean check = str.equals(str2);
            if (check) {

                String insertString = "UPDATE profile2 SET cost = '" + cost + "',time = '" + time + "',cab_type=' " + cab + " ' " + "WHERE name = '" + jLabel16.getText() + "'";
                int i = stmt.executeUpdate(insertString);
                cabConfirm x = new cabConfirm();
                x.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "First SignUp");
            }

        } catch (Exception e) {
            System.out.println("Improper connection" + e);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        modes x = new modes();
        x.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        loginHome x = new loginHome();
        x.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
