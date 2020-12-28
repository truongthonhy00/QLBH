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
import javax.swing.SpinnerDateModel;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jl_InfoBuy = new javax.swing.JLabel();
        jl_TypeMH = new javax.swing.JLabel();
        jl_NameMH = new javax.swing.JLabel();
        jl_ProducerMH = new javax.swing.JLabel();
        jl_AmountMH = new javax.swing.JLabel();
        jc_TypeMH = new javax.swing.JComboBox<>();
        jc_ProducerMH = new javax.swing.JComboBox<>();
        jc_NameMH = new javax.swing.JComboBox<>();
        js_AmountMH = new javax.swing.JSpinner();
        btn_AddOfGH = new javax.swing.JButton();
        btn_Bill = new javax.swing.JButton();
        btn_BackGH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jl_InfoBuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_InfoBuy.setText("THÔNG TIN MUA HÀNG");

        jl_TypeMH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_TypeMH.setText("Loại Mặt hàng:");

        jl_NameMH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NameMH.setText("Tên Mặt hàng:");

        jl_ProducerMH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_ProducerMH.setText("Hãng Sản xuất:");

        jl_AmountMH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_AmountMH.setText("Số lượng mua:");

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

        btn_AddOfGH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AddOfGH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thêm vào giỏ hàng 23.png")); // NOI18N
        btn_AddOfGH.setText("Thêm vào Giỏ hàng");
        btn_AddOfGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOfGHActionPerformed(evt);
            }
        });

        btn_Bill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Bill.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\giỏ hàng 23.png")); // NOI18N
        btn_Bill.setText("Giỏ hàng");
        btn_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BillActionPerformed(evt);
            }
        });

        btn_BackGH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_BackGH.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        btn_BackGH.setText("Quay lại");
        btn_BackGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackGHActionPerformed(evt);
            }
        });
        
        SpinnerModel spinnerModel = new SpinnerNumberModel(0,0,100000,1);
        js_AmountMH = new JSpinner(spinnerModel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jl_InfoBuy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_AddOfGH)
                                .addGap(39, 39, 39)
                                .addComponent(btn_Bill)
                                .addGap(37, 37, 37)
                                .addComponent(btn_BackGH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_TypeMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jc_TypeMH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_NameMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jc_NameMH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_AmountMH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(js_AmountMH, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_ProducerMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jc_ProducerMH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jl_InfoBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_TypeMH)
                    .addComponent(jc_TypeMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_ProducerMH)
                    .addComponent(jc_ProducerMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_NameMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NameMH)
                    .addComponent(jl_AmountMH)
                    .addComponent(js_AmountMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddOfGH)
                    .addComponent(btn_Bill)
                    .addComponent(btn_BackGH))
                .addGap(42, 42, 42))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\backgrounds\\wp600x400.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>            

    private void btn_BackGHActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
    
    
    
   
    public void hiddenShowAllInfoHD() {
        btn_Bill.setVisible(false);
    }
    
    private javax.swing.JButton btn_AddOfGH;
    private javax.swing.JButton btn_BackGH;
    private javax.swing.JButton btn_Bill;
    private javax.swing.JComboBox<String> jc_NameMH;
    private javax.swing.JComboBox<String> jc_ProducerMH;
    private javax.swing.JComboBox<String> jc_TypeMH;
    private javax.swing.JLabel jl_AmountMH;
    private javax.swing.JLabel jl_InfoBuy;
    private javax.swing.JLabel jl_NameMH;
    private javax.swing.JLabel jl_ProducerMH;
    private javax.swing.JLabel jl_TypeMH;
    private javax.swing.JSpinner js_AmountMH;    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}
