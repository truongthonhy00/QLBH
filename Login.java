/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StaffManager;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Son
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jl_Login = new javax.swing.JLabel();
        jl_Account = new javax.swing.JLabel();
        tf_Account = new javax.swing.JTextField();
        jl_Password = new javax.swing.JLabel();
        tf_PassWord = new javax.swing.JTextField();
        jbn_BackLG = new javax.swing.JButton();
        btn_Login = new javax.swing.JButton();
        jlb_QLBH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(getIconImages());
        getContentPane().setLayout(null);

        jl_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Login.setForeground(java.awt.Color.white);
        jl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\Son\\Desktop\\QLBH-main\\QLBH-main\\images\\buttons\\icons8-male-user-48.png")); // NOI18N
        jl_Login.setLabelFor(this);
        jl_Login.setText("ĐĂNG NHẬP");
        getContentPane().add(jl_Login);
        jl_Login.setBounds(114, 54, 183, 69);

        jl_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Account.setForeground(new java.awt.Color(255, 255, 255));
        jl_Account.setText("Tên đăng nhập:");
        getContentPane().add(jl_Account);
        jl_Account.setBounds(87, 143, 96, 15);

        tf_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AccountActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Account);
        tf_Account.setBounds(183, 141, 140, 20);

        jl_Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Password.setForeground(java.awt.Color.white);
        jl_Password.setText("Mật khẩu:");
        getContentPane().add(jl_Password);
        jl_Password.setBounds(87, 181, 62, 15);

        tf_PassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PassWordActionPerformed(evt);
            }
        });
        getContentPane().add(tf_PassWord);
        tf_PassWord.setBounds(183, 179, 140, 20);

        jbn_BackLG.setBackground(new java.awt.Color(33, 106, 180));
        jbn_BackLG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbn_BackLG.setForeground(new java.awt.Color(255, 255, 255));
        jbn_BackLG.setText("Thoát");
        jbn_BackLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_BackLGActionPerformed(evt);
            }
        });
        getContentPane().add(jbn_BackLG);
        jbn_BackLG.setBounds(62, 235, 73, 25);

        btn_Login.setBackground(new java.awt.Color(33, 106, 180));
        btn_Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Login.setForeground(java.awt.Color.white);
        btn_Login.setText("Đăng nhập");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Login);
        btn_Login.setBounds(227, 235, 109, 25);

        jlb_QLBH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_QLBH.setForeground(new java.awt.Color(51, 102, 255));
        jlb_QLBH.setText("QUẢN LÝ BÁN HÀNG");
        getContentPane().add(jlb_QLBH);
        jlb_QLBH.setBounds(116, 21, 181, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String user = tf_Account.getText();
        String pass = tf_PassWord.getText();
        if (user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        } else {
            try {
                StaffManager sm = new StaffManager();
                Menu menu = new Menu();
                int reSult = sm.login(user, pass);
                switch (reSult) {
                    case 2:
                    JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                    break;
                    case 0:
                    //Đưa acc đăng nhập lên trạng thái hoạt động
                    sm.setAcc_Status(1, user);

                    menu.setVisible(true);
                    menu.lbUserName(user);
                    this.dispose();
                    break;
                    case 1:
                    //Đưa acc đăng nhập lên trạng thái hoạt động
                    sm.setAcc_Status(1, user);

                    menu.setVisible(true);
                    menu.lbUserName(user);

                    //Ẩn 2 chức năng đi (Vì là user)
                    menu.hiddenBTNNV();
                    menu.hiddenBTNMH();
                    this.dispose();
                    break;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void jbn_BackLGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_BackLGActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbn_BackLGActionPerformed

    private void tf_PassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_PassWordActionPerformed

    private void tf_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_AccountActionPerformed
    
    private void tf_AccountKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String user = tf_Account.getText();
            String pass = tf_PassWord.getText();
            if (user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
            } else {
                try {
                    StaffManager sm = new StaffManager();
                    Menu menu = new Menu();
                    int reSult = sm.login(user, pass);
                    switch (reSult) {
                        case 2:
                            JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                            break;
                        case 0:
                            //Đưa acc đăng nhập lên trạng thái hoạt động
                            sm.setAcc_Status(1, user);

                            menu.setVisible(true);
                            menu.lbUserName(user);
                            this.dispose();
                            break;
                        case 1:
                            //Đưa acc đăng nhập lên trạng thái hoạt động
                            sm.setAcc_Status(1, user);

                            menu.setVisible(true);
                            menu.lbUserName(user);

                            //Ẩn 2 chức năng đi (Vì là user)
                            menu.hiddenBTNNV();
                            menu.hiddenBTNMH();
                            this.dispose();
                            break;
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    private void tf_PassWordKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String user = tf_Account.getText();
            String pass = tf_PassWord.getText();
            if (user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
            } else {
                try {
                    StaffManager sm = new StaffManager();
                    Menu menu = new Menu();
                    int reSult = sm.login(user, pass);
                    switch (reSult) {
                        case 2:
                            JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                            break;
                        case 0:
                            //Đưa acc đăng nhập lên trạng thái hoạt động
                            sm.setAcc_Status(1, user);

                            menu.setVisible(true);
                            menu.lbUserName(user);
                            this.dispose();
                            break;
                        case 1:
                            //Đưa acc đăng nhập lên trạng thái hoạt động
                            sm.setAcc_Status(1, user);

                            menu.setVisible(true);
                            menu.lbUserName(user);

                            //Ẩn 2 chức năng đi (Vì là user)
                            menu.hiddenBTNNV();
                            menu.hiddenBTNMH();
                            this.dispose();
                            break;
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton jbn_BackLG;
    private javax.swing.JLabel jl_Account;
    private javax.swing.JLabel jl_Login;
    private javax.swing.JLabel jl_Password;
    private javax.swing.JLabel jlb_QLBH;
    private javax.swing.JTextField tf_Account;
    private javax.swing.JTextField tf_PassWord;
    // End of variables declaration//GEN-END:variables
}
