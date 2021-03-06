/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Wrapper;
import javax.swing.JOptionPane;
import static pkg412project.newuser.DB_URL;

/**
 *
 * @author Keenan
 */
public class newUserFrame extends javax.swing.JApplet {

    /**
     * Initializes the applet newUserFrame
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        txtLN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMI = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("New User Registration");

        txtFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNActionPerformed(evt);
            }
        });

        jLabel2.setText("Email address");

        jLabel3.setText("Password");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jButton1.setText("Register Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Middle Initial");

        jLabel7.setText("SSN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtPassword)))
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtMI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton1)))
                .addGap(0, 98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 //  Database credentials
                final String USER = "root";
                final String PASS = "toorroot";
                final String String = null;
                
                
                //Create wrapper object and define it null
                Wrapper conn = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");  

                    //declare variables
                    String username = "";
                    String password = "";
                    String fName = "";
                    String lName = "";
                    String MI = "";
                    String SSN = "";

                    //get values using getText() method
                    username = txtEmail.getText().trim();
                    password = txtPassword.getText().trim();
                    fName = txtFN.getText().trim();
                    lName = txtLN.getText().trim();
                    MI = txtMI.getText().trim();
                    SSN = txtSSN.getText().trim();

                    //variables for password strength verification
                    String lowchars = "abcdefghijklmnopqrstuvwxyz";
                    String upchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String nums = "1234567890";
                    String syms = "!@#$%^&*-=+_,.`~";
                    int lowcharcount = 0;
                    int upcharcount = 0;
                    int numcount = 0;
                    int symcount = 0;
                    boolean valid = true;
                    //get password character information
                    for (int i = 0; i < password.length(); i++) {
                        if (lowchars.contains(password.substring(i, i + 1)))
                        lowcharcount++;
                        if (upchars.contains(password.substring(i, i + 1)))
                        upcharcount++;
                        if (nums.contains(password.substring(i, i + 1)))
                        numcount++;
                        if (syms.contains(password.substring(i, i + 1)))
                        symcount++;
                    }

                    // check condition it field equals to blank throw error message
                    if (username.equals("") || password.equals("")) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " name or password is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //check password length
                    if (password.length() < 8 && valid == true) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " password too short", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //check for at least 1 lower case character
                    if (lowcharcount == 0 && valid == true) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " password must contain at least 1 lowercase character", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //check for at least 1 upper case character
                    if (upcharcount == 0 && valid == true) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " password must contain at least 1 uppercase character", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //check for at least number character
                    if (numcount == 0 && valid == true) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " password must contain at least 1 number", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //check for at least symbol character
                    if (symcount == 0 && valid == true) {
                        valid = false;
                        JOptionPane.showMessageDialog(null, " password must complain at least 1 symbol", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if(valid)//else insert query is run properly
                    {
                        String IQuery = "INSERT INTO `db412`.`accounts`(`SSN`,`firstname`,`lastname`,`middleinitial`,`email`,`password`) VALUES('" + SSN + "','" + fName + "','" + lName + "','" + MI + "','" + username + "','" + password + "')";
                        System.out.println(IQuery);//print on console
                        System.out.println("Connecting to a selected database...");

                        //STEP 3: Open a connection
                        conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        System.out.println("Connected database successfully...");

                        ((Connection) conn).createStatement().execute(IQuery);//select the rows
                        // define SMessage variable
                        String SMessage = "Record added for " + username;

                        // create dialog ox which is print message
                        JOptionPane.showMessageDialog(null, SMessage, "Message", JOptionPane.PLAIN_MESSAGE);
                        //close connection
                        ((java.sql.Connection) conn).close();
                    }
                } catch (SQLException se) {
                    //handle errors for JDBC
                    se.printStackTrace();
                } catch (Exception a) //catch block
                {
                    a.printStackTrace();
                }
            
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtMI;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
