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

        jl_Account.setText("Xin chào, Admin của chúng ta!");

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

}

