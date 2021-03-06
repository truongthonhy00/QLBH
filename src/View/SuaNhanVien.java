/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StaffManager;
import Model.Staff;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SuaNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form SuaNhanVienTable
     */
    public SuaNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            StaffManager sm = new StaffManager();
            Model model = new Model();
            this.list = sm.getListNV();
            this.tb_NV.setModel(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupNam_Nu = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jc_Search = new javax.swing.JComboBox<>();
        jc_Search_Text = new javax.swing.JTextField();
        jl_MaNV = new javax.swing.JLabel();
        jl_ShowMaNV = new javax.swing.JLabel();
        jl_TenNV = new javax.swing.JLabel();
        jl_NgaySinhNV = new javax.swing.JLabel();
        jl_DiaChiNV = new javax.swing.JLabel();
        jl_GioiTinhNV = new javax.swing.JLabel();
        jl_SDTNV = new javax.swing.JLabel();
        jl_HSLNV = new javax.swing.JLabel();
        jl_NgayCongNV = new javax.swing.JLabel();
        jl_LuongNV = new javax.swing.JLabel();
        jl_VND = new javax.swing.JLabel();
        jrb_Nam = new javax.swing.JRadioButton();
        jrb_Nu = new javax.swing.JRadioButton();
        tf_TenNV = new javax.swing.JTextField();
        tf_NgaySinhNV = new javax.swing.JTextField();
        tf_DiaChiNV = new javax.swing.JTextField();
        tf_SDTNV = new javax.swing.JTextField();
        tf_HSLNV = new javax.swing.JTextField();
        tf_NgayCongNV = new javax.swing.JTextField();
        jbt_TinhLuong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_NV = new javax.swing.JTable();
        jbt_LayDuLieu_NV = new javax.swing.JButton();
        jbt_Luu_NV = new javax.swing.JButton();
        jtb_QuayLai = new javax.swing.JButton();
        jl_TongLuongNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THAY ĐỔI THÔNG TIN NHÂN VIÊN");

        jc_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jc_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm Mã", "Tìm Tên", "Tìm SĐT" }));
        jc_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_SearchActionPerformed(evt);
            }
        });

        jl_MaNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_MaNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_MaNV.setText("Mã Nhân viên:");

        jl_ShowMaNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_ShowMaNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_ShowMaNV.setText("0");

        jl_TenNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_TenNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_TenNV.setText("Họ tên:");

        jl_NgaySinhNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NgaySinhNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_NgaySinhNV.setText("Ngày sinh:");

        jl_DiaChiNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_DiaChiNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_DiaChiNV.setText("Địa chỉ:");

        jl_GioiTinhNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_GioiTinhNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_GioiTinhNV.setText("Giới tính:");

        jl_SDTNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_SDTNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_SDTNV.setText("Điện thoại:");

        jl_HSLNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_HSLNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_HSLNV.setText("Hệ số lương:");

        jl_NgayCongNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NgayCongNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_NgayCongNV.setText("Ngày công:");

        jl_LuongNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_LuongNV.setForeground(new java.awt.Color(255, 255, 255));
        jl_LuongNV.setText("Lương:");

        jl_VND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_VND.setText("VND");

        buttonGroupNam_Nu.add(jrb_Nam);
        jrb_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrb_Nam.setText("Nam");
     

        buttonGroupNam_Nu.add(jrb_Nu);
        jrb_Nu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrb_Nu.setText("Nữ");


        jbt_TinhLuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt_TinhLuong.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\tính lương 23.png")); // NOI18N
        jbt_TinhLuong.setText("Tính Lương");
        jbt_TinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_TinhLuongActionPerformed(evt);
            }
        });

        tb_NV.setModel(new javax.swing.table.DefaultTableModel(
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
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tb_NV);

        jbt_LayDuLieu_NV.setBackground(new java.awt.Color(0, 102, 102));
        jbt_LayDuLieu_NV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_LayDuLieu_NV.setForeground(java.awt.Color.white);
        jbt_LayDuLieu_NV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\lấy dữ liệu 23.png")); // NOI18N
        jbt_LayDuLieu_NV.setText("Lấy Dữ liệu");
        jbt_LayDuLieu_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_LayDuLieu_NVActionPerformed(evt);
            }
        });

        jbt_Luu_NV.setBackground(new java.awt.Color(0, 102, 102));
        jbt_Luu_NV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_Luu_NV.setForeground(java.awt.Color.white);
        jbt_Luu_NV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\lưu 23.png")); // NOI18N
        jbt_Luu_NV.setText("Lưu");
        jbt_Luu_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_Luu_NVActionPerformed(evt);
            }
        });

        jtb_QuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jtb_QuayLai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtb_QuayLai.setForeground(java.awt.Color.white);
        jtb_QuayLai.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        jtb_QuayLai.setText("Quay lại");
        jtb_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_QuayLaiActionPerformed(evt);
            }
        });

        jl_TongLuongNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_TongLuongNV.setText("Tổng lương");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jbt_LayDuLieu_NV)
                .addGap(76, 76, 76)
                .addComponent(jbt_Luu_NV)
                .addGap(92, 92, 92)
                .addComponent(jtb_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(191, 191, 191))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jc_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jc_Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jl_MaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jl_TenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jl_NgaySinhNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jl_DiaChiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_DiaChiNV)
                                    .addComponent(tf_NgaySinhNV)
                                    .addComponent(tf_TenNV)
                                    .addComponent(jl_ShowMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbt_TinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_SDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_NgayCongNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_GioiTinhNV)
                            .addComponent(jl_HSLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_LuongNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_TongLuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_VND))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrb_Nam)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_Nu))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_SDTNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(tf_NgayCongNV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_HSLNV, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(87, 87, 87)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_Nam)
                    .addComponent(jrb_Nu)
                    .addComponent(jl_MaNV)
                    .addComponent(jl_ShowMaNV)
                    .addComponent(jl_GioiTinhNV))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_SDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_TenNV)
                    .addComponent(jl_SDTNV))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_HSLNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_NgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NgaySinhNV)
                    .addComponent(jl_HSLNV))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NgayCongNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NgayCongNV)
                    .addComponent(tf_DiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_DiaChiNV))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_TinhLuong)
                    .addComponent(jl_VND)
                    .addComponent(jl_TongLuongNV)
                    .addComponent(jl_LuongNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_Luu_NV)
                    .addComponent(jtb_QuayLai)
                    .addComponent(jbt_LayDuLieu_NV))
                .addGap(22, 22, 22))
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

    private void jc_SearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
         //Lấy yêu cầu tìm kiếm
        String Search = jc_Search.getSelectedItem().toString();
        Model model = new Model();
        switch(Search)
        {
            case "Tìm Mã":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = jc_Search_Text.getText();
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
                                jc_Search_Text.setText("");
                                break;
                            }
                            case 1:
                            {  
                                   //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng               
                                this.list = sm.getListNV_follow_MaNV(Integer.parseInt(Search_Text));
                                this.tb_NV.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case "Tìm Tên":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = jc_Search_Text.getText();
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
                                jc_Search_Text.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng
                                this.list = sm.getListNV_follow_TenNV(Search_Text);
                                this.tb_NV.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case "Tìm SĐT":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = jc_Search_Text.getText();
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
                                jc_Search_Text.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds nhân viên sau khi lọc tìm kiếm lên bảng
                                this.list = sm.getListNV_follow_SDT(Integer.parseInt(Search_Text));
                                this.tb_NV.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
        }
    }                                         

    private void jbt_LayDuLieu_NVActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            StaffManager sm = new StaffManager(); 
            int row = -1;
            row = tb_NV.getSelectedRow();              //Lấy hàng được click
            if (row != -1) 
            {   
                int MaNV = (int) tb_NV.getValueAt(row, 0);  //Lấy giá trị của phần tử hàng được chọn, cột 0  
                  
                   //Tạo mảng chứa ds nhân viên được click
                List<Staff> NV = sm.getListNV_follow_MaNV(MaNV); 
                
                  //Lấy dữ liệu của phần tử thứ 0 lên các Text(Vì trong mảng chỉ có 1 nhân viên ở vị trí 0)
                jl_ShowMaNV.setText(String.valueOf(NV.get(0).getMaNV()));
                tf_TenNV.setText(NV.get(0).getName());
                
                SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_NgaySinhNV.setText(mySimpleDateFormat.format(NV.get(0).getNgaySinh()));
                
                tf_DiaChiNV.setText(NV.get(0).getAddress());
                tf_SDTNV.setText(String.valueOf(NV.get(0).getPhone()));
                tf_HSLNV.setText(String.valueOf(NV.get(0).getHeSoLuong()));
                tf_NgayCongNV.setText(String.valueOf(NV.get(0).getNgayCong()));
                jl_TongLuongNV.setText(String.valueOf(NV.get(0).getLuong()));
                
                String gt = NV.get(0).getGender();
                if("Nam".equals(gt)){
                            jrb_Nam.setSelected(true);
                        }
                        else{
                            jrb_Nu.setSelected(true);
                        }
            } 
            else JOptionPane.showMessageDialog(null, "Vui lòng click vào hàng cần lấy dữ liệu!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                

    private void jbt_Luu_NVActionPerformed(java.awt.event.ActionEvent evt) { 
            //Xử lý lỗi để trống
        if (tf_TenNV.equals("") || tf_NgaySinhNV.equals("") || tf_DiaChiNV.equals("") ||
                    (!jrb_Nam.isSelected() && !jrb_Nu.isSelected()) || tf_SDTNV.getText().equals("") || tf_NgayCongNV.getText().equals("") || tf_HSLNV.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        }
        else 
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setLenient(false);
            int flag = 0;
            try {           
                String maNV = jl_ShowMaNV.getText();
                String hoTen = tf_TenNV.getText();
                String Text_ngaySinh = tf_NgaySinhNV.getText();
                String diaChi = tf_DiaChiNV.getText();
                flag = 1;
                int phone = Integer.parseInt(tf_SDTNV.getText());
                flag = 2;
                float ngayCong = Float.parseFloat(tf_NgayCongNV.getText());
                flag = 3;
                float heSoLuong = Float.parseFloat(tf_HSLNV.getText());
                float luong = Float.parseFloat(jl_TongLuongNV.getText());
            
                df.parse(Text_ngaySinh);
                Date ngaySinh1 = new SimpleDateFormat("yyyy-MM-dd").parse(Text_ngaySinh);
                try{
                    StaffManager sm = new StaffManager();
                    SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date Date_NgaySinh = (mySimpleDateFormat.parse(Text_ngaySinh));
            
                    sm.updateNV((Integer.parseInt(maNV)), hoTen, ngaySinh1, diaChi, jrb_Nam.isSelected()?"Nam":"Nữ", phone, ngayCong, heSoLuong, luong);
                    JOptionPane.showMessageDialog(null, "Thay đổi thông tin nhân viên thành công!");
                            
                      //Xóa dữ liệu trên các Text
                    jl_ShowMaNV.setText("");
                    tf_TenNV.setText("");
                    tf_NgaySinhNV.setText("");
                    tf_DiaChiNV.setText("");
                    tf_SDTNV.setText("");
                    tf_NgayCongNV.setText("");
                    tf_HSLNV.setText("");
                    jl_TongLuongNV.setText("0");
                    buttonGroupNam_Nu.clearSelection(); 
                            
                        //Cập nhật lại bảng
                    Model model = new Model();
                    this.list = sm.getListNV();
                    this.tb_NV.setModel(model);       
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (Exception ex) {
                    Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai ngày sinh!\nVui lòng nhập lại!");
                tf_NgaySinhNV.setText("");
            } catch (NumberFormatException ex){
                switch(flag)
                {
                    case 1:
                    {
                        JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho số điện thoại!\nVui lòng nhập lại!");
                        tf_SDTNV.setText("");
                        break;
                    }
                    case 2:
                    {
                       JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho ngày công!\nVui lòng nhập lại!");
                       tf_NgayCongNV.setText("");
                       break;
                    }
                    case 3:
                    {
                       JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho hệ số lương!\nVui lòng nhập lại!");
                       tf_HSLNV.setText("");
                       break;
                    }
                }
            }
        }
    }   

    private void jtb_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
    }                                           

    private void jbt_TinhLuongActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int flag = 0;
        try {  
            flag = 1;
            float ngayCong = Float.parseFloat(tf_NgayCongNV.getText());
            flag = 2;
            float heSoLuong = Float.parseFloat(tf_HSLNV.getText());
            if (String.valueOf(ngayCong).equals("") || String.valueOf(heSoLuong).equals("")){
            JOptionPane.showMessageDialog(null, "Chưa nhập Ngày công hoặc Hệ số lương");
            }
            else
            {
                float Luong = ngayCong * heSoLuong *200000;
                int luong = (int)Luong;
                jl_TongLuongNV.setText(Integer.toString(luong));
            }
        } catch (NumberFormatException ex){
            switch(flag)
            {
                 case 1:
                {
                    JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho ngày công!\nVui lòng nhập lại!");
                    tf_NgayCongNV.setText("");
                    break;
                }
                 case 2:
                {
                    JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho hệ số lương!\nVui lòng nhập lại!");
                    tf_HSLNV.setText("");
                    break;
                }
            }
        }
    }                                             
    

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_LayDuLieu_NV;
    private javax.swing.JButton jbt_Luu_NV;
    private javax.swing.JButton jbt_TinhLuong;
    private javax.swing.JComboBox<String> jc_Search;
    private javax.swing.JTextField jc_Search_Text;
    private javax.swing.JLabel jl_DiaChiNV;
    private javax.swing.JLabel jl_GioiTinhNV;
    private javax.swing.JLabel jl_HSLNV;
    private javax.swing.JLabel jl_LuongNV;
    private javax.swing.JLabel jl_ShowMaNV;
    private javax.swing.JLabel jl_MaNV;
    private javax.swing.JLabel jl_NgayCongNV;
    private javax.swing.JLabel jl_NgaySinhNV;
    private javax.swing.JLabel jl_SDTNV;
    private javax.swing.JLabel jl_TenNV;
    private javax.swing.JLabel jl_TongLuongNV;
    private javax.swing.JLabel jl_VND;
    private javax.swing.JRadioButton jrb_Nam;
    private javax.swing.JRadioButton jrb_Nu;
    private javax.swing.JButton jtb_QuayLai;
    private javax.swing.JTable tb_NV;
    private javax.swing.JTextField tf_DiaChiNV;
    private javax.swing.JTextField tf_HSLNV;
    private javax.swing.JTextField tf_NgayCongNV;
    private javax.swing.JTextField tf_NgaySinhNV;
    private javax.swing.JTextField tf_SDTNV;
    private javax.swing.JTextField tf_TenNV;
    private javax.swing.ButtonGroup buttonGroupNam_Nu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;               
}









