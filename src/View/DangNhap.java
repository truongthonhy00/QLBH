package View;

import javax.swing.JOptionPane;
import Controller.StaffManager;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DangNhap extends javax.swing.JFrame {


    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        jl_Account = new javax.swing.JLabel();
        jl_Password = new javax.swing.JLabel();
        tf_Account = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        jl_Login = new javax.swing.JLabel();
        tf_PassWord = new javax.swing.JPasswordField();
        jbn_BackLG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jl_Account.setText("Tài khoản:");

        jl_Password.setFont(new java.awt.Font("Tahoma", 1, 12));
        jl_Password.setText("Mật khẩu:");


        btn_Login.setText("Đăng nhập");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
         tf_Account.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_AccountKeyPressed(evt);
            }
        });
                  tf_PassWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_PassWordKeyPressed(evt);
            }
        });
        jl_Login.setFont(new java.awt.Font("Tahoma", 1, 18));
        jl_Login.setText("ĐĂNG NHẬP");

        jbn_BackLG.setText("Thoát");
        jbn_BackLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_BackLGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Account)
                    .addComponent(jl_Password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_Account, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(tf_PassWord))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_Login)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Login)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbn_BackLG)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jl_Login)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Account)
                    .addComponent(tf_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_Password)
                    .addComponent(tf_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btn_Login)
                .addGap(27, 27, 27)
                .addComponent(jbn_BackLG)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }                   
                                         
        public String user()
        {
            String us = tf_Account.getText();
            return us;
        }
    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String user = tf_Account.getText();
        String pass = tf_PassWord.getText();
        if (user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        }
        else {
            try {
                StaffManager sm = new StaffManager();
                Menu menu = new Menu();
                int reSult = sm.login(user, pass);
                switch(reSult){
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                        break;
                    case 0:
                        this.dispose();                       
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        break;
                    case 1:
                        this.dispose();
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        menu.hiddenBTNNV();
                        menu.hiddenBTNMH();
                        InfoMuaHang info = new InfoMuaHang();
                        info.hiddenShowAllInfoHD();
                        break;
                        
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }                                         
    private void  tf_AccountKeyPressed(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String user = tf_Account.getText();
        String pass = tf_PassWord.getText();
        if (user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        }
        else {
            try {
                StaffManager sm = new StaffManager();
                Menu menu = new Menu();
                int reSult = sm.login(user, pass);
                switch(reSult){
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                        break;
                    case 0:
                        this.dispose();                       
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        break;
                    case 1:
                        this.dispose();
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        menu.hiddenBTNNV();
                        menu.hiddenBTNMH();
                        InfoMuaHang info = new InfoMuaHang();
                        info.hiddenShowAllInfoHD();
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
    private void tf_PassWordKeyPressed(java.awt.event.KeyEvent evt){
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String user = tf_Account.getText();
        String pass = tf_PassWord.getText();
        if (user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        }
        else {
            try {
                StaffManager sm = new StaffManager();
                Menu menu = new Menu();
                int reSult = sm.login(user, pass);
                switch(reSult){
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tài khoản hoặc Mật khẩu không chính xác!");
                        break;
                    case 0:
                        this.dispose();                       
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        break;
                    case 1:
                        this.dispose();
                        menu.setVisible(true);
                        menu.lbUserName(user);
                        menu.hiddenBTNNV();
                        menu.hiddenBTNMH();
                        InfoMuaHang info = new InfoMuaHang();
                        info.hiddenShowAllInfoHD();
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
    private void jbn_BackLGActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.dispose();
    }                                          

    public String getTfAccount() {
        return tf_Account.getText();
    }
                  
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton jbn_BackLG;
    private javax.swing.JLabel jl_Account;
    private javax.swing.JLabel jl_Login;
    private javax.swing.JLabel jl_Password;
    private javax.swing.JTextField tf_Account;
    private javax.swing.JPasswordField tf_PassWord;                
}


