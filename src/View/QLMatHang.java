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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jl_ListMH = new javax.swing.JLabel();
        btn_AddMH = new javax.swing.JButton();
        btn_DeleteMH = new javax.swing.JButton();
        tf_SearchMH = new javax.swing.JTextField();
        jc_SearchMH = new javax.swing.JComboBox<>();
        btn_UpdateMH = new javax.swing.JButton();
        btn_BackMH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        
        jScrollPane1.setViewportView(tbProduct);

        jl_ListMH.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jl_ListMH.setText("QUẢN LÝ MẶT HÀNG");

        btn_AddMH.setText("Thêm ");
        btn_AddMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddMHActionPerformed(evt);
            }
        });

        btn_DeleteMH.setText("Xóa");
        btn_DeleteMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteMHActionPerformed(evt);
            }
        });

        jc_SearchMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm Mã", "Tìm kiếm Tên", "Tìm kiếm Loại", "Tìm kiếm Hãng" }));
        jc_SearchMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_SearchMHActionPerformed(evt);
            }
        });

        btn_UpdateMH.setText("Cập nhật");
        btn_UpdateMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateMHActionPerformed(evt);
            }
        });

        btn_BackMH.setText("Quay lại");
        btn_BackMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_ListMH, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jc_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_AddMH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btn_UpdateMH)
                        .addGap(69, 69, 69)
                        .addComponent(btn_DeleteMH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_BackMH)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jl_ListMH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_SearchMH)
                    .addComponent(tf_SearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DeleteMH)
                    .addComponent(btn_UpdateMH)
                    .addComponent(btn_AddMH)
                    .addComponent(btn_BackMH))
                .addGap(22, 22, 22))
        );

        pack();
    }                   

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
            case "Tìm kiếm Mã":
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
            case "Tìm kiếm Tên":
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
            case "Tìm kiếm Loại":
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
           case "Tìm kiếm Hãng":
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
    
              
    private javax.swing.JButton btn_AddMH;
    private javax.swing.JButton btn_BackMH;
    private javax.swing.JButton btn_DeleteMH;
    private javax.swing.JComboBox<String> jc_SearchMH;
    private javax.swing.JButton btn_UpdateMH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_ListMH;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField tf_SearchMH;                  
}



