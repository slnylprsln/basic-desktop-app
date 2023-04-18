/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SALPARSLAN
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        TextField_password = new javax.swing.JTextField();
        TextField_confirmpassword = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextField_username = new javax.swing.JTextField();
        TextField_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextField_address = new javax.swing.JTextField();
        TextField_namesurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextField_phone = new javax.swing.JTextField();
        jButton_Register = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmpasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jButton_Register1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(553, 320));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("Registration Form");

        TextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_usernameActionPerformed(evt);
            }
        });

        TextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_emailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        TextField_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_addressActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel5.setText("Name Surname");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel7.setText("Confirm Password");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel8.setText("Phone Number");

        TextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_phoneActionPerformed(evt);
            }
        });
        TextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_phoneKeyTyped(evt);
            }
        });

        jButton_Register.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Register.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jButton_Register.setText("Register");
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel9.setText("Already have an account?");

        jButton_Register1.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Register1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jButton_Register1.setText("Login");
        jButton_Register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Register1MouseClicked(evt);
            }
        });
        jButton_Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_namesurname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton_Register)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(passwordField)
                                            .addComponent(TextField_phone)
                                            .addComponent(confirmpasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Register1)
                                .addGap(105, 105, 105)))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_namesurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Register))
                        .addGap(24, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton_Register1))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_emailActionPerformed

    private void TextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_usernameActionPerformed

    private void TextField_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_addressActionPerformed

    private void TextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_phoneActionPerformed

    private void TextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_phoneKeyTyped
        
        // This block of code is ensuring that just numbers are allowed to be written to phone number part
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_phoneKeyTyped

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        
        // We are taking all information given by the user
        String namesurname = TextField_namesurname.getText();
        String username = TextField_username.getText();
        String password = String.valueOf(passwordField.getPassword());
        String phonenumber = TextField_phone.getText();
        String email = TextField_email.getText();
        String address = TextField_address.getText();
        
        // Control if there is any empty fields
        if(controlEmptyFields()){
            
            // Control if the username written by the user is taken already or available to be used
            if(!controlUsername(username)){
                PreparedStatement ps;
                
                // To insert data into user_details table
                String insertQuery = "INSERT INTO user_details(name_surname, username, email, address, phone_number, password) VALUES (?,?,?,?,?,?)";
                
                try {
                    
                    ps = My_Database.getConnection().prepareStatement(insertQuery);
                    ps.setString(1, namesurname);
                    ps.setString(2, username);
                    ps.setString(3, email);
                    ps.setString(4, address);
                    ps.setString(5, phonenumber);
                    ps.setString(6, password);
                    
                    // If everything is fine, create the account
                    if(ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "The account is created!");
                    }
                    
                    // If something is wrong, show an error message
                    else JOptionPane.showMessageDialog(null, "An error occured while creating account. Check your informations!");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }
        
        
        
        
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jButton_Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Register1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Register1ActionPerformed

    private void jButton_Register1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Register1MouseClicked
        // When users create an account, they can go to Login Page again
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_Register1MouseClicked

    // This function will be used to control if there is any empty fields
    public boolean controlEmptyFields() {
        String name = TextField_namesurname.getText();
        String usern = TextField_username.getText();
        String phone = TextField_phone.getText();
        String pass = String.valueOf(passwordField.getPassword());
        String pass1 = String.valueOf(confirmpasswordField.getPassword());
        
        // Control if there is any area left empty
        if(name.trim().equals("") || usern.trim().equals("") || 
                phone.trim().equals("") || pass.trim().equals("") ||
                pass1.trim().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields are empty", "Empty Fields Error", 2);
            return false;
        }
        
        // Control if the password field and the confirm password field have the same input
        if(!pass.equals(pass1)) {
            JOptionPane.showMessageDialog(null, "Passwords didn't match!", "Confirmation Error", 2);
            return false;
        }
        
        else return true;
    }
    
    
    // A function to control if the username that user entered is already taken or not
    public boolean controlUsername(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean if_exists = false;
        
        String query = "SELECT * FROM user_details WHERE username = ?";
        try {
            ps = My_Database.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                if_exists = true;
                JOptionPane.showMessageDialog(null, "This username is already taken!", "Username Error", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return if_exists;
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField_address;
    private javax.swing.JTextField TextField_confirmpassword;
    private javax.swing.JTextField TextField_email;
    private javax.swing.JTextField TextField_namesurname;
    private javax.swing.JTextField TextField_password;
    private javax.swing.JTextField TextField_phone;
    private javax.swing.JTextField TextField_username;
    private javax.swing.JPasswordField confirmpasswordField;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_Register1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}