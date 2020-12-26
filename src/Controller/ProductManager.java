/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnector; 
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huutr
 */
public class ProductManager {
    Connection conn;
    public ProductManager() throws SQLException, ClassNotFoundException, Exception{
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    
    public Product getDetail(String maMH) throws SQLException{
        String query = "Select * from MATHANG mh where mh.mamh = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, maMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null; 
        while (rs.next()){
            mh = new Product(rs.getInt("SttMH") ,maMH, rs.getString("TenMH"), rs.getString("hangSX"), rs.getInt("SoLuong"), rs.getInt("DonGia"),rs.getString("LoaiMH"));
        }
        return mh;
    }
    
    
    
    public void addProduct(String MaMH, String TenMH, String LoaiMH, String HangSx, int SoLuong, int DonGia) throws SQLException{
        String query2 = "insert MATHANG values(?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.conn.prepareStatement(query2);
        ps.setString(1, MaMH);
        ps.setString(2, TenMH);
        ps.setString(3, LoaiMH);
        ps.setString(4, HangSx);
        ps.setInt(5, SoLuong);
        ps.setInt(6, DonGia);
        ps.execute();
        }
   
    
    
    public List<Product> getListMH() throws SQLException{
        List<Product> listMH = new ArrayList<>();
        String query = "Select * from MATHANG order by SttMH\n";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setSttMH((rs.getInt("SttMH")));
            mh.setMaMH((rs.getString("MaMH")));
            mh.setTenMH(rs.getString("TenMH"));
            mh.setLoaiMH(rs.getString("LoaiMH"));
            mh.setHangSX(rs.getString("HangSX"));
            mh.setSoLuong(rs.getInt("SoLuong"));
            mh.setDonGia(rs.getInt("DonGia"));
            listMH.add(mh);
        }
        return listMH;
    }
    
    public String getMaMH(String tenMH) throws SQLException{
        String query = "Select * from MATHANG where tenmh = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, tenMH);
        ResultSet rs = ps.executeQuery();
        String maMH = "";
        if (rs.next()){
            maMH = rs.getString("MaMH");
        }
        return maMH;
    }
    
    
           //Phục vụ tìm kiếm
    public boolean check_MaMH(String maMH) throws SQLException{
        String query = "Select * from MATHANG  where MaMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, maMH);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            return true;
        }
        return false;
    }
    
    
    public List<Product> getListMH_follow_MaMH(String MaMH) throws SQLException{
        List<Product> ListMH_follow_MaMH = new ArrayList<>();
        String query = "Select * from MATHANG where MaMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, MaMH);
        ResultSet rs = ps.executeQuery();
        Product pd = null;
        while(rs.next()){
            pd = new Product();
            pd.setSttMH(rs.getInt("sttMH"));
            pd.setMaMH(rs.getString("MaMH"));
            pd.setTenMH(rs.getString("TenMH"));
            pd.setLoaiMH(rs.getString("LoaiMH"));
            pd.setHangSX(rs.getString("HangSX"));
            pd.setSoLuong(rs.getInt("SoLuong"));
            pd.setDonGia(rs.getInt("DonGia"));
            ListMH_follow_MaMH.add(pd);
        }
        return ListMH_follow_MaMH;
    }
    
    
    
    
     public boolean Check_TenMH(String TenMH) throws SQLException{
            String query = "Select *  FROM MATHANG WHERE TenMH =?;";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, TenMH);
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
     
     public List<Product> getListMH_follow_TenMH(String TenMH) throws SQLException{
        List<Product> ListMH_follow_TenMH = new ArrayList<>();
        String query = "Select * from MATHANG where TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, TenMH);
        ResultSet rs = ps.executeQuery();
        Product pd = null;
        while(rs.next()){
            pd = new Product();
            pd.setSttMH(rs.getInt("sttMH"));
            pd.setMaMH(rs.getString("MaMH"));
            pd.setTenMH(rs.getString("TenMH"));
            pd.setLoaiMH(rs.getString("LoaiMH"));
            pd.setHangSX(rs.getString("HangSX"));
            pd.setSoLuong(rs.getInt("SoLuong"));
            pd.setDonGia(rs.getInt("DonGia"));
            ListMH_follow_TenMH.add(pd);
        }
        return ListMH_follow_TenMH;
    }
     
     
     
     
     
      public boolean Check_LoaiMH(String LoaiMH) throws SQLException{
            String query = "Select *  FROM MATHANG WHERE LoaiMH =?;";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, LoaiMH);
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
      public List<Product> getListMH_follow_LoaiMH(String LoaiMH) throws SQLException{
        List<Product> ListMH_follow_LoaiMH = new ArrayList<>();
        String query = "Select * from MATHANG where LoaiMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, LoaiMH);
        ResultSet rs = ps.executeQuery();
        Product pd = null;
        while(rs.next()){
            pd = new Product();
            pd.setSttMH(rs.getInt("sttMH"));
            pd.setMaMH(rs.getString("MaMH"));
            pd.setTenMH(rs.getString("TenMH"));
            pd.setLoaiMH(rs.getString("LoaiMH"));
            pd.setHangSX(rs.getString("HangSX"));
            pd.setSoLuong(rs.getInt("SoLuong"));
            pd.setDonGia(rs.getInt("DonGia"));
            ListMH_follow_LoaiMH.add(pd);
        }
        return ListMH_follow_LoaiMH;
    }
      
      
      
      
      
       public boolean Check_HangSX(String HangSX) throws SQLException{
            String query = "Select *  FROM MATHANG WHERE HangSX =?;";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, HangSX);
            ResultSet rs = ps.executeQuery();
            if(rs.next())return true;
            else return false;
    }
       public List<Product> getListMH_follow_HangSX(String HangSX) throws SQLException{
        List<Product> ListMH_follow_HangSX = new ArrayList<>();
        String query = "Select * from MATHANG where HangSX = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, HangSX);
        ResultSet rs = ps.executeQuery();
        Product pd = null;
        while(rs.next()){
            pd = new Product();
            pd.setSttMH(rs.getInt("sttMH"));
            pd.setMaMH(rs.getString("MaMH"));
            pd.setTenMH(rs.getString("TenMH"));
            pd.setLoaiMH(rs.getString("LoaiMH"));
            pd.setHangSX(rs.getString("HangSX"));
            pd.setSoLuong(rs.getInt("SoLuong"));
            pd.setDonGia(rs.getInt("DonGia"));
            ListMH_follow_HangSX.add(pd);
        }
        return ListMH_follow_HangSX;
    }
       
       
       
       
       //Xóa mặt hàng theo Mã mặt hàng
       public boolean deleteProduct(String maMH) throws SQLException{
            String query =  "DELETE FROM HOADON WHERE MAMH =? DELETE FROM MATHANG WHERE MAMH =?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, maMH);
            ps.setString(2, maMH);
            ps.execute();
            return true;
    }
       
       
            //Update lại mặt hàng 
        public boolean updateMH(int STT, String MaMH, String TenMH, String LoaiMH, String HangSX, int SoLuong, int DonGia) throws SQLException{
        if (this.check_MaMH(MaMH)){
            String query = "update MATHANG " + "SET MaMH = ?, TenMH = ? , LoaiMH = ?, HangSX = ?, SoLuong = ?, DonGia = ? where SttMH = ?";
            PreparedStatement ps2 = this.conn.prepareStatement(query);
            ps2.setString(1, MaMH);
            ps2.setString(2, TenMH);
            ps2.setString(3, LoaiMH);
            ps2.setString(4, HangSX);
            ps2.setInt(5, SoLuong);
            ps2.setInt(6, DonGia);
            ps2.setInt(7, STT);
            ps2.execute();
            return true;            
        } else{
            return false;
        }
    }
}
