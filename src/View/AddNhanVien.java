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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jl_AddNV = new javax.swing.JLabel();
        jl_GenderNV = new javax.swing.JLabel();
        jl_NameNV = new javax.swing.JLabel();
        jl_AddressNV = new javax.swing.JLabel();
        jl_PhoneNV = new javax.swing.JLabel();
        jl_DateofbirthNV = new javax.swing.JLabel();
        jl_CoefficientNV = new javax.swing.JLabel();
        jl_Workday = new javax.swing.JLabel();
        btn_AddNV = new javax.swing.JButton();
        bt_nBackAddNV = new javax.swing.JButton();
        RbtnNam = new javax.swing.JRadioButton();
        RbtnNu = new javax.swing.JRadioButton();
        tfHoTenNV = new javax.swing.JTextField();
        tf_AddressNV = new javax.swing.JTextField();
        tf_Workday = new javax.swing.JTextField();
        tf_DateofbirthNV = new javax.swing.JTextField();
        tf_PhoneNV = new javax.swing.JTextField();
        tf_CoefficientNV = new javax.swing.JTextField();
        jl_Salary = new javax.swing.JLabel();
        jl_TongLuong = new javax.swing.JLabel();
        jl_VND = new javax.swing.JLabel();
        btn_Salary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_AddNV.setFont(new java.awt.Font("Tahoma", 1, 14));
        jl_AddNV.setText("THÊM NHÂN VIÊN");

        jl_GenderNV.setText("Giới tính:");

        jl_NameNV.setText("Họ tên:");

        jl_AddressNV.setText("Địa chỉ:");

        jl_PhoneNV.setText("Số điện thoại:");

        jl_DateofbirthNV.setText("Ngày sinh:");

        jl_CoefficientNV.setText("Hệ số lương:");

        jl_Workday.setText("Ngày công:");
        
        jl_TongLuong.setText("0");

        jl_VND.setText("VNĐ");

        btn_AddNV.setText("Thêm");
        btn_AddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNVActionPerformed(evt);
            }
        });

        bt_nBackAddNV.setText("Quay lại");
        bt_nBackAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nBackAddNVActionPerformed(evt);
            }
        });

        buttonGroup1.add(RbtnNam);
        RbtnNam.setText("Nam");

        buttonGroup1.add(RbtnNu);
        RbtnNu.setText("Nữ");

        jl_Salary.setText("Lương:");

        btn_Salary.setText("Tính lương");
        btn_Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btn_AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_nBackAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jl_AddressNV)
                                        .addComponent(jl_NameNV, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jl_DateofbirthNV))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_AddressNV, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(tf_DateofbirthNV)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(tfHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_GenderNV)
                                        .addGap(18, 18, 18)
                                        .addComponent(RbtnNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RbtnNu)
                                        .addGap(0, 21, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_CoefficientNV)
                                            .addComponent(jl_Workday)
                                            .addComponent(jl_Salary))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_CoefficientNV)
                                            .addComponent(tf_Workday)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_PhoneNV)
                                .addGap(10, 10, 10)
                                .addComponent(tf_PhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jl_AddNV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(jl_TongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_VND)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jl_TongLuong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jl_AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_NameNV)
                            .addComponent(tfHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_GenderNV)
                            .addComponent(RbtnNam)
                            .addComponent(RbtnNu))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_DateofbirthNV)
                            .addComponent(tf_DateofbirthNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_CoefficientNV)
                            .addComponent(tf_CoefficientNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_AddressNV)
                            .addComponent(tf_AddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Workday)
                            .addComponent(tf_Workday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_PhoneNV)
                            .addComponent(tf_PhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Salary))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salary)
                    .addComponent(btn_AddNV)
                    .addComponent(bt_nBackAddNV))
                .addContainerGap(34, Short.MAX_VALUE))
                
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_VND, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_TongLuong))
                .addGap(136, 136, 136))
        );

        pack();
    }                   

    private void bt_nBackAddNVActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
    }                                             

    private void btn_AddNVActionPerformed(java.awt.event.ActionEvent evt) { 
        int flag=0;
        try {
            
        try {        
            String hoTen = tfHoTenNV.getText();
            String ngaySinh = tf_DateofbirthNV.getText();
            String diaChi = tf_AddressNV.getText();
            flag=1;
            int phone = Integer.parseInt(tf_PhoneNV.getText());
            flag=2;
            int ngayCong = Integer.parseInt(tf_Workday.getText());
            flag=3;
            float heSoLuong =Float.parseFloat( tf_CoefficientNV.getText());
            String luong = jl_TongLuong.getText();
            Date ngaySinh1 = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinh);
            if (hoTen.equals("") || ngaySinh.equals("") || diaChi.equals("") ||
                    (!RbtnNam.isSelected() && !RbtnNu.isSelected()) || String.valueOf(phone).equals("") || String.valueOf(ngayCong).equals("") || String.valueOf(heSoLuong).equals("") ){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
            }
            else {
                try {
                    StaffManager sm = new StaffManager();
                    sm.addNV(hoTen, ngaySinh1, diaChi, RbtnNam.isSelected()?"Nam":"Nữ", phone, ngayCong, heSoLuong, Float.parseFloat(luong));
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");  
                    tfHoTenNV.setText("");
                    tf_DateofbirthNV.setText("");
                    tf_AddressNV.setText("");
                    tf_PhoneNV.setText("");
                    tf_Workday.setText("");
                    tf_CoefficientNV.setText("");
                    jl_TongLuong.setText("");
                    buttonGroup1.clearSelection(); 
                }  catch (Exception ex) {
                    Logger.getLogger(AddNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(tf_DateofbirthNV, "bạn đã nhập ngày sinh không hợp lê");
            
        }
        } catch (NumberFormatException ex) {
                     switch(flag){
               case 1:{
                   JOptionPane.showMessageDialog(tf_PhoneNV, "bạn đã nhập số điện thoại không hợp lệ");
                   break;
               }
               case 2:{
                   JOptionPane.showMessageDialog(tf_Workday, "bạn đã nhập ngày công không hợp lệ");
                   break;
               }
               case 3:
               {
                   JOptionPane.showMessageDialog(tf_CoefficientNV, "bạn đã nhập hệ số lương không hợp lệ");
                   break;
               }
                
    }       
        }}
    
    

    private void btn_SalaryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String ngayCong = tf_Workday.getText();
        String heSoLuong = tf_CoefficientNV.getText(); 
        if (ngayCong.equals("") || heSoLuong.equals("")){
            JOptionPane.showMessageDialog(null, "Chưa nhập Ngày công hoặc Hệ số lương!");
        }
        else{
            try {
                float Luong = Float.parseFloat(ngayCong)*Float.parseFloat(heSoLuong)*200000;
            int luong = (int)Luong;
            jl_TongLuong.setText(Integer.toString(luong));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "không tính được lương, do bạn nhập sai ngày công hoặc hệ số lương!");
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
}


