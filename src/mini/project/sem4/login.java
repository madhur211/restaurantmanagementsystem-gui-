package mini.project.sem4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import dataacess.UserDataaccess;
import javax.swing.JOptionPane;
import mini.project.sem4.signup;
import model.User;

    
/* *
 * @author madhurshinde
 */
public class login extends javax.swing.JFrame {
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
       
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        btnLogin.setEnabled(false);
      
        
        // Initialize and configure JLabel for warning message
       
    }
    public void clear()
    {
        txtEmail.setText("");
        txtPassword.setText("");
        btnLogin.setEnabled(false);
        
    }
    public void validatefields(){
        String email=txtEmail.getText();
        String password=txtPassword.getText();
        if(email.matches(emailPattern)&& !password.equals("")){
        btnLogin.setEnabled(true);
           
        }
        else
        {
        btnLogin.setEnabled(false);
      

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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtWarning = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("K2D", 1, 48)); // NOI18N
        jLabel3.setText("RESTAURANT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 22, -1, 75));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-log-in-48.png")); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 132, 170, 52));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-email-50.png")); // NOI18N
        jLabel2.setText("EMAIL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 224, 135, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-password-50.png")); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 302, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 234, 351, 34));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 318, 351, 34));

        btnLogin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-log-in-48.png")); // NOI18N
        btnLogin.setText("login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 409, -1, 70));

        btnClear.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-clear-50.png")); // NOI18N
        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 413, -1, 63));

        btnExit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-exit-50.png")); // NOI18N
        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 413, -1, 63));

        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-forgot-password-64.png")); // NOI18N
        jButton4.setText("forgot password?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 491, 232, -1));

        jButton5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-login-rounded-up-50.png")); // NOI18N
        jButton5.setText("sign up");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 491, -1, 70));

        txtWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarningActionPerformed(evt);
            }
        });
        getContentPane().add(txtWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 210, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/1600 900.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -10, 1660, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signup().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email=txtEmail.getText();
        String password=txtPassword.getText();
        User user=null;
        user=UserDataaccess.login(email, password);
        if(user==null){
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">INCORRECT USERNAME OR PASSWORD</b></html>","Message",JOptionPane.ERROR_MESSAGE);
}        
else{ 
            
                
new datetimelive(email).setVisible(true);
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
           int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0) //user selected yes
        {
            System.exit(0) ;
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validatefields();
         updateWarningMessage();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validatefields();
    }//GEN-LAST:event_txtPasswordKeyReleased
 // Method to update the warning message
    private void updateWarningMessage() {
        String email = txtEmail.getText();
        if (!email.matches(emailPattern)) {
            txtWarning.setText("Invalid email format");
        } else {
            txtWarning.setText("");
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new forgotpassword().setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarningActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtWarning;
    // End of variables declaration//GEN-END:variables
}
