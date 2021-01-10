package View;
import Controller.StaffManager;
import Model.Staff;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddNhanVien extends javax.swing.JFrame {
    public AddNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jl_AddNV = new javax.swing.JLabel();
        jl_NameNV = new javax.swing.JLabel();
        tfHoTenNV = new javax.swing.JTextField();
        jl_DateofbirthNV = new javax.swing.JLabel();
        tf_DateofbirthNV = new javax.swing.JTextField();
        jl_AddressNV = new javax.swing.JLabel();
        tf_AddressNV = new javax.swing.JTextField();
        jl_PhoneNV = new javax.swing.JLabel();
        tf_PhoneNV = new javax.swing.JTextField();
        jl_GenderNV = new javax.swing.JLabel();
        RbtnNam = new javax.swing.JRadioButton();
        RbtnNu = new javax.swing.JRadioButton();
        jl_CoefficientNV = new javax.swing.JLabel();
        tf_CoefficientNV = new javax.swing.JTextField();
        jl_Workday = new javax.swing.JLabel();
        tf_Workday = new javax.swing.JTextField();
        jl_Salary = new javax.swing.JLabel();
        jl_VND = new javax.swing.JLabel();
        btn_Salary = new javax.swing.JButton();
        jl_TongLuong = new javax.swing.JLabel();
        btn_AddNV = new javax.swing.JButton();
        bt_nBackAddNV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jl_AddNV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_AddNV.setText("THÊM NHÂN VIÊN");

        jl_NameNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NameNV.setText("Họ tên:");

        jl_DateofbirthNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_DateofbirthNV.setText("Ngày sinh:");

        jl_AddressNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_AddressNV.setText("Địa chỉ:");

        jl_PhoneNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_PhoneNV.setText("Điện thoại:");

        jl_GenderNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_GenderNV.setText("Giới tính:");

        buttonGroup1.add(RbtnNam);
        RbtnNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbtnNam.setText("Nam");

        buttonGroup1.add(RbtnNu);
        RbtnNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbtnNu.setText("Nữ");

        jl_CoefficientNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_CoefficientNV.setText("Hệ số lương:");

        jl_Workday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Workday.setText("Ngày công:");

        jl_Salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Salary.setText("Lương:");

        jl_VND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_VND.setText("VND");

        btn_Salary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Salary.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\tính lương 23.png")); // NOI18N
        btn_Salary.setText("Tính lương");
        btn_Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalaryActionPerformed(evt);
            }
        });

        jl_TongLuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_TongLuong.setText("0");

        btn_AddNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_AddNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thêm nhân viên 23.png")); // NOI18N
        btn_AddNV.setText("Thêm");
        btn_AddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNVActionPerformed(evt);
            }
        });

        bt_nBackAddNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_nBackAddNV.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Code java\\QLBH\\display\\buttons\\thoát 23.png")); // NOI18N
        bt_nBackAddNV.setText("Quay lại");
        bt_nBackAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nBackAddNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btn_AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Salary)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_NameNV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfHoTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_AddressNV)
                                            .addComponent(jl_DateofbirthNV)
                                            .addComponent(jl_PhoneNV))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_DateofbirthNV)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tf_AddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_PhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_Workday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_Workday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_CoefficientNV)
                                            .addComponent(jl_GenderNV))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RbtnNam)
                                                .addGap(18, 18, 18)
                                                .addComponent(RbtnNu))
                                            .addComponent(tf_CoefficientNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_Salary)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt_nBackAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jl_TongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jl_VND)))))))
                        .addGap(0, 31, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jl_AddNV)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfHoTenNV, tf_AddressNV, tf_CoefficientNV, tf_DateofbirthNV, tf_PhoneNV, tf_Workday});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jl_AddNV)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NameNV)
                    .addComponent(jl_GenderNV)
                    .addComponent(RbtnNam)
                    .addComponent(RbtnNu))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DateofbirthNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_DateofbirthNV)
                    .addComponent(jl_CoefficientNV)
                    .addComponent(tf_CoefficientNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_AddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_AddressNV)
                            .addComponent(jl_Workday)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tf_Workday, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_PhoneNV)
                        .addComponent(tf_PhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_Salary)
                        .addComponent(jl_VND))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_TongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salary)
                    .addComponent(btn_AddNV)
                    .addComponent(bt_nBackAddNV))
                .addGap(45, 45, 45))
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

    private void bt_nBackAddNVActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
    }                                             

    private void btn_AddNVActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (tfHoTenNV.equals("") || tf_DateofbirthNV.equals("") || tf_AddressNV.equals("") ||
                    (!RbtnNam.isSelected() && !RbtnNu.isSelected()) || tf_PhoneNV.getText().equals("") || tf_Workday.getText().equals("") || tf_CoefficientNV.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
        }
        else {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            int flag = 0;
            try {        
                String hoTen = tfHoTenNV.getText();
                String ngaySinh = tf_DateofbirthNV.getText();
                String diaChi = tf_AddressNV.getText();
                flag = 1;
                int phone = Integer.parseInt(tf_PhoneNV.getText());
                flag = 2;
                float ngayCong = Float.parseFloat(tf_Workday.getText());
                flag = 3;
                float heSoLuong = Float.parseFloat(tf_CoefficientNV.getText());
                float luong = Float.parseFloat(jl_TongLuong.getText());
            
               df.parse(ngaySinh);
               Date ngaySinh1 = new SimpleDateFormat("yyyy/MM/dd").parse(ngaySinh);
               try {
                    StaffManager sm = new StaffManager();
                    sm.addNV(hoTen, ngaySinh1, diaChi, RbtnNam.isSelected()?"Nam":"Nữ", phone, ngayCong, heSoLuong, luong);
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");  
                    tfHoTenNV.setText("");
                    tf_DateofbirthNV.setText("");
                    tf_AddressNV.setText("");
                    tf_PhoneNV.setText("");
                    tf_Workday.setText("");
                    tf_CoefficientNV.setText("");
                    jl_TongLuong.setText("");
                    buttonGroup1.clearSelection(); 
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(AddNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }               
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai ngày sinh!\nVui lòng nhập lại!");
                tf_DateofbirthNV.setText("");
            } catch (NumberFormatException ex){
                switch(flag)
                {
                    case 1:
                    {
                        JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho số điện thoại!\nVui lòng nhập lại!");
                        tf_PhoneNV.setText("");
                        break;
                    }
                    case 2:
                    {
                        JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho ngày công!\nVui lòng nhập lại!");
                        tf_Workday.setText("");
                        break;
                    }
                    case 3:
                    {
                        JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho hệ số lương!\nVui lòng nhập lại!");
                        tf_CoefficientNV.setText("");
                        break;
                    }
                }
            }    
        }
    }

    private void btn_SalaryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int flag = 0;
        try {  
            flag = 1;
            float ngayCong = Float.parseFloat(tf_Workday.getText());
            flag = 2;
            float heSoLuong = Float.parseFloat(tf_CoefficientNV.getText());
            if (String.valueOf(ngayCong).equals("") || String.valueOf(heSoLuong).equals("")){
            JOptionPane.showMessageDialog(null, "Chưa nhập Ngày công hoặc Hệ số lương");
            }
            else
            {
                float Luong = ngayCong * heSoLuong *200000;
                int luong = (int)Luong;
                jl_TongLuong.setText(Integer.toString(luong));
                tfHoTenNV.setText("");
            }
        } catch (NumberFormatException ex){
            switch(flag)
            {
                 case 1:
                {
                    JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho ngày công!\nVui lòng nhập lại!");
                    tf_Workday.setText("");
                    break;
                }
                 case 2:
                {
                    JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã nhập sai định dạng cho hệ số lương!\nVui lòng nhập lại!");
                    tf_CoefficientNV.setText("");
                    break;
                }
            }
        }     
    }                                          
              
    private javax.swing.JRadioButton RbtnNam;
    private javax.swing.JRadioButton RbtnNu;
    private javax.swing.JButton bt_nBackAddNV;
    private javax.swing.JButton btn_AddNV;
    private javax.swing.JButton btn_Salary;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jl_AddNV;
    private javax.swing.JLabel jl_AddressNV;
    private javax.swing.JLabel jl_CoefficientNV;
    private javax.swing.JLabel jl_DateofbirthNV;
    private javax.swing.JLabel jl_GenderNV;
    private javax.swing.JLabel jl_NameNV;
    private javax.swing.JLabel jl_PhoneNV;
    private javax.swing.JLabel jl_Salary;
    private javax.swing.JLabel jl_Workday;
    private javax.swing.JLabel jl_TongLuong;
    private javax.swing.JLabel jl_VND;
    private javax.swing.JTextField tfHoTenNV;
    private javax.swing.JTextField tf_AddressNV;
    private javax.swing.JTextField tf_CoefficientNV;
    private javax.swing.JTextField tf_DateofbirthNV;
    private javax.swing.JTextField tf_PhoneNV;
    private javax.swing.JTextField tf_Workday;   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}


