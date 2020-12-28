package View;

import Controller.BillManager;
import Controller.ProductManager;
import Controller.StaffManager;
import Model.Bill;
import Model.Cart;
import Model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GioHang extends javax.swing.JFrame {
    public GioHang() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);   
        int TongGH = 0;
        try {           
            BillManager bm = new BillManager();            
            this.listGH = bm.getListGH_follow_TenMH();
            Model model = new Model();
            this.tb_Cart.setModel(model);
            for(Cart gh: listGH)
            {
                TongGH = TongGH + gh.getThanhTien();
            }
            total_money.setText(String.valueOf(TongGH));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    List<Cart> listGH = new ArrayList<>();
    
    private class Model extends DefaultTableModel{

        @Override
        public Object getValueAt(int row, int column) {
            switch (column){
                case 0:
                    return listGH.get(row).getStt();
                case 1:
                    return listGH.get(row).getTenMHGH();
                case 2:
                    return listGH.get(row).getDonGiaGH();
                case 3:
                    return listGH.get(row).getSoLuongMua();
                case 4:
                    return listGH.get(row).getThanhTien();
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
                    return "STT";
                case 1:
                    return "Tên mặt hàng";
                case 2: 
                    return "Đơn giá";
                case 3:
                    return "Số lượng mua";
                case 4:
                    return "Thành tiền";
            }
            return null; 
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public int getRowCount() {
            return listGH.size();
        }
        
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_Bill = new javax.swing.JLabel();
        tf_NameKH = new javax.swing.JTextField();
        jl_NameKH = new javax.swing.JLabel();
        tf_AddressKH = new javax.swing.JTextField();
        jl_AddressKH = new javax.swing.JLabel();
        tf_PhoneKH = new javax.swing.JTextField();
        jl_PhoneKH = new javax.swing.JLabel();
        tf_CodeKH = new javax.swing.JTextField();
        jl_CodeKH = new javax.swing.JLabel();
        jl_InfoKH = new javax.swing.JLabel();
        jl_InfoGH = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Cart = new javax.swing.JTable();
        btn_OutGH = new javax.swing.JButton();
        btn_DeleteGH = new javax.swing.JButton();
        btn_PrintHD = new javax.swing.JButton();
        TongGH = new javax.swing.JLabel();
        total_money = new javax.swing.JLabel();
        VND = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("VND");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jl_Bill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Bill.setText("GIỎ HÀNG");



        jl_NameKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NameKH.setText("Họ tên:");

  

        jl_AddressKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_AddressKH.setText("Địa chỉ:");


        jl_PhoneKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_PhoneKH.setText("Điện thoại:");


        jl_CodeKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_CodeKH.setText("Mã số thuế:");

        jl_InfoKH.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jl_InfoKH.setText("Thông tin khách hàng");

        jl_InfoGH.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jl_InfoGH.setText("Chi tiết giỏ hàng");

        tb_Cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tb_Cart);

        btn_OutGH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_OutGH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        btn_OutGH.setText("Quay lại");
        btn_OutGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OutGHActionPerformed(evt);
            }
        });

        btn_DeleteGH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_DeleteGH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\xoá.png")); // NOI18N
        btn_DeleteGH.setText("Xoá");
        btn_DeleteGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteGHActionPerformed(evt);
            }
        });

        btn_PrintHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_PrintHD.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\in hoá đơn 23.png")); // NOI18N
        btn_PrintHD.setText("Xuất Hoá đơn");
        btn_PrintHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintHDActionPerformed(evt);
            }
        });

        TongGH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TongGH.setText("Tổng giỏ hàng");

        total_money.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_money.setText("0");

        VND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VND.setText("VNĐ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_InfoGH, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(190, 190, 190))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_PrintHD)
                                                .addGap(37, 37, 37)
                                                .addComponent(btn_DeleteGH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(btn_OutGH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TongGH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total_money, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VND))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jl_AddressKH)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tf_AddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jl_NameKH)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tf_NameKH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)))
                                                .addGap(121, 121, 121))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jl_InfoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jl_CodeKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jl_PhoneKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(10, 10, 10)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_CodeKH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_PhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_Bill)
                                .addGap(231, 231, 231))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jl_Bill)
                .addGap(52, 52, 52)
                .addComponent(jl_InfoKH)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NameKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NameKH)
                    .addComponent(jl_PhoneKH)
                    .addComponent(tf_PhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_CodeKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_CodeKH)
                    .addComponent(tf_AddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_AddressKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jl_InfoGH)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VND)
                    .addComponent(total_money)
                    .addComponent(TongGH))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DeleteGH)
                    .addComponent(btn_OutGH)
                    .addComponent(btn_PrintHD))
                .addGap(24, 24, 24))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\backgrounds\\wp600x600.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>                 

    private void btn_OutGHActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.setVisible(false);
    }                                         

    private void btn_PrintHDActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
                //Xử lý lỗi để trống
            if(tf_NameKH.getText().equals("") || tf_AddressKH.getText().equals("") || tf_CodeKH.getText().equals("") || tf_PhoneKH.getText().equals("") || total_money.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin cho khách hàng trước khi in!");
            }
            else
            {
                //Đưa dữ liệu khách hàng vào databas
            StaffManager sm = new StaffManager();
            String HoTen = tf_NameKH.getText();
            String DiaChi = tf_AddressKH.getText(); 
            String MaSoThue = tf_CodeKH.getText();
            int Sdt = Integer.parseInt(tf_PhoneKH.getText()); 
            int TongGH = Integer.parseInt(total_money.getText());
            sm.addKH(HoTen, DiaChi, Sdt, MaSoThue, TongGH);
            
            //Lấy mã khách hàng của khách hàng vừa thêm trong database
            int MaKH = sm.getMaKH(Sdt);
            
            //Đưa dư liệu vào hóa đơn trong database
            BillManager bm = new BillManager();
            this.listGH = bm.getListGH_follow_TenMH(); 
            for(Cart hd: listGH)
            {
                bm.addBill(MaKH, hd.getMaMH(), hd.getSoLuongMua(), hd.getThanhTien());
            }  

            //Kết nối tới máy in để in hóa đơn
            HoaDon hd = new HoaDon();
            hd.setVisible(true);
            JOptionPane.showMessageDialog(null, "Hóa đơn đang được in, vui lòng chờ trong giây lát!!!");
            hd.dispose();
            JOptionPane.showMessageDialog(null, "In hóa đơn thành công!");
            
              //Update lại số lượng tồn kho của các mặt hàng sau khi KH đã mua hàng
            ProductManager pm = new ProductManager();  
            int SoLuongMH_After_Buy;
            for(Cart gh: listGH)
            {
                int SLHangTon = pm.getSLHangTon(gh.getTenMH());              //Lấy SL hàng tồn trong kho theo tên MH
                SoLuongMH_After_Buy = SLHangTon - gh.getSoLuongMua();        //Tính SL hàng sau khi KH mua
                pm.updateMH_After_Buy(gh.getTenMH(), SoLuongMH_After_Buy);   //Update SL hàng còn lại lên database
            }
                  
            //Xóa giỏ hàng trong database
            bm.deleteCart();
            
            //Xóa dữ liệu trong giao diện            
            Model model = new Model();
            this.listGH = bm.getListGH_follow_TenMH();
            this.tb_Cart.setModel(model);      
            tf_NameKH.setText("");
            tf_AddressKH.setText("");
            tf_CodeKH.setText("");
            tf_PhoneKH.setText("");
            total_money.setText("0");
            }  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }  
    
    
     //Xóa giỏ hàng
    private void btn_DeleteGHActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            BillManager bm = new BillManager(); 
            Model model = new Model();
            int row = -1, TongGH = 0;
            row = tb_Cart.getSelectedRow();              //Lấy hàng được click
            if (row != -1) 
            {   
                int SttGH = (int) tb_Cart.getValueAt(row, 0);  //Lấy giá trị của phần tử hàng được chọn, cột 0
                bm.deleteCart_follow_SttGH(SttGH);                          //Xóa hàng được chọn theo SttGH
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
            } 
            else JOptionPane.showMessageDialog(null, "Vui lòng click vào hàng cần xóa!");
            this.listGH = bm.getListGH_follow_TenMH();         //Cập nhật lại database giỏ hàng sau khi xóa 
            this.tb_Cart.setModel(model);  
            for(Cart gh: listGH)
            {
                TongGH = TongGH + gh.getThanhTien();
            }
            total_money.setText(String.valueOf(TongGH));//Cập nhật giỏ hàng lên bảng
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }                                            
                   
    private javax.swing.JButton btn_DeleteGH;
    private javax.swing.JButton btn_OutGH;
    private javax.swing.JButton btn_PrintHD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_AddressKH;
    private javax.swing.JLabel jl_Bill;
    private javax.swing.JLabel jl_CodeKH;
    private javax.swing.JLabel jl_InfoGH;
    private javax.swing.JLabel jl_InfoKH;
    private javax.swing.JLabel jl_NameKH;
    private javax.swing.JLabel jl_PhoneKH;
    private javax.swing.JLabel TongGH;
    private javax.swing.JLabel VND;
    private javax.swing.JLabel total_money;
    private javax.swing.JTable tb_Cart;
    private javax.swing.JTextField tf_AddressKH;
    private javax.swing.JTextField tf_CodeKH;
    private javax.swing.JTextField tf_NameKH;
    private javax.swing.JTextField tf_PhoneKH;   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
}
