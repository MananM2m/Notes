/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.notes;

/**
 *
 * @author manan
 */
public class loginWindow extends javax.swing.JFrame {

    /**
     * Creates new form loginWindow
     */
    public loginWindow() {
        notes = new Notes();
        
        initComponents();
        
        label_incorrect.setVisible(false);
        label_usertaken.setVisible(false);
        label_passmatch.setVisible(false);
        label_signup_notempty.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        textfield_signup_username = new javax.swing.JTextField();
        textfield_signup_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_signup_signup = new javax.swing.JButton();
        label_usertaken = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textfield_signup_confirmpass = new javax.swing.JPasswordField();
        label_passmatch = new javax.swing.JLabel();
        label_signup_notempty = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textfield_username = new javax.swing.JTextField();
        textfield_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_login = new javax.swing.JButton();
        button_signup = new javax.swing.JButton();
        checkbox_stayloggedin = new javax.swing.JCheckBox();
        label_incorrect = new javax.swing.JLabel();

        signup.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        signup.setBackground(new java.awt.Color(255, 204, 102));
        signup.setMaximumSize(new java.awt.Dimension(265, 298));
        signup.setMinimumSize(new java.awt.Dimension(265, 298));

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel4.setText("Sign up");

        textfield_signup_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_signup_usernameActionPerformed(evt);
            }
        });

        textfield_signup_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_signup_passwordActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        button_signup_signup.setText("Sign up");
        button_signup_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signup_signupActionPerformed(evt);
            }
        });

        label_usertaken.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        label_usertaken.setForeground(new java.awt.Color(255, 0, 51));
        label_usertaken.setText("Username taken");

        jLabel7.setText("Confirm password");

        textfield_signup_confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_signup_confirmpassActionPerformed(evt);
            }
        });

        label_passmatch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        label_passmatch.setForeground(new java.awt.Color(255, 0, 51));
        label_passmatch.setText("Passwords don't match");

        label_signup_notempty.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        label_signup_notempty.setForeground(new java.awt.Color(255, 0, 51));
        label_signup_notempty.setText("username or password cannot be empty");

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup.getContentPane());
        signup.getContentPane().setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signupLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(label_usertaken)
                    .addGap(72, 72, 72))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                            .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                                    .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textfield_signup_password, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textfield_signup_username, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textfield_signup_confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                            .addComponent(button_signup_signup)
                            .addGap(83, 83, 83)))))
            .addGroup(signupLayout.createSequentialGroup()
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(label_passmatch))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label_signup_notempty))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)))
                .addGap(14, 14, 14))
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_signup_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textfield_signup_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textfield_signup_confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_signup_signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_usertaken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_passmatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_signup_notempty)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setMaximumSize(new java.awt.Dimension(239, 298));
        setMinimumSize(new java.awt.Dimension(239, 298));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel1.setText("Notes");

        textfield_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_usernameActionPerformed(evt);
            }
        });

        textfield_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_passwordActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        button_login.setText("Login");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        button_signup.setText("Sign up");
        button_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signupActionPerformed(evt);
            }
        });

        checkbox_stayloggedin.setText("Stay logged in");
        checkbox_stayloggedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_stayloggedinActionPerformed(evt);
            }
        });

        label_incorrect.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        label_incorrect.setForeground(new java.awt.Color(255, 0, 51));
        label_incorrect.setText("Incorrect username or password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_incorrect)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button_signup))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(button_login))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(checkbox_stayloggedin)))
                        .addGap(45, 45, 45)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfield_username, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(textfield_password))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(checkbox_stayloggedin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_incorrect)
                .addGap(18, 18, 18)
                .addComponent(button_signup)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_usernameActionPerformed

    private void textfield_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_passwordActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        if(notes.logIn(textfield_username.getText(),textfield_password.getText()))
            loggedInUser = textfield_username.getText().hashCode();
        label_incorrect.setVisible(true);
    }//GEN-LAST:event_button_loginActionPerformed

    private void button_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signupActionPerformed
        signup.setVisible(true);
    }//GEN-LAST:event_button_signupActionPerformed

    private void checkbox_stayloggedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_stayloggedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_stayloggedinActionPerformed

    private void textfield_signup_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_signup_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_signup_usernameActionPerformed

    private void textfield_signup_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_signup_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_signup_passwordActionPerformed

    private void button_signup_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signup_signupActionPerformed
        if(textfield_signup_password.getText().equals("") || textfield_signup_username.getText().equals("")){
            label_signup_notempty.setVisible(true);
            return;
        }
        if(!textfield_signup_password.getText().equals(textfield_signup_confirmpass.getText())){
            label_passmatch.setVisible(true);
            return;
        }
        if(notes.newUser(textfield_signup_username.getText(), textfield_signup_password.getText())){
            signup.setVisible(false);
            return;
        }
        label_usertaken.setVisible(true);
    }//GEN-LAST:event_button_signup_signupActionPerformed

    private void textfield_signup_confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_signup_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_signup_confirmpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginWindow().setVisible(true);
        });
        
        
    }

    final Notes notes;
    int loggedInUser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JButton button_signup;
    private javax.swing.JButton button_signup_signup;
    private javax.swing.JCheckBox checkbox_stayloggedin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_incorrect;
    private javax.swing.JLabel label_passmatch;
    private javax.swing.JLabel label_signup_notempty;
    private javax.swing.JLabel label_usertaken;
    private javax.swing.JFrame signup;
    private javax.swing.JPasswordField textfield_password;
    private javax.swing.JPasswordField textfield_signup_confirmpass;
    private javax.swing.JPasswordField textfield_signup_password;
    private javax.swing.JTextField textfield_signup_username;
    private javax.swing.JTextField textfield_username;
    // End of variables declaration//GEN-END:variables
}
