package View;

import Controller.BillManager;
import Controller.ProductManager;
import Controller.StaffManager;
import Model.DBConnector;
import Model.Product;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class InfoMuaHang extends javax.swing.JFrame {
    public InfoMuaHang() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        try {
            BillManager bm = new BillManager();
            bm.getListAllHangSX().forEach(e -> {                
                jc_ProducerMH.addItem(e.getHangSX());               
            });    
            bm.getListAllMH().forEach(i ->{
                jc_NameMH.addItem(i.getTenMH());
            });
            bm.getListAllLoaiMH().forEach(e ->{
                jc_TypeMH.addItem(e.getLoaiMH());
            }); 
        } catch (SQLException ex) {
            Logger.getLogger(InfoMuaHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(InfoMuaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     

    @SuppressWarnings("unchecked")                     
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jl_ProducerMH = new javax.swing.JLabel();
        jl_AmountMH = new javax.swing.JLabel();
        jl_InfoBuy = new javax.swing.JLabel();
        btn_AddOfGH = new javax.swing.JButton();
        btn_BackGH = new javax.swing.JButton();
        btn_Bill = new javax.swing.JButton();
        jc_ProducerMH = new javax.swing.JComboBox<>();
        jl_NameMH = new javax.swing.JLabel();
        js_AmountMH = new javax.swing.JSpinner();
        jl_TypeMH = new javax.swing.JLabel();
        jc_NameMH = new javax.swing.JComboBox<>();
        jc_TypeMH = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_AmountMH.setText("Số lượng mua:");

        jl_InfoBuy.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jl_InfoBuy.setText("THÔNG TIN MUA HÀNG");

        btn_AddOfGH.setText("Thêm vào giỏ hàng");
        btn_AddOfGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOfGHActionPerformed(evt);
            }
        });

        btn_BackGH.setText("Quay lại");
        btn_BackGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackHDActionPerformed(evt);
            }
        });

        btn_Bill.setText("Giỏ hàng");
        btn_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BillActionPerformed(evt);
            }
        });

        jl_TypeMH.setText("Loại mặt hàng:");
        
        
        jl_ProducerMH.setText("Hãng sản xuất:");
        
        
        jl_NameMH.setText("Tên mặt hàng:");
        
        jc_TypeMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jc_TypeMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_TypeMHActionPerformed(evt);
            }
        });
        
        jc_ProducerMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jc_ProducerMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_ProducerMHActionPerformed(evt);
            }
        });
        
        jc_NameMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jc_NameMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_NameMHActionPerformed(evt);
            }
        });
        
        
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 10000, 1);
        js_AmountMH = new JSpinner(spinnerModel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NameMH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_NameMH, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jl_TypeMH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jc_TypeMH, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_AddOfGH)
                                .addGap(73, 73, 73)
                                .addComponent(btn_Bill)))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btn_BackGH, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_AmountMH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(js_AmountMH, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_ProducerMH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jc_ProducerMH, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_InfoBuy)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jl_InfoBuy)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_TypeMH)
                    .addComponent(jc_TypeMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_ProducerMH)
                    .addComponent(jc_ProducerMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_NameMH)
                            .addComponent(jc_NameMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_AmountMH)
                            .addComponent(js_AmountMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Bill)
                            .addComponent(btn_BackGH)
                            .addComponent(btn_AddOfGH))
                        .addGap(34, 34, 34))))
        );

        pack();
    }                     

    private void btn_BackHDActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            Menu mn = new Menu();
            mn.setVisible(true);
            StaffManager sm = new StaffManager();
            
            //Lấy tên Acc đang đăng nhập (Acc on thì sẽ có trạng thái là 1)
            String user = sm.getAcc_follow_Status(1);     
            
            //Check xem loại Acc
            if(sm.Check_Acc(user))
            {
                //Ẩn 2 chức năng nếu người đăng nhập là User
                mn.hiddenBTNNV();
                mn.hiddenBTNMH();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }                                          

    private void btn_AddOfGHActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jc_NameMH.getSelectedItem().toString().equals("")||jc_ProducerMH.getSelectedItem().toString().equals("")||jc_TypeMH.getSelectedItem().toString().equals("")||(int)js_AmountMH.getValue()<1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin!");
        }
        else 
        {
            try
            {
                BillManager bm = new BillManager();
                ProductManager pm = new ProductManager();  
                String TenMH = (String)jc_NameMH.getSelectedItem();
                int DonGia = bm.getDonGia(TenMH);
                int SLmua = (int) js_AmountMH.getValue();
                
                  //Kiểm tra số lượng mua có vượt quá hàng tồn trong kho hay k???
                int SLHangTon = pm.getSLHangTon(TenMH);
                if(SLmua <= SLHangTon)   //Trường hợp k vượt quá
                {
                    int ThanhTien = SLmua * bm.getDonGia((String)jc_NameMH.getSelectedItem());
                 
                         //Thêm dữ liệu mua hàng vào giỏ hàng
                    bm.addCart(TenMH, DonGia, SLmua, ThanhTien);
                    JOptionPane.showMessageDialog(null, "Thêm vào giỏ hàng thành công!");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Rất tiếc, số lượng mua đã vượt quá giới hạn!\nTrong kho hiện nay chỉ còn "+SLHangTon+" chiếc "+TenMH+ " mà thôi!");
                }
                
                      //Reset lại
                this.dispose();
                InfoMuaHang info = new InfoMuaHang();
                info.setVisible(true);
              
            } catch (SQLException ex) {
                Logger.getLogger(InfoMuaHang.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(InfoMuaHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }                                           

    private void btn_BillActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GioHang gh = new GioHang();
        gh.setVisible(true);
    } 
    
    
    
    private void jc_TypeMHActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {             
            BillManager bm = new BillManager();
            if(!((String)jc_TypeMH.getSelectedItem()).equals(""))
            {
                if (((String)jc_ProducerMH.getSelectedItem()).equals("") && ((String)jc_NameMH.getSelectedItem()).equals(""))
                {
                    jc_ProducerMH.removeAllItems();                               
                jc_ProducerMH.addItem("");
                bm.getListHangSX_follow_LoaiMH((String)jc_TypeMH.getSelectedItem()).forEach(i ->{jc_ProducerMH.addItem(i.getHangSX());});
                                
                jc_NameMH.removeAllItems();
                jc_NameMH.addItem("");
                bm.getListTenMH_follow_LoaiMH((String)jc_TypeMH.getSelectedItem()).forEach(i ->{jc_NameMH.addItem(i.getTenMH());});
            }
            else if(!((String)jc_ProducerMH.getSelectedItem()).equals("") && ((String)jc_NameMH.getSelectedItem()).equals(""))
            {    
                jc_NameMH.removeAllItems();
                jc_NameMH.addItem("");
                bm.getListTenMH_follow_LoaiMH_and_HangSX((String)jc_TypeMH.getSelectedItem(),(String)jc_ProducerMH.getSelectedItem()).forEach(i ->{jc_NameMH.addItem(i.getTenMH());});
            }
            else if(((String)jc_ProducerMH.getSelectedItem()).equals("") && (!((String)jc_NameMH.getSelectedItem()).equals("")))
            {    
                jc_ProducerMH.removeAllItems();
                jc_ProducerMH.addItem("");
                bm.getListHangSX_follow_LoaiMH_and_TenMH((String)jc_TypeMH.getSelectedItem(),(String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_ProducerMH.addItem(i.getHangSX());});
            }
            }
        } catch (SQLException ex) {
            System.out.print("");
        } catch (Exception ex) {
            System.out.print("");
        }
    }
    
    
    
    
    private void jc_ProducerMHActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            BillManager bm = new BillManager();
            if(!((String)jc_ProducerMH.getSelectedItem()).equals(""))
            {
            if (((String)jc_TypeMH.getSelectedItem()).equals("") && ((String)jc_NameMH.getSelectedItem()).equals(""))
            {
                jc_TypeMH.removeAllItems();
                jc_TypeMH.addItem("");
                bm.getListLoaiMH_follow_HangSX((String)jc_ProducerMH.getSelectedItem()).forEach(i ->{jc_TypeMH.addItem(i.getLoaiMH());});
                                
                jc_NameMH.removeAllItems();
                jc_NameMH.addItem("");
                bm.getListTenMH_follow_HangSX((String)jc_ProducerMH.getSelectedItem()).forEach(i ->{jc_NameMH.addItem(i.getTenMH());});
            }
            else if(!((String)jc_TypeMH.getSelectedItem()).equals("") && ((String)jc_NameMH.getSelectedItem()).equals(""))
            {
                jc_NameMH.removeAllItems();
                jc_NameMH.addItem("");
                bm.getListTenMH_follow_LoaiMH_and_HangSX((String)jc_TypeMH.getSelectedItem(),(String)jc_ProducerMH.getSelectedItem()).forEach(i ->{jc_NameMH.addItem(i.getTenMH());});
            }
            else if(((String)jc_TypeMH.getSelectedItem()).equals("") && !((String)jc_NameMH.getSelectedItem()).equals(""))
            {
                jc_TypeMH.removeAllItems();
                jc_TypeMH.addItem("");
                bm.getListLoaiMH_follow_HangSX_and_TenMH((String)jc_ProducerMH.getSelectedItem(),(String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_TypeMH.addItem(i.getLoaiMH());});
            }
            }
        } catch (SQLException ex) {
            System.out.print("");
        } catch (Exception ex) {
            System.out.print("");
        }
    }
    
    
    private void jc_NameMHActionPerformed(java.awt.event.ActionEvent evt) {   
        try {
            if(!((String)jc_NameMH.getSelectedItem()).equals(""))
            {
            BillManager bm = new BillManager();
            if (((String)jc_TypeMH.getSelectedItem()).equals("") && ((String)jc_ProducerMH.getSelectedItem()).equals(""))
            {
                jc_ProducerMH.removeAllItems();
                jc_ProducerMH.addItem("");
                bm.getListHangSX_follow_TenMH((String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_ProducerMH.addItem(i.getHangSX());});
                                
                jc_TypeMH.removeAllItems();
                jc_TypeMH.addItem("");
                bm.getListLoaiMH_follow_TenMH((String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_TypeMH.addItem(i.getLoaiMH());});
            }
            else if(!((String)jc_TypeMH.getSelectedItem()).equals("") && ((String)jc_ProducerMH.getSelectedItem()).equals(""))
            {
                jc_ProducerMH.removeAllItems();
                jc_ProducerMH.addItem("");
                bm.getListHangSX_follow_LoaiMH_and_TenMH((String)jc_TypeMH.getSelectedItem(),(String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_ProducerMH.addItem(i.getHangSX());});
            }
            else if(((String)jc_TypeMH.getSelectedItem()).equals("") && !((String)jc_ProducerMH.getSelectedItem()).equals(""))
            {
                jc_TypeMH.removeAllItems();
                jc_TypeMH.addItem("");
                bm.getListLoaiMH_follow_HangSX_and_TenMH((String)jc_ProducerMH.getSelectedItem(),(String)jc_NameMH.getSelectedItem()).forEach(i ->{jc_TypeMH.addItem(i.getLoaiMH());});
            }
            }
        } catch (SQLException ex) {
            System.out.print("");
        } catch (Exception ex) {
            System.out.print("");
        }
    }
    
    
    
    public String IFlbUserName(String user){
        lbUserName.setText("Xin chào, " + user + "!");
        return user;
    }
    public void hiddenShowAllInfoHD() {
        btn_Bill.setVisible(false);
    }
    
    private javax.swing.JLabel lbUserName;
    private javax.swing.JButton btn_AddOfGH;
    private javax.swing.JButton btn_BackGH;
    private javax.swing.JButton btn_Bill;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JComboBox<String> jc_NameMH;
    private javax.swing.JComboBox<String> jc_ProducerMH;
    private javax.swing.JComboBox<String> jc_TypeMH;
    private javax.swing.JLabel jl_AmountMH;
    private javax.swing.JLabel jl_InfoBuy;
    private javax.swing.JLabel jl_NameMH;
    private javax.swing.JLabel jl_ProducerMH;
    private javax.swing.JLabel jl_TypeMH;
    private javax.swing.JSpinner js_AmountMH;                 
}
