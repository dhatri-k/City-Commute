package city_commute;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SUHANEE PATEL
 */
public class homeScreen extends javax.swing.JFrame {

    /**
     * Creates new form homeScreen
     */
    public homeScreen() {
        initComponents();
         this.setSize(1020, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 730));

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home1.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 0, 800, 600);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/temp.JPG"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 480);

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("login");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 610, 180, 70);

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("visit");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 610, 170, 70);

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("sign-up");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 610, 240, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/themecolor.JPG"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 480, 1000, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String dbURL = "jdbc:mysql://localhost:3306/oopproject";

            con = DriverManager.getConnection(dbURL, "root", "");

            Statement stmt = con.createStatement();

            String insertString = "UPDATE `visit` SET `cust`='0',`pickup`='0',`drop_l`='0',`distance`='0'";
            int j = stmt.executeUpdate(insertString);
              String insertString1 = "DELETE FROM `profile2`";
            int k = stmt.executeUpdate(insertString1);
            if (j == 1) {
                System.out.println("Updated  successfully.");
                signUp s = new signUp();
                s.setVisible(true);
                this.setVisible(false);
                this.dispose();

            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
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

           String insertString = "UPDATE `visit` SET `cust`='0',`pickup`='0',`drop_l`='0',`distance`='0'";
            int j = stmt.executeUpdate(insertString);
            
            String insertString1 = "DELETE FROM `profile2`";
            int k = stmt.executeUpdate(insertString1);

            
                System.out.println("Updated successfully.");
                //close();
                login l = new login();
                this.setVisible(false);
                this.dispose();
                l.setVisible(true);

            
        } catch (Exception e) {

        }

//        login l=new login();
//         this.setVisible(false);
//         this.dispose();
//        l.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/oopproject";
            con = DriverManager.getConnection(dbURL, "root", "");
            Statement stmt = con.createStatement();
//String insertString = "INSERT INTO profile2 VALUES ('" + name + "','"+0+"','"+0+"','"+0+"','"+0+"','"+0+"')";
            String insertString = "UPDATE `visit` SET `cust`='1',`pickup`='0',`drop_l`='0',`distance`='0'";
            int j = stmt.executeUpdate(insertString);
            String insertString1 = "DELETE FROM `profile2`";
            int k = stmt.executeUpdate(insertString1);
            if (j == 1 ) {
                System.out.println("Updated  successfully.");
//                loginHome x = new loginHome();
//                x.setVisible(true);
//                this.setVisible(false);
//                this.dispose();

            }
        } catch (Exception e) {
            System.out.println(" " + e);
        }

        loginHome x = new loginHome();
        x.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
