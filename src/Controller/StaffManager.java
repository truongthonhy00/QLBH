/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnector;
import Model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author huutr
 */
public class StaffManager {
    Connection conn;
    public StaffManager() throws SQLException, ClassNotFoundException, Exception{
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    public int login(String userName, String passWord) throws SQLException{
        String query = "Select * from ACCOUNT where acc = ? and pass = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, userName);
        ps.setString(2, passWord);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String s1 = rs.getString("role");
            if(s1.equalsIgnoreCase("Admin")){
                return 0;
            }
            else if (s1.equalsIgnoreCase("User")){
                return 1;
            }
        }
        return 2;
    }
    
    public Staff getDetail(int maNV) throws SQLException{
        String query = "Select * from NHANVIEN  where MaNV = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, maNV);
        ResultSet rs = ps.executeQuery();
        Staff nv = null; 
        while (rs.next()){
            nv = new Staff(maNV, rs.getString("HoTen"), rs.getString("GioiTinh"), rs.getDate("NgaySinh"), rs.getString("DiaChi"), rs.getInt("SDT"), rs.getFloat("NgayCong"), rs.getFloat("HeSoLuong"), rs.getInt("Luong"));
        }
        return nv;
    }
    
    
    
    public boolean checkSexStaff(int maNV) throws SQLException{
        String query = "Select GioiTinh from NHANVIEN  where manv = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, maNV);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            if("Nam".equals(rs.getString("GioiTinh")))
                return true;
        }
        return false;
    }
    
    public void addNV(String hoTen, Date ngaySinh, String diaChi, String gioiTinh, int phone, float ngayCong, float heSoLuong, float luong) throws SQLException{
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd");
        String stringDate= DateFor.format(ngaySinh);
        String query2 = "insert NHANVIEN " + "values(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps2 = this.conn.prepareStatement(query2);
        ps2.setString(1, hoTen);
        ps2.setString(2, stringDate);
        ps2.setString(3, diaChi);
        ps2.setString(4, gioiTinh);
        ps2.setInt(5, phone);
        ps2.setFloat(6, ngayCong);
        ps2.setFloat(7, heSoLuong);
        ps2.setFloat(8, luong);
        ps2.execute();
    }
      
       
    
    public boolean updateNV(int maNV, String hoTen, Date ngaySinh, String diaChi, String gioiTinh, int phone, float ngayCong, float heSoLuong, float Luong) throws SQLException{
        if (this.Check_MaNV(maNV)){
            SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
            String stringDate= DateFor.format(ngaySinh);
            String query = "update NHANVIEN " + "SET HoTen = ?, NgaySinh = ? , DiaChi = ?, GioiTinh = ?, SDT = ?, NgayCong = ?, HeSoLuong = ?, Luong = ? WHERE NHANVIEN.manv=?";
            PreparedStatement ps2 = this.conn.prepareStatement(query);
            ps2.setString(1, hoTen);
            ps2.setString(2, stringDate);
            ps2.setString(3, diaChi);
            ps2.setString(4, gioiTinh);
            ps2.setInt(5, phone);
            ps2.setFloat(6, ngayCong);
            ps2.setFloat(7, heSoLuong);
            ps2.setFloat(8, Luong);
            ps2.setInt(9, maNV);
            ps2.execute();
            return true;            
        } else{
            return false;
        }
    }
    
    
    public void addKH(String HoTen, String DiaChi, int Sđt, String MaSoThue, int TongGH) throws SQLException
    {
        String query2 = "insert into KHACHHANG(HoTen, DiaChi, SDT, MaSoThue, TongHD) values(?, ?, ?, ?, ?)";
        PreparedStatement ps2 = this.conn.prepareStatement(query2);
        ps2.setString(1, HoTen);
        ps2.setString(2, DiaChi);
        ps2.setInt(3, Sđt);
        ps2.setString(4, MaSoThue);
        ps2.setInt(5, TongGH);
        ps2.execute();
    }
    
    public int getMaKH(int Sdt) throws SQLException
    {
        String query = "Select MaKH from KHACHHANG where SDT = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, Sdt);
        ResultSet rs = ps.executeQuery();
        int MaKH = 0;
        if(rs.next()){
            MaKH  = rs.getInt("MaKH");            
        } 
        return MaKH;
    }
    
    
    
    
    
             //DS nhân viên
     public List<Staff> getListNV() throws SQLException{
        List<Staff> ListNV = new ArrayList<>();
        String query = "Select * from NHANVIEN ";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        Staff nv = null;
        while(rs.next()){
            nv = new Staff();
            nv.setMaNV(rs.getInt("MaNV"));
            nv.setName(rs.getString("HoTen"));
            nv.setNgaySinh(rs.getDate("NgaySinh"));
            nv.setGender(rs.getString("GioiTinh"));
            nv.setAddress(rs.getString("DiaChi"));
            nv.setPhone(rs.getInt("SDT"));
            nv.setNgayCong(rs.getFloat("NgayCong"));
            nv.setHeSoLuong(rs.getFloat("HeSoLuong"));
            nv.setLuong(rs.getInt("Luong"));
            ListNV.add(nv);
        }
        return ListNV;
    }
    
    
                      ////Tìm kiếm theo Mã nhân viên
     //Kiểm tra mã nhân viên lấy từ ô tìm kiếm
    public boolean Check_MaNV(int MaNV) throws SQLException{
            String query = "Select *  FROM NHANVIEN WHERE MANV like ?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            String.valueOf(MaNV);
            ps.setString(1, "%"+MaNV+"%");
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
     
    
       //Lấy DS nhân viên theo mã nhân viên(Lấy từ ô tìm kiếm) 
     public List<Staff> getListNV_follow_MaNV(int MaNV) throws SQLException{
        List<Staff> ListNV_follow_MaNV = new ArrayList<>();
        String query = "Select * from NHANVIEN where MaNV like ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        String.valueOf(MaNV);
        ps.setString(1, "%"+MaNV+"%");
        ResultSet rs = ps.executeQuery();
        Staff nv = null;
        while(rs.next()){
            nv = new Staff();
            nv.setMaNV(rs.getInt("MaNV"));
            nv.setName(rs.getString("HoTen"));
            nv.setNgaySinh(rs.getDate("NgaySinh"));
            nv.setGender(rs.getString("GioiTinh"));
            nv.setAddress(rs.getString("DiaChi"));
            nv.setPhone(rs.getInt("SDT"));
            nv.setNgayCong(rs.getFloat("NgayCong"));
            nv.setHeSoLuong(rs.getFloat("HeSoLuong"));
            nv.setLuong(rs.getInt("Luong"));
            ListNV_follow_MaNV.add(nv);
        }
        return ListNV_follow_MaNV;
    }
     
     
     
                    ////Tìm kiếm theo Tên nhân viên
     //Kiểm tra Tên nhân viên lấy từ ô tìm kiếm
    public boolean Check_TenNV(String TenNV) throws SQLException{
            String query = "Select *  FROM NHANVIEN WHERE HoTen like ? ";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, "%"+TenNV+"%");
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
     
    
       //Lấy DS nhân viên theo Tên nhân viên(Lấy từ ô tìm kiếm) 
     public List<Staff> getListNV_follow_TenNV(String TenNV) throws SQLException{
        List<Staff> ListNV_follow_TenNV = new ArrayList<>();
        String query = "Select * from NHANVIEN where HoTen like ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, "%"+TenNV+"%");
        ResultSet rs = ps.executeQuery();
        Staff nv = null;
        while(rs.next()){
            nv = new Staff();
            nv.setMaNV(rs.getInt("MaNV"));
            nv.setName(rs.getString("HoTen"));
            nv.setNgaySinh(rs.getDate("NgaySinh"));
            nv.setGender(rs.getString("GioiTinh"));
            nv.setAddress(rs.getString("DiaChi"));
            nv.setPhone(rs.getInt("SDT"));
            nv.setNgayCong(rs.getFloat("NgayCong"));
            nv.setHeSoLuong(rs.getFloat("HeSoLuong"));
            nv.setLuong(rs.getInt("Luong"));
            ListNV_follow_TenNV.add(nv);
        }
        return ListNV_follow_TenNV;
    }
     
          
     
                ////Tìm kiếm theo SĐT nhân viên
     //Kiểm tra SĐT nhân viên lấy từ ô tìm kiếm
    public boolean Check_SDT(int SDT) throws SQLException{
            String query = "Select *  FROM NHANVIEN WHERE SDT like ?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            String.valueOf(SDT);
            ps.setString(1, "%"+SDT+"%");
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
     
    
       //Lấy DS nhân viên theo SĐT nhân viên(Lấy từ ô tìm kiếm) 
     public List<Staff> getListNV_follow_SDT(int SDT) throws SQLException{
        List<Staff> ListNV_follow_SDT = new ArrayList<>();
        String query = "Select * from NHANVIEN where SDT like ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        String.valueOf(SDT);
        ps.setString(1, "%"+SDT+"%");
        ResultSet rs = ps.executeQuery();
        Staff nv = null;
        while(rs.next()){
            nv = new Staff();
            nv.setMaNV(rs.getInt("MaNV"));
            nv.setName(rs.getString("HoTen"));
            nv.setNgaySinh(rs.getDate("NgaySinh"));
            nv.setGender(rs.getString("GioiTinh"));
            nv.setAddress(rs.getString("DiaChi"));
            nv.setPhone(rs.getInt("SDT"));
            nv.setNgayCong(rs.getFloat("NgayCong"));
            nv.setHeSoLuong(rs.getFloat("HeSoLuong"));
            nv.setLuong(rs.getInt("Luong"));
            ListNV_follow_SDT.add(nv);
        }
        return ListNV_follow_SDT;
    }
     
     
     
        //Xóa nhân viên theo chỉ số của hàng (tính từ 0)
     public boolean deleteNV_follow_MaNV (int MaNV) throws SQLException{
            String query =  "DELETE FROM NHANVIEN WHERE MaNV =?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setInt(1, MaNV);
            ps.execute();
            return true;
    }
     
     
     
     
     
      //Cài đặt trạng thái cho KH (0: KH cũ, 1:KH mới)
    public void setKH_Status (int Status, int SDT) throws SQLException
    {
        String query = "update KHACHHANG " + "SET TrangThaiKH = ? where SDT = ?";
        PreparedStatement ps2 = this.conn.prepareStatement(query);
        ps2.setInt(1, Status);
        ps2.setInt(2, SDT);
        ps2.execute();
    }
    
          //Lấy KH theo trạng thái
    public List<Staff> getListKH(int TrangThaiKH) throws SQLException
    {
        List<Staff> ListKH = new ArrayList<>();
        String query = "Select * from KHACHHANG where TrangThaiKH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, TrangThaiKH);
        ResultSet rs = ps.executeQuery();
        Staff kh = new Staff();
        while(rs.next()){
            kh.setMaNV(rs.getInt("MaKH"));
            kh.setName(rs.getString("HoTen"));
            kh.setAddress(rs.getString("DiaChi"));
            kh.setPhone(rs.getInt("SDT"));
            kh.setMaSoThue(rs.getString("MaSoThue"));
            kh.setLuong(rs.getInt("TongHD")); 
            ListKH.add(kh);
        } 
        return ListKH;
    }
    

    
    
    
          //Cài đặt trạng thái cho Acc (0: Acc off, 1:Acc on)
    public void setAcc_Status (int Status, String Acc) throws SQLException
    {
        String query = "update ACCOUNT " + "SET TrangThaiAcc = ? where acc = ?";
        PreparedStatement ps2 = this.conn.prepareStatement(query);
        ps2.setInt(1, Status);
        ps2.setString(2, Acc);
        ps2.execute();
    }
    
          //Lấy tên Acc theo trạng thái
    public String getAcc_follow_Status(int Status) throws SQLException
    {
        String query = "Select * from ACCOUNT where TrangThaiAcc = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, Status);
        ResultSet rs = ps.executeQuery();     
        String Acc = "";
        while(rs.next()){
            Acc = rs.getString("acc");
        } 
        return Acc;
    }
    
      //Lấy Mã nhân viên lập hóa đơn theo trạng thái
    public int getMaNVHT_follow_Status(int Status) throws SQLException
    {
        String query = "Select * from ACCOUNT where TrangThaiAcc = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, Status);
        ResultSet rs = ps.executeQuery();    
        int MaNVHT = 0;
        while(rs.next()){
            MaNVHT = rs.getInt("MaNVHT");
        } 
        return MaNVHT;
    }
    
        //Kiểm tra loại tên Acc 
    public boolean Check_Acc(String userName) throws SQLException{
        String query = "Select * from ACCOUNT where acc = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, userName);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String s1 = rs.getString("role");
            if(s1.equalsIgnoreCase("User")){
                return true;
            }
        }
        return false;
    }
}

