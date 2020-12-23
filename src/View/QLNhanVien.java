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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jl_QLNV = new javax.swing.JLabel();
        btn_AddNV = new javax.swing.JButton();
        btn_ChangeNV = new javax.swing.JButton();
        jc_SearchNV = new javax.swing.JComboBox<>();
        jt_SearchNV = new javax.swing.JTextField();
        jbn_DeleteNV = new javax.swing.JButton();
        jbt_UpdateNV = new javax.swing.JButton();
        btn_BackNV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbStaff.setFont(new java.awt.Font("Tahoma", 0, 12)); 
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Ngày công", "Hệ số lương", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Long.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbStaff);

        jl_QLNV.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jl_QLNV.setText("QUẢN LÝ NHÂN VIÊN");

        btn_AddNV.setText("Thêm");
        btn_AddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNVActionPerformed(evt);
            }
        });

        btn_ChangeNV.setText("Sửa");
        btn_ChangeNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeNVActionPerformed(evt);
            }
        });

        jc_SearchNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm Mã", "Tìm kiếm Tên", "Tìm kiếm SĐT" }));
        jc_SearchNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_SearchNVActionPerformed(evt);
            }
        });

        jbn_DeleteNV.setText("Xóa");
        jbn_DeleteNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_DeleteNVActionPerformed(evt);
            }
        });

        jbt_UpdateNV.setText("Cập nhật");
        jbt_UpdateNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_UpdateNVActionPerformed(evt);
            }
        });

        btn_BackNV.setText("Quay lại");
        btn_BackNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jc_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_ChangeNV, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jbn_DeleteNV)
                        .addGap(65, 65, 65)
                        .addComponent(jbt_UpdateNV)
                        .addGap(54, 54, 54)
                        .addComponent(btn_BackNV)
                        .addGap(55, 55, 55)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_QLNV)
                .addGap(313, 313, 313))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jl_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_SearchNV)
                    .addComponent(jt_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AddNV)
                            .addComponent(btn_ChangeNV)
                            .addComponent(jbn_DeleteNV)
                            .addComponent(jbt_UpdateNV)
                            .addComponent(btn_BackNV))
                        .addGap(42, 42, 42))))
        );

        pack();
    }
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
            case "Tìm kiếm Mã":
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
                           //Kiểm tra xem mã nhân viên nhập có đúng????
                        check = (sm.Check_MaNV(Integer.parseInt(Search_Text)))?1:0;
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
                                this.list = sm.getListNV_follow_MaNV(Integer.parseInt(Search_Text));
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
            case "Tìm kiếm Tên":
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
            case "Tìm kiếm SĐT":
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
}


