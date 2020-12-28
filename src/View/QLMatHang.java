package View;

import Controller.ProductManager;
import Model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLMatHang extends javax.swing.JFrame {
    public QLMatHang() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            ProductManager pm = new ProductManager();
            Model model = new Model();
            this.listMH = pm.getListMH();
            this.tbProduct.setModel(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    List<Product> listMH = new ArrayList<>();
    private class Model extends DefaultTableModel{

        @Override
        public Object getValueAt(int row, int column) {
            switch (column){
                case 0: 
                    return listMH.get(row).getSttMH();
                case 1: 
                    return listMH.get(row).getMaMH();
                case 2: 
                    return listMH.get(row).getTenMH();
                case 3: 
                    return listMH.get(row).getLoaiMH();
                case 4: 
                    return listMH.get(row).getHangSX();
                case 5: 
                    return listMH.get(row).getSoLuong();
                case 6: 
                    return listMH.get(row).getDonGia();
            }
            return null;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        //"STT", "Mã mặt hàng", "Tên mặt hàng", "Loại mặt hàng", "Hãng sản xuất", "Số lượng", "Đơn giá"
        @Override
        public String getColumnName(int column) {
            switch (column){
                case 0: 
                    return "Số thứ tự";
                case 1: 
                    return "Mã mặt hàng";
                case 2: 
                    return "Tên mặt hàng";
                case 3: 
                    return "Loại mặt hàng";
                case 4: 
                    return "Hãng sản xuất";
                case 5: 
                    return "Số lượng";
                case 6: 
                    return "Đơn giá";
            }
            return null;
        }

        @Override
        public int getColumnCount() {
            return 7; 
        }

        @Override
        public int getRowCount() {
            return listMH.size(); 
        }
        
    }

    @SuppressWarnings("unchecked")                     
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jc_SearchMH = new javax.swing.JComboBox<>();
        tf_SearchMH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        btn_BackMH = new javax.swing.JButton();
        btn_UpdateMH = new javax.swing.JButton();
        btn_DeleteMH = new javax.swing.JButton();
        btn_ChangeMH = new javax.swing.JButton();
        btn_AddMH = new javax.swing.JButton();
        jl_ListMH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\quản lý mặt hàng 23.png")); // NOI18N
        jLabel2.setText("QUẢN LÝ MẶT HÀNG");

        jc_SearchMH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jc_SearchMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm Mã", "Tìm Tên", "Tìm Loại", "Tìm Hãng" }));
        jc_SearchMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_SearchMHActionPerformed(evt);
            }
        });

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tbProduct);

        btn_BackMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_BackMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_BackMH.setForeground(new java.awt.Color(255, 255, 255));
        btn_BackMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        btn_BackMH.setText("Quay lại");
        btn_BackMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackMHActionPerformed(evt);
            }
        });

        btn_UpdateMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_UpdateMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_UpdateMH.setForeground(new java.awt.Color(255, 255, 255));
        btn_UpdateMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\cập nhật 23.png")); // NOI18N
        btn_UpdateMH.setText("Cập nhật");
        btn_UpdateMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateMHActionPerformed(evt);
            }
        });

        btn_DeleteMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_DeleteMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_DeleteMH.setForeground(new java.awt.Color(255, 255, 255));
        btn_DeleteMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\xoá.png")); // NOI18N
        btn_DeleteMH.setText("Xoá");
        btn_DeleteMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteMHActionPerformed(evt);
            }
        });

        btn_ChangeMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_ChangeMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ChangeMH.setForeground(new java.awt.Color(255, 255, 255));
        btn_ChangeMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\sửa 23.png")); // NOI18N
        btn_ChangeMH.setText("Sửa");
        btn_ChangeMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeMHActionPerformed(evt);
            }
        });

        btn_AddMH.setBackground(new java.awt.Color(0, 102, 102));
        btn_AddMH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AddMH.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thêm 23.png")); // NOI18N
        btn_AddMH.setText("Thêm");
        btn_AddMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jc_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btn_AddMH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btn_ChangeMH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btn_DeleteMH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btn_UpdateMH)
                                .addGap(26, 26, 26)
                                .addComponent(btn_BackMH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel2)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AddMH)
                            .addComponent(btn_ChangeMH)
                            .addComponent(btn_DeleteMH)
                            .addComponent(btn_UpdateMH)
                            .addComponent(btn_BackMH))
                        .addGap(30, 30, 30))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jl_ListMH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\backgrounds\\snow800x600.gif")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jl_ListMH, gridBagConstraints);

        pack();
    }// </editor-fold>                             

    private void btn_AddMHActionPerformed(java.awt.event.ActionEvent evt) {                                          
        AddMatHang mh = new AddMatHang();
        mh.setVisible(true);
    }                                         
                                            

    private void btn_BackMHActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }  
     private void btn_UpdateMHActionPerformed(java.awt.event.ActionEvent evt) {                                           
         try {
            ProductManager pm = new ProductManager();
            Model model = new Model();
            this.listMH = pm.getListMH();
            this.tbProduct.setModel(model);
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     private void jc_SearchMHActionPerformed(java.awt.event.ActionEvent evt) { 
          //Lấy yêu cầu tìm kiếm
        String Search = jc_SearchMH.getSelectedItem().toString();
        switch(Search)
        {
            case "Tìm Mã":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = tf_SearchMH.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        ProductManager pm = new ProductManager();
                           //Kiểm tra xem mã mặt hang nhập có đúng????
                        check = (pm.check_MaMH(Search_Text))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Mã mặt hàng không tồn tại");
                                tf_SearchMH.setText("");
                                break;
                            }
                            case 1:
                            {  
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.listMH = pm.getListMH_follow_MaMH(Search_Text);
                                this.tbProduct.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case "Tìm Tên":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = tf_SearchMH.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        ProductManager pm = new ProductManager();
                           //Kiểm tra xem Tên mặt hàng nhập có đúng????
                        check = (pm.Check_TenMH(Search_Text))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Tên mặt hàng không tồn tại");
                                tf_SearchMH.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.listMH = pm.getListMH_follow_TenMH(Search_Text);
                                this.tbProduct.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case "Tìm Loại":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = tf_SearchMH.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        ProductManager pm = new ProductManager();
                           //Kiểm tra xem Loại mặt hàng nhập có đúng????
                        check = (pm.Check_LoaiMH(Search_Text))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Loại mặt hàng không tồn tại");
                                tf_SearchMH.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.listMH = pm.getListMH_follow_LoaiMH(Search_Text);
                                this.tbProduct.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
           case "Tìm Hãng":
               {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = tf_SearchMH.getText();
                   //Kiểm tra dữ liệu vừa lấy
                if (Search_Text.equals(""))
                {    
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu muốn tìm kiếm vào ô trống");
                }
                else 
                {
                    try {
                        int check;
                        ProductManager pm = new ProductManager();
                           //Kiểm tra xem Hãng sản xuất nhập có đúng????
                        check = (pm.Check_HangSX(Search_Text))?1:0;
                        switch(check){
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Loại mặt hàng không tồn tại");
                                tf_SearchMH.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                Model model = new Model();
                                this.listMH = pm.getListMH_follow_HangSX(Search_Text);
                                this.tbProduct.setModel(model);
                                JOptionPane.showMessageDialog(null, "Tìm kiếm thành công!");
                                break;
                            }      
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
        }
    }
     
     private void btn_DeleteMHActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            ProductManager pm = new ProductManager(); 
            Model model = new Model();
            int row = -1;
            row = tbProduct.getSelectedRow();              //Lấy hàng được click
            if (row != -1) 
            {   
                String MaMH = (String) tbProduct.getValueAt(row, 1);  //Lấy giá trị của phần tử hàng được chọn, cột 0
                pm.deleteProduct(MaMH);                          //Xóa hàng được chọn theo MaMH (Dùng hàm deleteMH_follow_MaMH)
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    //Cập nhật lại bảng sau khi xóa mặt hàng
                this.listMH = pm.getListMH();
                this.tbProduct.setModel(model);
            } 
            else JOptionPane.showMessageDialog(null, "Vui lòng click vào hàng cần xóa!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QLMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
     
     
     private void btn_ChangeMHActionPerformed(java.awt.event.ActionEvent evt) { 
         SuaMatHang sm=new SuaMatHang();
         sm.setVisible(true);
    }
    
              
    private javax.swing.JButton btn_AddMH;
    private javax.swing.JButton btn_BackMH;
    private javax.swing.JButton btn_DeleteMH;
    private javax.swing.JComboBox<String> jc_SearchMH;
    private javax.swing.JButton btn_UpdateMH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_ListMH;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField tf_SearchMH;   
    private javax.swing.JButton btn_ChangeMH;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
}



