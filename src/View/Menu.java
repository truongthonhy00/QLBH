package View;
import Controller.StaffManager;
import Model.Staff;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.JButton;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            StaffManager sm = new StaffManager();
            
            int MaNVHT = sm.getMaNVHT_follow_Status(1);   //Lấy Mã nhân viên đăng nhập
            if(MaNVHT != 0)   //Nếu là nhân viên thì mới có tên trong DSNV. Còn admin thì không(Mã Admin = 0)
            {
                Staff nv = sm.getDetail(MaNVHT);              //Lấy thông tin nhân viên đăng nhập theo mã nhân viên vừa lấy được
                String NameNVHT = nv.getName();               //Lấy tên nhân viên
                jl_Account.setText("Xin chào, " + NameNVHT + "!");
            }
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")                    
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jl_Menu = new javax.swing.JLabel();
        btn_QLNV = new javax.swing.JButton();
        btn_QLMH = new javax.swing.JButton();
        btn_QLHD = new javax.swing.JButton();
        jbn_Logout = new javax.swing.JButton();
        jl_Account = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jl_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Menu.setForeground(java.awt.Color.white);
        jl_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\menu-48.png")); // NOI18N
        jl_Menu.setText("MENU");

        btn_QLNV.setBackground(new java.awt.Color(0, 102, 102));
        btn_QLNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_QLNV.setForeground(java.awt.Color.white);
        btn_QLNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\quản lý nhân sự 23.png")); // NOI18N
        btn_QLNV.setText("Quản Lý Nhân Sự");
        btn_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLNVActionPerformed(evt);
            }
        });

        btn_QLMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_QLMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_QLMH.setForeground(java.awt.Color.white);
        btn_QLMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\quản lý mặt hàng 23.png")); // NOI18N
        btn_QLMH.setText("Quản Lý Mặt Hàng");
        btn_QLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLMHActionPerformed(evt);
            }
        });

        btn_QLHD.setBackground(new java.awt.Color(0, 102, 102));
        btn_QLHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_QLHD.setForeground(java.awt.Color.white);
        btn_QLHD.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\hoá đơn 23.png")); // NOI18N
        btn_QLHD.setText("Quản Lý Hóa Đơn");
        btn_QLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLHDActionPerformed(evt);
            }
        });
        

        jbn_Logout.setBackground(new java.awt.Color(0, 102, 153));
        jbn_Logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbn_Logout.setForeground(java.awt.Color.white);
        jbn_Logout.setText("Đăng xuất");
        jbn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_LogoutActionPerformed(evt);
            }
        });

        jl_Account.setForeground(new java.awt.Color(255, 255, 255));
        jl_Account.setText("Xin chào, Admin của chúng ta!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jl_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jl_Menu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_QLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_QLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbn_Logout)
                        .addGap(150, 150, 150))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jl_Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Menu)
                .addGap(27, 27, 27)
                .addComponent(btn_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_QLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_QLHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbn_Logout)
                .addGap(19, 19, 19))
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

    private void btn_QLMHActionPerformed(java.awt.event.ActionEvent evt) {                                         
        QLMatHang mh = new QLMatHang();
        mh.setVisible(true);
        this.dispose();
    }                                        

    private void btn_QLHDActionPerformed(java.awt.event.ActionEvent evt) {                                         
        InfoMuaHang info = new InfoMuaHang();
        info.setVisible(true);
        this.dispose();
    }                                        

    private void btn_QLNVActionPerformed(java.awt.event.ActionEvent evt) {                                         
        QLNhanVien nv = new QLNhanVien();
        nv.setVisible(true);
        this.dispose();
    }                                        

    private void jbn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //Đưa Acc về trạng thái off
        try {
            StaffManager sm = new StaffManager();
            
            //Lấy tên Acc đang on (Online thì trạng thái là 1)
            String user = sm.getAcc_follow_Status(1);
            
            //Đưa Acc về trạng thái off (Off thì trạng thái là 0)
            sm.setAcc_Status(0, user);
            
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }  
    
    public void hiddenBTNNV(){
        btn_QLNV.setVisible(false);
    }
    
    public void hiddenBTNMH(){
        btn_QLMH.setVisible(false);
    }
    
    public void lbUserName(String user){
        try {
            StaffManager sm = new StaffManager();
            
            int MaNVHT = sm.getMaNVHT_follow_Status(1);   //Lấy Mã nhân viên đăng nhập
            if(MaNVHT != 0)   //Nếu là nhân viên thì mới có tên trong DSNV. Còn admin thì không(Mã Admin = 0)
            {
                Staff nv = sm.getDetail(MaNVHT);              //Lấy thông tin nhân viên đăng nhập theo mã nhân viên vừa lấy được
                String NameNVHT = nv.getName();               //Lấy tên nhân viên
                jl_Account.setText("Xin chào, " + NameNVHT + "!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

                 
    private javax.swing.JButton btn_QLHD;
    private javax.swing.JButton btn_QLMH;
    private javax.swing.JButton btn_QLNV;
    private javax.swing.JButton jbn_Logout;
    private javax.swing.JLabel jl_Account;
    private javax.swing.JLabel jl_Menu;                
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}

