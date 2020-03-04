package city_commute;



import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;

public class Edit_profile extends javax.swing.JFrame {

    /**
     * Creates new form Edit_profile
     */
    public Edit_profile() {
        initComponents();
       this.setSize(1020, 750);

        Connection con = null;
        try {
            //LOAD THE JDBC DRIVER FOR MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            //OBTAIN DATABASE CONNECTION
            String dbURL = "jdbc:mysql://localhost:3306/oopproject";
            //STEP-2 Obtain a connection with the Database
            con = DriverManager.getConnection(dbURL, "root", "");
            //Step-3 - Create a Statement to encapsulate SQL query 
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM `profile2`");

            if (rs1.next()) {
                String name1 = rs1.getString("name");
                jLabel7.setText(name1);
            }
            ResultSet rs2 = stmt.executeQuery("select * from user where name='" + jLabel7.getText() + "';");
            if (rs2.next()) {

                jTextField1.setText(rs2.getString("name"));
                jTextField3.setText(rs2.getString("user_ID"));
                jTextField5.setText(rs2.getString("password"));
                jTextField4.setText(rs2.getString("email_ID"));
                jTextField2.setText(rs2.getString("phone_no"));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception caught --> " + e);

        }

    }

    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 730));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel1.setText("NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 134, 51);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel2.setText("PHONE NO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 146, 47);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel4.setText("USER ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 200, 138, 59);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel3.setText("EMAIL ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 290, 128, 60);

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(273, 30, 300, 56);

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(273, 120, 300, 53);

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(273, 200, 300, 59);

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(273, 290, 300, 60);

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(273, 380, 300, 54);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 380, 156, 54);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Capture3.JPG"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 650, 480);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel7KeyReleased(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 0, 167, 49);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 110, 650, 480);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 153));
        jLabel9.setText("       WANT TO EDIT PROFILE ?");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 40, 580, 60);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 153));
        jLabel11.setText("UPDATE");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(186, 628, 182, 46);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 153));
        jLabel12.setText("VIEW CHANGES");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(551, 630, 285, 42);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/suhu11.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(940, 0, 50, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/capture2.JPG"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1010, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel7KeyReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Connection con = null;
        try {
            //LOAD THE JDBC DRIVER FOR MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            //OBTAIN DATABASE CONNECTION
            String dbURL = "jdbc:mysql://localhost:3306/oopproject";
            //STEP-2 Obtain a connection with the Database
            con = DriverManager.getConnection(dbURL, "root", "");
            //Step-3 - Create a Statement to encapsulate SQL query 
            Statement stmt = con.createStatement();
            // view_profile profile = new view_profile();
            String uname = jTextField1.getText();
            // new view_profile(uname).setVisible(true);
            //profile(uname).setVisivble(true);
            String ID = jTextField3.getText();
            String pass = jTextField5.getText();
            //String con_pass = jPasswordField2.getText();
            int x = Integer.parseInt(ID);
            String email = jTextField4.getText();
            String no = jTextField2.getText();

            String insertString = "UPDATE user SET name = '" + uname + "',user_ID = '" + x + "',password = '" + pass + "',email_ID = '" + email + "',phone_no = '" + no + "'" + "WHERE name = '" + jLabel7.getText() + "'";
            int j = stmt.executeUpdate(insertString);
            if (j == 1) {
                System.out.println("Updated  successfully.");

            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception caught --> " + e);

        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        loginHome x = new loginHome();
        x.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Edit_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}