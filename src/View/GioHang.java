package View;

import Controller.BillManager;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Cart = new javax.swing.JTable();
        btn_OutGH = new javax.swing.JButton();
        jl_Bill = new javax.swing.JLabel();
        btn_PrintHD = new javax.swing.JButton();
        btn_DeleteGH = new javax.swing.JButton();
        jl_InfoGH = new javax.swing.JLabel();
        jl_InfoKH = new javax.swing.JLabel();
        jl_NameKH = new javax.swing.JLabel();
        tf_NameKH = new javax.swing.JTextField();
        jl_PhoneKH = new javax.swing.JLabel();
        tf_PhoneKH = new javax.swing.JTextField();
        jl_CodeKH = new javax.swing.JLabel();
        jl_AddressKH = new javax.swing.JLabel();
        tf_CodeKH = new javax.swing.JTextField();
        tf_AddressKH = new javax.swing.JTextField();
        VND = new javax.swing.JLabel();
        total_money = new javax.swing.JLabel();
        TongGH = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_Cart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_Cart);

        btn_OutGH.setText("Quay lại");
        btn_OutGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OutHDActionPerformed(evt);
            }
        });

        jl_Bill.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jl_Bill.setText("GIỎ HÀNG");

        btn_PrintHD.setText("In hóa đơn");
        btn_PrintHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintHDActionPerformed(evt);
            }
        });

        btn_DeleteGH.setText("Xóa");
        btn_DeleteGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteHDActionPerformed(evt);
            }
        });

        jl_InfoGH.setFont(new java.awt.Font("Tahoma", 3, 12)); 
        jl_InfoGH.setText("Thông tin giỏ hàng");

        jl_InfoKH.setFont(new java.awt.Font("Tahoma", 3, 12));
        jl_InfoKH.setText("Thông tin khách hàng");

        jl_NameKH.setText("Họ tên");

        jl_PhoneKH.setText("Số điện thoại");

        jl_CodeKH.setText("Mã số thuế");

        jl_AddressKH.setText("Địa chỉ");
        
        VND.setText("VND");

        total_money.setText("jLabel1");

        TongGH.setText("Tổng giỏ hàng:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btn_PrintHD)
                        .addGap(101, 101, 101)
                        .addComponent(btn_DeleteGH)
                        .addGap(95, 95, 95)
                        .addComponent(btn_OutGH))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jl_InfoGH))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_InfoKH)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jl_PhoneKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jl_NameKH)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NameKH, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(tf_PhoneKH))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_CodeKH)
                                    .addComponent(jl_AddressKH))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_CodeKH, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(tf_AddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jl_Bill)))
                .addContainerGap(39, Short.MAX_VALUE))
                    
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(TongGH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_money)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VND, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jl_Bill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jl_InfoKH)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NameKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_CodeKH)
                    .addComponent(tf_CodeKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NameKH))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_PhoneKH)
                    .addComponent(tf_PhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_AddressKH)
                    .addComponent(tf_AddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jl_InfoGH)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DeleteGH)
                    .addComponent(btn_PrintHD)
                    .addComponent(btn_OutGH))
                .addGap(34, 34, 34))
                    
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VND)
                    .addComponent(total_money)
                    .addComponent(TongGH))
                .addGap(91, 91, 91))
        );

        pack();
    }                 

    private void btn_OutHDActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
    private void btn_DeleteHDActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
}
