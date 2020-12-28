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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_Login = new javax.swing.JButton();
        Welcom = new javax.swing.JLabel();
        jbn_BackLG = new javax.swing.JButton();
        jl_Login = new javax.swing.JLabel();
        jl_Account = new javax.swing.JLabel();
        jl_Password = new javax.swing.JLabel();
        tf_Account = new javax.swing.JTextField();
        tf_PassWord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        btn_Login.setBackground(new java.awt.Color(0, 102, 153));
        btn_Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Login.setForeground(java.awt.Color.white);
        btn_Login.setText("Đăng nhập");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        Welcom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Welcom.setForeground(java.awt.Color.white);
        Welcom.setText("Chào mừng bạn đến với QUẢN LÝ BÁN HÀNG!");

        jbn_BackLG.setBackground(new java.awt.Color(0, 102, 153));
        jbn_BackLG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbn_BackLG.setForeground(new java.awt.Color(255, 255, 255));
        jbn_BackLG.setText("Thoát");
        jbn_BackLG.setMaximumSize(new java.awt.Dimension(65, 30));
        jbn_BackLG.setMinimumSize(new java.awt.Dimension(65, 30));
        jbn_BackLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_BackLGActionPerformed(evt);
            }
        });

        jl_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Login.setForeground(java.awt.Color.white);
       jl_Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\label đăng nhập 48.png")); // NOI18N
        jl_Login.setText("ĐĂNG NHẬP");

        jl_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Account.setForeground(java.awt.Color.white);
        jl_Account.setText("Tài khoản:");

        jl_Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Password.setForeground(java.awt.Color.white);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_Account)
                            .addComponent(jl_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jbn_BackLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Welcom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jl_Login)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jl_Login)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Account))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Password)
                    .addComponent(tf_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbn_BackLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\backgrounds\\gif400x300.gif")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>         
                                         
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
    private void jbn_BackLGActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.dispose();
    }                                          

                  
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton jbn_BackLG;
    private javax.swing.JLabel jl_Account;
    private javax.swing.JLabel jl_Login;
    private javax.swing.JLabel jl_Password;
    private javax.swing.JTextField tf_Account;
    private javax.swing.JPasswordField tf_PassWord;  
    private javax.swing.JLabel Welcom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}


