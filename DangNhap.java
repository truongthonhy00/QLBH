package View;

import javax.swing.JOptionPane;
import Controller.StaffManager;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class DangNhap extends javax.swing.JFrame {


    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Đăng nhập");

        jl_Welcome = new javax.swing.JLabel();
        jl_Login = new javax.swing.JLabel();
        jl_Account = new javax.swing.JLabel();
        jl_Password = new javax.swing.JLabel();
        tf_Account = new javax.swing.JTextField();
        tf_PassWord = new javax.swing.JPasswordField();
        jbn_BackLG = new javax.swing.JButton();
        btn_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jl_Welcome.setBackground(java.awt.Color.white);
        jl_Welcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Welcome.setText("Chào mừng bạn đến với QUẢN LÝ BÁN HÀNG!");

        jl_Login.setBackground(java.awt.Color.white);
        jl_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Login.setText("ĐĂNG NHẬP");
        jl_Login.setIcon(new javax.swing.ImageIcon("images/buttons/male-user-48.png"));

        jl_Account.setBackground(java.awt.Color.white);
        jl_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Account.setText("Tên đăng nhập:");

        jl_Password.setBackground(java.awt.Color.white);
        jl_Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Password.setText("Mật khẩu:");

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

        jbn_BackLG.setBackground(new java.awt.Color(60, 115, 195));
        jbn_BackLG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbn_BackLG.setForeground(java.awt.Color.white);
        jbn_BackLG.setText("Thoát");
        jbn_BackLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_BackLGActionPerformed(evt);
            }
        });

        btn_Login.setBackground(new java.awt.Color(60, 115, 195));
        btn_Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Login.setForeground(java.awt.Color.white);
        btn_Login.setText("Đăng nhập");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jl_Login))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_Welcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Account)
                            .addComponent(jl_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_Login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jbn_BackLG)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Welcome)
                .addGap(32, 32, 32)
                .addComponent(jl_Login)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Account)
                    .addComponent(tf_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Password)
                    .addComponent(tf_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_Login)
                .addGap(18, 18, 18)
                .addComponent(jbn_BackLG)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>
  
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
    private javax.swing.JLabel jl_Welcome;
}


