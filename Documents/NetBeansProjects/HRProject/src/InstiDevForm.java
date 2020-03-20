
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ideapad 520
 */
public class InstiDevForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public InstiDevForm() {
        initComponents(); 
        this.setResizable(false);
        
        //transparent background
        jPanel1.setBackground(new Color(255, 255, 255, 30));
        jPanel2.setBackground(new Color(255, 255, 255, 20));
        //making it center       
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_idnumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_loginButton = new javax.swing.JButton();
        jLabel_create = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_show = new javax.swing.JButton();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(111, 214, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(191, 240, 152));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("<html>Instituional Development and<br/> Extension Service Unit Login</html>");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("ID Number");

        jTextField_idnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField_idnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idnumberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jButton_loginButton.setBackground(new java.awt.Color(255, 255, 255));
        jButton_loginButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton_loginButton.setText("Login");
        jButton_loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton_loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginButtonMouseExited(evt);
            }
        });
        jButton_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginButtonActionPerformed(evt);
            }
        });

        jLabel_create.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel_create.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_create.setText(">>Create an Account<<");
        jLabel_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_createMouseExited(evt);
            }
        });

        jPasswordField_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton_show.setBackground(new java.awt.Color(255, 255, 255));
        jButton_show.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_show.setText("Show");
        jButton_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_showMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_showMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_showMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_showMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_showMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_create, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_idnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_show, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton_loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_idnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButton_loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_create)
                .addContainerGap())
        );

        jLabel_exit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_exit.setText("X");
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_exitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel_exitFocusLost(evt);
            }
        });
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseExited(evt);
            }
        });

        jLabel_minimize.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_minimize.setText("▬");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 3));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setText("WELCOME");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ideapad 520\\Desktop\\BAPTC\\world-map-19-colorful-art-by-sharon-cummings-sharon-cummings.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_back.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel_back.setText("←");
        jLabel_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_minimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_exit)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_exit)
                    .addComponent(jLabel_minimize)
                    .addComponent(jLabel_back))
                .addGap(66, 66, 66)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        jLabel_minimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseExited
        jLabel_exit.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_exitMouseExited

    private void jLabel_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseEntered
        jLabel_exit.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_exitMouseEntered

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jLabel_exitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_exitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_exitFocusLost

    private void jLabel_exitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_exitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_exitFocusGained

    private void jButton_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginButtonActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        //get the username and password
        String username = jTextField_idnumber.getText();
        String password = String.valueOf(jPasswordField_password.getPassword());
        
        //create a select quesry to check if the username and the password exist in db
        String query = "SELECT * FROM `user` WHERE `idNumbers` = ? AND `password` = ?";
        
        try {
            ps = insti_db.getConnection().prepareStatement(query);
            
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                //show a new form
                ChiefUI form = new ChiefUI();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                
                //close the current form(login)
                this.dispose();
            }else{
                //error msg
                JOptionPane.showMessageDialog(null, "Invalid IDNumber or Password", "Login Error", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiefLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton_loginButtonActionPerformed

    private void jButton_loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginButtonMouseEntered
        jButton_loginButton.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_loginButtonMouseEntered

    private void jButton_loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginButtonMouseExited
        jButton_loginButton.setBackground(Color.white);
    }//GEN-LAST:event_jButton_loginButtonMouseExited

    private void jLabel_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_createMouseEntered
        //
    }//GEN-LAST:event_jLabel_createMouseEntered

    private void jLabel_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_createMouseExited
        //
    }//GEN-LAST:event_jLabel_createMouseExited

    private void jLabel_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_createMouseClicked
        registrationForm2 rf = new registrationForm2();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_createMouseClicked

    private void jTextField_idnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idnumberActionPerformed

    private void jButton_showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showMouseEntered
        jButton_show.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_showMouseEntered

    private void jButton_showMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showMouseExited
        jButton_show.setBackground(Color.white);
    }//GEN-LAST:event_jButton_showMouseExited

    private void jButton_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showMouseClicked

    }//GEN-LAST:event_jButton_showMouseClicked

    private void jButton_showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showMousePressed
        if(jButton_show.isDisplayable()){
            jPasswordField_password.setEchoChar((char)0);
        }else{
            jPasswordField_password.setEchoChar('*');
        }
    }//GEN-LAST:event_jButton_showMousePressed

    private void jButton_showMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showMouseReleased
        if(jButton_show.isDisplayable()){
            jPasswordField_password.setEchoChar('*');
        }else{
            jPasswordField_password.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jButton_showMouseReleased

    private void jLabel_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMouseClicked
        chooseLogin rf = new chooseLogin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_backMouseClicked

    private void jLabel_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMouseEntered
        jLabel_back.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_backMouseEntered

    private void jLabel_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMouseExited
        jLabel_back.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_backMouseExited

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
            java.util.logging.Logger.getLogger(ChiefLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiefLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiefLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiefLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiefLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_loginButton;
    private javax.swing.JButton jButton_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_back;
    private javax.swing.JLabel jLabel_create;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_idnumber;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
