/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProductManager;
import Model.Product;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngong
 */
public class SuaMatHang extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SuaMatHang() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            ProductManager pm = new ProductManager();
            Model model = new Model();
            this.listMH = pm.getListMH();
            this.tb_MH.setModel(model);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_form = new javax.swing.JLabel();
        lb_MaMH = new javax.swing.JLabel();
        lb_TenMH = new javax.swing.JLabel();
        lb_LoaiMH = new javax.swing.JLabel();
        lb_HangSX = new javax.swing.JLabel();
        lb_SoLuong = new javax.swing.JLabel();
        lb_DonGia = new javax.swing.JLabel();
        tf_LoaiMH = new javax.swing.JTextField();
        tf_HangSX = new javax.swing.JTextField();
        tf_DonGia = new javax.swing.JTextField();
        tf_SoLuong = new javax.swing.JTextField();
        tf_TenMH = new javax.swing.JTextField();
        Text_MaMH = new javax.swing.JLabel();
        jc_search = new javax.swing.JComboBox<>();
        tf_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_MH = new javax.swing.JTable();
        jb_getdata = new javax.swing.JButton();
        jb_save = new javax.swing.JButton();
        jb_return = new javax.swing.JButton();
        vnd = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_form.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_form.setText("THAY ĐỔI THÔNG TIN MẶT HÀNG");
         

        lb_MaMH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_MaMH.setText("Mã mặt hàng");
        
        Text_MaMH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Text_MaMH.setText("0");

        lb_TenMH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_TenMH.setText("Tên mặt hàng");

        lb_LoaiMH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_LoaiMH.setText("Loại mặt hàng");

        lb_HangSX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_HangSX.setText("Hãng sản xuất");

        lb_SoLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_SoLuong.setText("Số lượng");

        lb_DonGia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_DonGia.setText("Đơn giá");


        jc_search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jc_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm Mã", "Tìm kiếm Tên", "Tìm kiếm Loại", "Tìm kiếm Hãng" }));
        jc_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_searchActionPerformed(evt);
            }
        });

        tb_MH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Số thứ tự", "Mã mặt hàng", "Tên mặt hàng", "Loại mặt hàng", "Hãng sản xuất", "Số lượng", "Đơn giá"
            }
        ));
        jScrollPane1.setViewportView(tb_MH);

        jb_getdata.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_getdata.setText("Lấy dữ liệu");
        jb_getdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_getdataActionPerformed(evt);
            }
        });

        jb_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_save.setText("Lưu");
        jb_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveActionPerformed(evt);
            }
        });

        jb_return.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_return.setText("Quay lại");
        jb_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_returnActionPerformed(evt);
            }
        });

        vnd.setText("VND");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_LoaiMH)
                        .addGap(18, 18, 18)
                        .addComponent(tf_LoaiMH, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_TenMH)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_MaMH)
                                .addGap(22, 22, 22)))
              
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)         
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Text_MaMH, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(tf_TenMH, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_SoLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_HangSX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_HangSX, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_form)
                                .addGap(161, 161, 161))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jc_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jb_getdata)
                .addGap(60, 60, 60)
                .addComponent(jb_save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jb_return)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lb_form)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))        
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_MaMH)
                    .addComponent(tf_HangSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_HangSX)
                    .addComponent(Text_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TenMH)
                    .addComponent(tf_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_SoLuong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_LoaiMH)
                    .addComponent(tf_LoaiMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_DonGia)
                    .addComponent(tf_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vnd))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_getdata)
                    .addComponent(jb_save)
                    .addComponent(jb_return))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }


    private void jb_getdataActionPerformed(java.awt.event.ActionEvent evt) {                                           
    try {
            ProductManager pm = new ProductManager(); 
            int row = -1;
            row = tb_MH.getSelectedRow();              //Lấy hàng được click
            if (row != -1) 
            {   
                String MaMH = (String) tb_MH.getValueAt(row, 1);  //Lấy giá trị của phần tử hàng được chọn, cột 0  

                   //Tạo mảng chứa ds mặt hàng được click
                List<Product> pd = pm.getListMH_follow_MaMH(MaMH); 

                  //Lấy dữ liệu của phần tử thứ 0 lên các Text(Vì trong mảng chỉ có 1 mặt hàng ở vị trí 0)
                Text_MaMH.setText(pd.get(0).getMaMH());
                tf_TenMH.setText(pd.get(0).getTenMH());
                tf_LoaiMH.setText(pd.get(0).getLoaiMH());
                tf_HangSX.setText(pd.get(0).getHangSX());
                tf_SoLuong.setText(String.valueOf(pd.get(0).getSoLuong()));
                tf_DonGia.setText(String.valueOf(pd.get(0).getDonGia()));
            } 
            else JOptionPane.showMessageDialog(null, "Vui lòng click vào hàng cần lấy dữ liệu!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaMatHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SuaMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jc_searchActionPerformed(java.awt.event.ActionEvent evt) {                                          
         String Search = jc_search.getSelectedItem().toString();
        switch(Search)
        {
            case "Tìm kiếm Mã":
            {
                   //Lấy dữ liệu từ ô tìm kiếm
                String Search_Text = tf_search.getText();
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
                                tf_search.setText("");
                                break;
                            }
                            case 1:
                            {  
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                SuaMatHang.Model model = new SuaMatHang.Model();
                                this.listMH = pm.getListMH_follow_MaMH(Search_Text);
                                this.tb_MH.setModel(model);
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
                String Search_Text = tf_search.getText();
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
                                tf_search.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                SuaMatHang.Model model = new SuaMatHang.Model();
                                this.listMH = pm.getListMH_follow_TenMH(Search_Text);
                                this.tb_MH.setModel(model);
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
                String Search_Text = tf_search.getText();
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
                                tf_search.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                                SuaMatHang.Model model = new SuaMatHang.Model();
                                this.listMH = pm.getListMH_follow_LoaiMH(Search_Text);
                                this.tb_MH.setModel(model);
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
                String Search_Text = tf_search.getText();
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
                                tf_search.setText("");
                                break;
                            }
                            case 1:
                            { 
                                   //Đưa ds mặt hàng sau khi lọc tìm kiếm lên bảng
                               SuaMatHang.Model model = new SuaMatHang.Model();
                                this.listMH = pm.getListMH_follow_HangSX(Search_Text);
                                this.tb_MH.setModel(model);
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


    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {  
        int flag=0;
 try {      
            String MaMH = Text_MaMH.getText();
            String TenMH = tf_TenMH.getText();
            String LoaiMH = tf_HangSX.getText();
            String HangSX = tf_HangSX.getText();
            flag=1;
            int SoLuong= Integer.parseInt(tf_SoLuong.getText());
            flag=2;
            int DonGia =Integer.parseInt(tf_DonGia.getText());


            //Xử lý lỗi để trống
            if (MaMH.equals("") ||TenMH.equals("") || LoaiMH.equals("") || HangSX.equals("") ||
                     String.valueOf(SoLuong).equals("") || String.valueOf(DonGia).equals("")  ){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
            }
            else 
            {
                ProductManager pm = new ProductManager();
                pm.updateMH_After_Repair(MaMH,TenMH,LoaiMH,HangSX,SoLuong,DonGia);
                JOptionPane.showMessageDialog(null, "Thay đổi thông tin mặt hàng thành công!");

                    //Xóa dữ liệu trên các Text

                 Text_MaMH.setText("");
                 tf_TenMH.setText("");
                 tf_LoaiMH.setText("");
                 tf_HangSX.setText("");
                 tf_SoLuong.setText("");
                 tf_DonGia.setText("");

                      //Cập nhật lại bảng
                  Model model = new Model();
                  this.listMH = pm.getListMH();
                  this.tb_MH.setModel(model);       
            }
        } catch (NumberFormatException ex) {
            switch(flag){
                case 1:{
                    JOptionPane.showMessageDialog(rootPane, "nhập sai định dạng số lượng, mời bạn nhập lại");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(rootPane, "nhập sai định dạng đơn giá, mời bạn nhập lại");
                    break;
                }
            }
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
              
        }        
    }

    private void jb_returnActionPerformed(java.awt.event.ActionEvent evt) {                                          
         this.setVisible(false);
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_getdata;
    private javax.swing.JButton jb_return;
    private javax.swing.JButton jb_save;
    private javax.swing.JComboBox<String> jc_search;
    private javax.swing.JLabel lb_DonGia;
    private javax.swing.JLabel lb_HangSX;
    private javax.swing.JLabel lb_LoaiMH;
    private javax.swing.JLabel lb_MaMH;
    private javax.swing.JLabel lb_SoLuong;
    private javax.swing.JLabel lb_TenMH;
    private javax.swing.JLabel lb_form;
    private javax.swing.JTable tb_MH;
    private javax.swing.JTextField tf_DonGia;
    private javax.swing.JTextField tf_HangSX;
    private javax.swing.JTextField tf_LoaiMH;
    private javax.swing.JLabel Text_MaMH;
    private javax.swing.JTextField tf_SoLuong;
    private javax.swing.JTextField tf_TenMH;
    private javax.swing.JTextField tf_search;
    private javax.swing.JLabel vnd;
    // End of variables declaration//GEN-END:variables

}
