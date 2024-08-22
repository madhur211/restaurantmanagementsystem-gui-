/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini.project.sem4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import java.util.Date;

/**
 *
 * @author madhurshinde
 */
public class datetimelive extends javax.swing.JFrame {

    /**
     * Creates new form datetimelive
     */
    public datetimelive() {
        initComponents();
        dt();
        times();
        
    }
      public datetimelive(String email) {
        initComponents();
        dt();
        times();
        
    }

  public void dt() {
      Date d=new Date();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      String dd= sdf.format(d);
      l_date.setText(dd);
         
  
  }
   Timer t;
  SimpleDateFormat st;
  public void times(){
 
    t = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          Date dt=new Date();
           
           st= new SimpleDateFormat("hh:mm:ss a");
           String tt=st.format(dt);
           l_time.setText(tt);
      }
  });
    t.start();
  }

    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ADDDELETEITEM = new javax.swing.JButton();
        ADDEDLIST = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        MOSTSALEB = new javax.swing.JButton();
        WEEKLYAB = new javax.swing.JButton();
        BILLINGB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-calendar-50.png")); // NOI18N
        jLabel1.setText("Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-time-48.png")); // NOI18N
        jLabel2.setText("Time");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 162, -1, -1));

        l_time.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        l_time.setForeground(new java.awt.Color(255, 0, 0));
        l_time.setText("0");
        getContentPane().add(l_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 173, 109, -1));

        l_date.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        l_date.setForeground(new java.awt.Color(255, 51, 0));
        l_date.setText("0");
        getContentPane().add(l_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 112, 109, -1));

        jLabel3.setFont(new java.awt.Font("K2D", 1, 48)); // NOI18N
        jLabel3.setText("RESTAURANT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 24, -1, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-logout-50.png")); // NOI18N
        jButton1.setText("logout..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 160, 50));

        ADDDELETEITEM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ADDDELETEITEM.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-add-properties-48.png")); // NOI18N
        ADDDELETEITEM.setText("ADD NEW PRODUCT");
        ADDDELETEITEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDDELETEITEMActionPerformed(evt);
            }
        });
        getContentPane().add(ADDDELETEITEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 272, 346, 105));

        ADDEDLIST.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ADDEDLIST.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-list-50.png")); // NOI18N
        ADDEDLIST.setText("VIEW,EDIT & DELETE PRODUCT");
        ADDEDLIST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDEDLISTActionPerformed(evt);
            }
        });
        getContentPane().add(ADDEDLIST, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 272, 370, 105));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-data-backup-80.png")); // NOI18N
        jButton4.setText("PREVIOUS DAY RECORDS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 272, 367, 105));

        MOSTSALEB.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        MOSTSALEB.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-food-bar-50.png")); // NOI18N
        MOSTSALEB.setText("MONTHLY ANALYSIS");
        MOSTSALEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTSALEBActionPerformed(evt);
            }
        });
        getContentPane().add(MOSTSALEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 437, 346, 105));

        WEEKLYAB.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        WEEKLYAB.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-average-math-48.png")); // NOI18N
        WEEKLYAB.setText("WEEKLY AVERAGE ");
        WEEKLYAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WEEKLYABActionPerformed(evt);
            }
        });
        getContentPane().add(WEEKLYAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 437, 370, 105));

        BILLINGB.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BILLINGB.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/Madhur/icons8-billing-machine-100.png")); // NOI18N
        BILLINGB.setText("PROCEED FOR BILLING");
        BILLINGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BILLINGBActionPerformed(evt);
            }
        });
        getContentPane().add(BILLINGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 437, 367, 105));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setText("HOME PAGE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/madhurshinde/Desktop/1600 900.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1660, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 setVisible(false);
        new login().setVisible(true);       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void WEEKLYABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WEEKLYABActionPerformed
        setVisible(false);
        new rangedata().setVisible(true);       
        
    }//GEN-LAST:event_WEEKLYABActionPerformed

    private void BILLINGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BILLINGBActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new billingpage().setVisible(true);
         
        
    }//GEN-LAST:event_BILLINGBActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            // Create an instance of the JCalendar component
     // TODO add your handling code here:
        setVisible(false);
         new prevdayRe().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    private void MOSTSALEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTSALEBActionPerformed
        // TODO add your handling code here:
          // Create an instance of the JCalendar component
 
        setVisible(false);
         new mostsaledproduct().setVisible(true);
    }//GEN-LAST:event_MOSTSALEBActionPerformed

    private void ADDDELETEITEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDDELETEITEMActionPerformed
        // TODO add your handling code here:
        
        new addnewproduct().setVisible(true);
    }//GEN-LAST:event_ADDDELETEITEMActionPerformed

    private void ADDEDLISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDEDLISTActionPerformed
        // TODO add your handling code here:
        new vieweddel().setVisible(true);
    }//GEN-LAST:event_ADDEDLISTActionPerformed

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
            java.util.logging.Logger.getLogger(datetimelive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datetimelive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datetimelive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datetimelive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datetimelive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDDELETEITEM;
    private javax.swing.JButton ADDEDLIST;
    private javax.swing.JButton BILLINGB;
    private javax.swing.JButton MOSTSALEB;
    private javax.swing.JButton WEEKLYAB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    // End of variables declaration//GEN-END:variables

    private void createDatePicker() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
