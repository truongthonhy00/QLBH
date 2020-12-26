package View;
import javax.swing.JButton;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")                    
    private void initComponents() {

        btn_QLHD = new javax.swing.JButton();
        btn_QLMH = new javax.swing.JButton();
        btn_QLNV = new javax.swing.JButton();
        jl_Menu = new javax.swing.JLabel();
        jl_Account = new javax.swing.JLabel();
        jbn_Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_QLHD.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btn_QLHD.setText("LẬP HÓA ĐƠN");
        btn_QLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLHDActionPerformed(evt);
            }
        });

        btn_QLMH.setFont(new java.awt.Font("Tahoma", 1, 12));
        btn_QLMH.setText("QUẢN LÝ MẶT HÀNG");
        btn_QLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLMHActionPerformed(evt);
            }
        });

        btn_QLNV.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btn_QLNV.setText("QUẢN LÝ NHÂN VIÊN");
        btn_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLNVActionPerformed(evt);
            }
        });

        jl_Menu.setFont(new java.awt.Font("Tahoma", 1, 18));
        jl_Menu.setForeground(new java.awt.Color(0, 102, 255));
        jl_Menu.setText("MENU");

        jl_Account.setText("Account");

        jbn_Logout.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jbn_Logout.setText("Đăng xuất");
        jbn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_QLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_QLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jl_Menu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jl_Account)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Menu)
                .addGap(31, 31, 31)
                .addComponent(btn_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_QLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_QLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jbn_Logout)
                .addContainerGap())
        );

        pack();
    }                   

    private void btn_QLMHActionPerformed(java.awt.event.ActionEvent evt) {                                         
        QLMatHang mh = new QLMatHang();
        mh.setVisible(true);
        this.dispose();
    }                                        

    private void btn_QLHDActionPerformed(java.awt.event.ActionEvent evt) {                                         
        InfoMuaHang info = new InfoMuaHang();
        info.setVisible(true);
//        this.dispose();
    }                                        

    private void btn_QLNVActionPerformed(java.awt.event.ActionEvent evt) {                                         
        QLNhanVien nv = new QLNhanVien();
        nv.setVisible(true);
        this.dispose();
    }                                        

    private void jbn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        DangNhap dn = new DangNhap();
        this.setVisible(false);
        dn.setVisible(true);
    }                                          
    public void lbUserName(String user){
        jl_Account.setText("Welcome, " +"Administrator" + "!");
    }

                 
    private javax.swing.JButton btn_QLHD;
    private javax.swing.JButton btn_QLMH;
    private javax.swing.JButton btn_QLNV;
    private javax.swing.JButton jbn_Logout;
    private javax.swing.JLabel jl_Account;
    private javax.swing.JLabel jl_Menu;                

    public void hiddenBTNNV(){
        btn_QLNV.setVisible(false);
    }
    
    public void hiddenBTNMH(){
        btn_QLMH.setVisible(false);
    }
}

