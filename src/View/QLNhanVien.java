package View;

import Controller.StaffManager;
import Model.Staff;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLNhanVien extends javax.swing.JFrame {
    public QLNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            StaffManager sm = new StaffManager();
            Model model = new Model();
            this.list = sm.getListNV();
            this.tbStaff.setModel(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    List<Staff> list = new ArrayList<>();
    private class Model extends DefaultTableModel{

        @Override
        public Object getValueAt(int row, int column) {
            switch (column){
                case 0:
                    return list.get(row).getMaNV();
                case 1:
                    return list.get(row).getName();
                case 2:
                    return list.get(row).getNgaySinh();
                case 3:
                    return list.get(row).getGender();
                case 4:
                    return list.get(row).getAddress();
                case 5:
                    return list.get(row).getPhone();
                case 6:
                    return list.get(row).getNgayCong();
                case 7:
                    return list.get(row).getHeSoLuong();
                case 8:
                    return list.get(row).getLuong();
            }
            return null;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }

        @Override
        public String getColumnName(int column) {
            switch (column){
                case 0:
                    return "Mã nhân viên";
                case 1:
                    return "Họ tên";
                case 2:
                    return "Ngày sinh";
                case 3:
                    return "Giới tính";
                case 4:
                    return "Địa chỉ";
                case 5:
                    return "Số điện thoại";
                case 6:
                    return "Ngày công";
                case 7:
                    return "Hệ số lương";
                case 8:
                    return "Lương";
            }
            return null;
        }

        @Override
        public int getColumnCount() {
            return 9; 
        }

        @Override
        public int getRowCount() {
            return list.size(); 
        }
        
    }

    @SuppressWarnings("unchecked")                     
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jl_QLNV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jc_SearchNV = new javax.swing.JComboBox<>();
        jt_SearchNV = new javax.swing.JTextField();
        btn_AddNV = new javax.swing.JButton();
        jbn_DeleteNV = new javax.swing.JButton();
        jbt_UpdateNV = new javax.swing.JButton();
        btn_BackNV = new javax.swing.JButton();
        btn_ChangeNV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jl_QLNV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_QLNV.setForeground(java.awt.Color.white);
        jl_QLNV.setText("QUẢN LÝ NHÂN VIÊN");

        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "SĐT", "Ngày công", "Hệ số lương", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tbStaff);

        jc_SearchNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jc_SearchNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm Mã", "Tìm Tên", "Tìm SĐT" }));
        jc_SearchNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_SearchNVActionPerformed(evt);
            }
        });

        btn_AddNV.setBackground(new java.awt.Color(0, 102, 102));
        btn_AddNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AddNV.setForeground(java.awt.Color.white);
        btn_AddNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thêm 23.png")); // NOI18N
        btn_AddNV.setText("Thêm");
        btn_AddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNVActionPerformed(evt);
            }
        });

        jbn_DeleteNV.setBackground(new java.awt.Color(0, 102, 102));
        jbn_DeleteNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbn_DeleteNV.setForeground(java.awt.Color.white);
        jbn_DeleteNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\xoá.png")); // NOI18N
        jbn_DeleteNV.setText("Xoá");
        jbn_DeleteNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_DeleteNVActionPerformed(evt);
            }
        });

        jbt_UpdateNV.setBackground(new java.awt.Color(0, 102, 102));
        jbt_UpdateNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_UpdateNV.setForeground(java.awt.Color.white);
        jbt_UpdateNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\cập nhật 23.png")); // NOI18N
        jbt_UpdateNV.setText("Cập nhật");
        jbt_UpdateNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_UpdateNVActionPerformed(evt);
            }
        });

        btn_BackNV.setBackground(new java.awt.Color(0, 102, 102));
        btn_BackNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_BackNV.setForeground(java.awt.Color.white);
        btn_BackNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        btn_BackNV.setText("Quay lại");
        btn_BackNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackNVActionPerformed(evt);
            }
        });

        btn_ChangeNV.setBackground(new java.awt.Color(0, 102, 102));
        btn_ChangeNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ChangeNV.setForeground(java.awt.Color.white);
        btn_ChangeNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\sửa 23.png")); // NOI18N
        btn_ChangeNV.setText("Sửa");
        btn_ChangeNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_QLNV)
                .addGap(269, 269, 269))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn_ChangeNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jbn_DeleteNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbt_UpdateNV)
                                .addGap(30, 30, 30)
                                .addComponent(btn_BackNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jc_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jl_QLNV)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AddNV)
                            .addComponent(btn_ChangeNV)
                            .addComponent(jbn_DeleteNV)
                            .addComponent(jbt_UpdateNV)
                            .addComponent(btn_BackNV))
                        .addGap(33, 33, 33))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\backgrounds\\snow800x600.gif")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>  
    private void btn_AddNVActionPerformed(java.awt.event.ActionEvent evt) {                                          
        AddNhanVien nv = new AddNhanVien();
        nv.setVisible(true);
    }                                         

    private void btn_ChangeNVActionPerformed(java.awt.event.ActionEvent evt) {                                             
        SuaNhanVien nv = new SuaNhanVien();
        nv.setVisible(true);
    }                                            
                                                                                     

    private void jbt_UpdateNVActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            StaffManager sm = new StaffManager();
            jt_SearchNV.setText("");
            Model model = new Model();
            this.list = sm.getListNV();
            this.tbStaff.setModel(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void jbn_DeleteNVActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            StaffManager sm = new StaffManager(); 
            Model model = new Model();
            int row = -1;
            row = tbStaff.getSelectedRow();              //Lấy hàng được click
            if (row != -1) 
            {   
                int MaNV = (int) tbStaff.getValueAt(row, 0);  //Lấy giá trị của phần tử hàng được chọn, cột 0
                sm.deleteNV_follow_MaNV(MaNV);                          //Xóa hàng được chọn theo MaNV (Dùng hàm deleteNV_follow_MaNV)
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    //Cập nhật lại bảng sau khi xóa nhân viên
                this.list = sm.getListNV();
                this.tbStaff.setModel(model);
            } 
            else JOptionPane.showMessageDialog(null, "Vui lòng click vào hàng cần xóa!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    
    private void jc_SearchNVActionPerformed(java.awt.event.ActionEvent evt) { 
          //Lấy yêu cầu tìm kiếm
        String Search = jc_SearchNV.getSelectedItem().toString();
        switch(Search)
        {
            case "Tìm Mã":
            {
                try {
                          //Lấy dữ liệu từ ô tìm kiếm
                    int Search_Text = Integer.parseInt(jt_SearchNV.getText());
                            //Kiểm tra dữ liệu vừa lấy
                    if (String.valueOf(Search_Text).equals(""))
                    {    
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                    }
                    else 
                    {
                        try {
                            int check;
                            StaffManager sm = new StaffManager();
                                  //Kiểm tra xem mã nhân viên nhập có đúng????
                            check = (sm.Check_MaNV(Search_Text))?1:0;
                            switch(check){
                                case 0:
                                {
                                    JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại");
                                    jt_SearchNV.setText("");
                                    break;
                                }
                                case 1:
                                {  
                                      //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng
                                    Model model = new Model();
                                    this.list = sm.getListNV_follow_MaNV(Search_Text);
                                    this.tbStaff.setModel(model);
                                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                    break;
                                }      
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dạng mã nhân viên!");
                    jt_SearchNV.setText("");
                }
                break;
            }
            case "Tìm Tên":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = jt_SearchNV.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        StaffManager sm = new StaffManager();
                           //Kiểm tra xem Tên nhân viên nhập có đúng????
                        check = (sm.Check_TenNV(Search_Text))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Tên nhân viên không tồn tại");
                                jt_SearchNV.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.list = sm.getListNV_follow_TenNV(Search_Text);
                                this.tbStaff.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case "Tìm SĐT":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = jt_SearchNV.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        StaffManager sm = new StaffManager();
                           //Kiểm tra xem SĐT nhân viên nhập có đúng????
                        check = (sm.Check_SDT(Integer.parseInt(Search_Text)))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "SĐT nhân viên không tồn tại");
                                jt_SearchNV.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.list = sm.getListNV_follow_SDT(Integer.parseInt(Search_Text));
                                this.tbStaff.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
        }
    }

    private void btn_BackNVActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }                                          
                 
    private javax.swing.JButton btn_AddNV;
    private javax.swing.JButton btn_BackNV;
    private javax.swing.JButton btn_ChangeNV;
    private javax.swing.JComboBox jc_SearchNV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbn_DeleteNV;
    private javax.swing.JButton jbt_UpdateNV;
    private javax.swing.JLabel jl_QLNV;
    private javax.swing.JTextField jt_SearchNV;
    private javax.swing.JTable tbStaff;   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}


