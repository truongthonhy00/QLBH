package Controller;

import Model.DBConnector;
import Model.Bill;
import Model.Cart;
import Model.Product;
import java.math.BigDecimal;
import java.sql.Statement;
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
public class BillManager {
    Connection conn;
    public BillManager() throws SQLException, ClassNotFoundException, Exception{
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    
    public Bill getDetail(int maHD) throws SQLException{
        String query = "Select * from HOADON hd where hd.mahd = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, maHD);
        ResultSet rs = ps.executeQuery();
        Bill hd = null; 
        while (rs.next()){
            hd = new Bill(maHD, rs.getString("MaMH"), rs.getInt("SoLuongMua"), rs.getInt("ThanhTien"));
        }
        return hd;
    }
    
    public void addCart(String TenMHGH, int DonGiaGH, int SoLuongMua, int ThanhTien) throws SQLException{
        String query2 = "insert into GIOHANG(TenMHGH, DonGiaGH, SoLuongMua, ThanhTien) values(?, ?, ?, ?)";
        PreparedStatement ps2 = this.conn.prepareStatement(query2);
        ps2.setString(1, TenMHGH);
        ps2.setInt(2, DonGiaGH);
        ps2.setInt(3, SoLuongMua);
        ps2.setInt(4, ThanhTien);
        ps2.execute();
}
    
    public void addBill(int MaKH, String MaMH, int SoLuongMua, int ThanhTien) throws SQLException
    {
        String query2 = "insert into HOADON(MaKH, MaMH, SoLuongMua, ThanhTien) values(?, ?, ?, ?)";
        PreparedStatement ps2 = this.conn.prepareStatement(query2);
        ps2.setInt(1, MaKH);
        ps2.setString(2, MaMH);
        ps2.setInt(3, SoLuongMua);
        ps2.setInt(4, ThanhTien);
        ps2.execute();
    }
    
    public boolean deleteCart() throws SQLException {
            String query =  "delete from GIOHANG";
            Statement st = this.conn.createStatement();
            st.execute(query);
            return true;
    }
    
    public List<Cart> getListGH_follow_TenMH() throws SQLException{
        List<Cart> ListGH_follow_TenMH = new ArrayList<>();
        String query = "Select * from GIOHANG gh, MATHANG mh where gh.TenMHGH=mh.TenMH order by Stt";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        Cart gh = null;
        while(rs.next()){
            gh = new Cart();
            gh.setStt(rs.getInt("Stt"));
            gh.setTenMHGH(rs.getString("TenMHGH"));
            gh.setDonGiaGH(rs.getInt("DonGiaGH"));
            gh.setSoLuongMua(rs.getInt("SoLuongMua"));
            gh.setThanhTien(rs.getInt("ThanhTien"));
            
            gh.setSttMH(rs.getInt("SttMH"));
            gh.setMaMH(rs.getString("MaMH"));
            gh.setTenMH(rs.getString("TenMH"));
            gh.setHangSX(rs.getString("HangSX"));
            gh.setLoaiMH(rs.getString("LoaiMH"));
            
            ListGH_follow_TenMH.add(gh);
        }
        return ListGH_follow_TenMH;
        
        
    }

    
    public int TongHD() throws SQLException{
        String query = "Select hd.mahd, hd.makh, hd.manvban, sum(ThanhTien) 'TongTien'\n" +
                        "from HOADON hd\n" +
                        "group by hd.mahd, hd.makh, hd.manvban";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        int tongHD = rs.getInt("TongTien");
        return tongHD;
    }
    
    public int getDonGia(String tenMH) throws SQLException{
        String query = "Select DonGia from MATHANG where tenmh = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, tenMH);
        ResultSet rs = ps.executeQuery();
        int donGia = 0;
        if(rs.next()){
            donGia = rs.getInt("DonGia");            
        }
        return donGia;
    }
    
    public String getTenNV(int maNV) throws SQLException{
        String query = "Select HoTen from NHANVIEN nv where nv.manv = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, maNV);
        ResultSet rs = ps.executeQuery();
        String tenNV = null;
        if(rs.next()){
            tenNV = rs.getString("TenNV");            
        }
        return tenNV;
    }
    
    public String getTenKH(int maKH) throws SQLException{
        String query = "Select HoTen from KHACHHANG kh where kh.makh = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setInt(1, maKH);
        ResultSet rs = ps.executeQuery();
        String tenKH = null;
        if(rs.next()){
            tenKH = rs.getString("HoTen");            
        }
        return tenKH;
    }
    
    public boolean deleteCart_follow_SttGH (int SttGH) throws SQLException{
            String query =  "DELETE FROM GIOHANG WHERE Stt =?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setInt(1, SttGH);
            ps.execute();
            return true;
    }
    
    public String getMaMH(String tenMH) throws SQLException{
        String query = "Select MaMH from MATHANG  where TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, tenMH);
        ResultSet rs = ps.executeQuery();
        String maMH = "";
        if(rs.next()){
            maMH = rs.getString("MaMH");            
        }      
        return maMH;
    }
    
    
// Đưa ra ds tất cả mặt hàng   
    public List<Product> getListAllMH() throws SQLException{
        List<Product> ListAllMH = new ArrayList<>();
        String query = "Select TenMH from MATHANG mh group by TenMH";
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setTenMH(rs.getString("TenMH"));
            ListAllMH.add(mh);
        }
        return ListAllMH;
    }
    
// Đưa ra ds tất cả hãng sản xuất   
    public List<Product> getListAllHangSX() throws SQLException{
        List<Product> ListAllHangSX = new ArrayList<>();
        String query = "Select HangSX from MATHANG mh group by HangSX";
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setHangSX(rs.getString("HangSX"));
            ListAllHangSX.add(mh);
        }
        return ListAllHangSX;
    }

 // Đưa ra ds tất cả loại mặt hàng   
    public List<Product> getListAllLoaiMH() throws SQLException{
        List<Product> ListAllLoaiMH = new ArrayList<>();
        String query = "Select LoaiMH from MATHANG mh group by LoaiMH";
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setLoaiMH(rs.getString("LoaiMH"));
            ListAllLoaiMH.add(mh);
        }
        return ListAllLoaiMH;
    }
    
   
                      ////// Đưa ra DS Tên Mặt Hàng
           ////theo Hãng Sản Xuất
    public List<Product> getListTenMH_follow_HangSX(String HangSX) throws SQLException{
        List<Product> ListTenMH_follow_HangSX = new ArrayList<>();
        String query = "Select distinct TenMH from MATHANG mh where HangSX = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, HangSX);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setTenMH(rs.getString("TenMH"));
            ListTenMH_follow_HangSX.add(mh);
        }
        return ListTenMH_follow_HangSX;
    }
    
          //// theo Loại Mặt Hàng
    public List<Product> getListTenMH_follow_LoaiMH(String LoaiMH) throws SQLException{
        List<Product> ListTenMH_follow_LoaiMH = new ArrayList<>();
        String query = "Select distinct TenMH from MATHANG mh where LoaiMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, LoaiMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setTenMH(rs.getString("TenMH"));
            ListTenMH_follow_LoaiMH.add(mh);
        }
        return ListTenMH_follow_LoaiMH;
    }
    
         //// theo Loại Mặt Hàng và Hãng Sản Xuất
    public List<Product> getListTenMH_follow_LoaiMH_and_HangSX(String LoaiMH, String HangSX) throws SQLException{
        List<Product> TenMH_follow_LoaiMH_and_HangSX = new ArrayList<>();
        String query = "Select distinct TenMH from MATHANG mh where LoaiMH = ? and HangSX = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, LoaiMH);
        ps.setString(2, HangSX);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setTenMH(rs.getString("TenMH"));
            TenMH_follow_LoaiMH_and_HangSX.add(mh);
        }
        return TenMH_follow_LoaiMH_and_HangSX;
    }
    
        
    
    
    
                            ////// Đưa ra DS Loại Mặt Hàng
        //// theo Hãng Sản Xuất
    public List<Product> getListLoaiMH_follow_HangSX(String HangSX) throws SQLException{
        List<Product> ListLoaiMH_follow_HangSX = new ArrayList<>();
        String query = "Select distinct LoaiMH from MATHANG mh where HangSX = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, HangSX);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setLoaiMH(rs.getString("LoaiMH"));
            ListLoaiMH_follow_HangSX.add(mh);
        }
        return ListLoaiMH_follow_HangSX;
    }
    
         //// theo Tên Mặt Hàng
    public List<Product> getListLoaiMH_follow_TenMH(String TenMH) throws SQLException{
        List<Product> ListLoaiMH_follow_TenMH = new ArrayList<>();
        String query = "Select distinct LoaiMH from MATHANG mh where TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, TenMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setLoaiMH(rs.getString("LoaiMH"));
            ListLoaiMH_follow_TenMH.add(mh);
        }
        return ListLoaiMH_follow_TenMH;
    }
    
         //// theo Hãng Sản Xuất và Tên Mặt Hàng
    public List<Product> getListLoaiMH_follow_HangSX_and_TenMH(String HangSX, String TenMH) throws SQLException{
        List<Product> ListLoaiMH_follow_HangSX_and_TenMH = new ArrayList<>();
        String query = "Select distinct LoaiMH from MATHANG mh where HangSX = ? and TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, HangSX);
        ps.setString(2, TenMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setLoaiMH(rs.getString("LoaiMH"));
            ListLoaiMH_follow_HangSX_and_TenMH.add(mh);
        }
        return ListLoaiMH_follow_HangSX_and_TenMH;
    }
    
 
    
      
    
                               ////// Đưa ra DS Hãng Sản Xuất
        //// theo Loại Mặt Hàng
    public List<Product> getListHangSX_follow_LoaiMH(String LoaiMH) throws SQLException{
        List<Product> ListHangSX_follow_LoaiMH = new ArrayList<>();
        String query = "Select distinct HangSX from MATHANG mh where LoaiMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, LoaiMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setHangSX(rs.getString("HangSX"));
            ListHangSX_follow_LoaiMH.add(mh);
        }
        return ListHangSX_follow_LoaiMH;
    }
      
      ///// theo Tên Mặt Hàng   
    public List<Product> getListHangSX_follow_TenMH(String TenMH) throws SQLException{
        List<Product> ListHangSX_follow_TenMH = new ArrayList<>();
        String query = "Select distinct HangSX from MATHANG mh where TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, TenMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setHangSX(rs.getString("HangSX"));
            ListHangSX_follow_TenMH.add(mh);
        }
        return ListHangSX_follow_TenMH;
    }
    
      //// theo Loại Mặt Hàng và Tên Mặt Hàng
    public List<Product> getListHangSX_follow_LoaiMH_and_TenMH(String LoaiMH, String TenMH) throws SQLException{
        List<Product> ListHangSX_follow_LoaiMH_and_TenMH = new ArrayList<>();
        String query = "Select distinct HangSX from MATHANG mh where LoaiMH = ? and TenMH = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, LoaiMH);
        ps.setString(2, TenMH);
        ResultSet rs = ps.executeQuery();
        Product mh = null;
        while(rs.next()){
            mh = new Product();
            mh.setHangSX(rs.getString("HangSX"));
            ListHangSX_follow_LoaiMH_and_TenMH.add(mh);
        }
        return ListHangSX_follow_LoaiMH_and_TenMH;
    }
    
    
               ////Xử lý phần chuyển tiền từ số thành chữ
     //Chuyển số thành chữ
    public static String numberToString(BigDecimal number) {
		String sNumber = number.toString();
		// Tao mot bien tra ve
		String sReturn = "";
		// Tim chieu dai cua chuoi
		int iLen = sNumber.length();
		// Lat nguoc chuoi nay lai
		String sNumber1 = "";
		for (int i = iLen - 1; i >= 0; i--) {
			sNumber1 += sNumber.charAt(i);
		}
		// Tao mot vong lap de doc so
		// Tao mot bien nho vi tri cua sNumber
		int iRe = 0;
		do {
			// Tao mot bien cat tam
			String sCut = "";
			if (iLen > 3) {
				sCut = sNumber1.substring((iRe * 3), (iRe * 3) + 3);
				sReturn = Read(sCut, iRe) + sReturn;
				iRe++;
				iLen -= 3;
			} else {
				sCut = sNumber1.substring((iRe * 3), (iRe * 3) + iLen);
				sReturn = Read(sCut, iRe) + sReturn;
				break;
			}
		} while (true);
		if(sReturn.length() > 1){
			sReturn = sReturn.substring(0,1).toUpperCase() + sReturn.substring(1);
		}
		sReturn = sReturn + "đồng";

		// xu ly lan cuoi voi 220 000 tỷ 000 000 000 000 000 HUTTV ADDED 3 OCT
		if(sNumber.length()>12)
		{
			// tren gia tri can xu ly, kiem tra xem don vi TY co = 000 khong
			int begin = sNumber.length()-9;
			String donviTy = sNumber.substring(begin-3, (begin-3)+3);
			if(donviTy.equals("000"))
			{
				sReturn = sReturn.replaceFirst("ngàn", "ngàn tỷ");
			}
		}


		return sReturn;
	}
    
    //Đọc số đưa vào
    public static String Read(String sNumber, int iPo) {
		// Tao mot bien tra ve
		String sReturn = "";
		// Tao mot bien so
		String sPo[] = { "", "ngàn" + " ",
				"triệu" + " ", "tỷ" + " ",  "ngàn" + " "};
		String sSo[] = { "không" + " ", "một" + " ",
				"hai" + " ", "ba" + " ",
				"bốn" + " ", "năm" + " ",
				"sáu" + " ", "bảy" + " ",
				"tám" + " ", "chín" + " " };
		String sDonvi[] = { "", "mươi" + " ",
				"trăm" + " " };
		// Tim chieu dai cua chuoi
		int iLen = sNumber.length();
		// Tao mot bien nho vi tri doc
		int iRe = 0;
		// Tao mot vong lap de doc so
		for (int i = 0; i < iLen; i++) {
			String sTemp = "" + sNumber.charAt(i);
			int iTemp = Integer.parseInt(sTemp);
			// Tao mot bien ket qua
			String sRead = "";
			// Kiem tra xem so nhan vao co = 0 hay ko
			if (iTemp == 0) {
				switch (iRe) {
					case 0:
						break;// Khong lam gi ca
					case 1: {
						if (Integer.parseInt("" + sNumber.charAt(0)) != 0) {
							sRead = "lẻ" + " ";
						}
						break;
					}
					case 2: {
						if (Integer.parseInt("" + sNumber.charAt(0)) != 0
								&& Integer.parseInt("" + sNumber.charAt(1)) != 0) {
							sRead = "không trăm" + " ";
						}
						break;
					}
				}
			} else if (iTemp == 1) {
				switch (iRe) {
					case 1:
						sRead = "mười" + " ";
						break;
					default:
						sRead = "một" + " " + sDonvi[iRe];
						break;
				}
			} else if (iTemp == 5) {
				switch (iRe) {
					case 0: {
						if(sNumber.length() <= 1){
							sRead = "năm" + " ";
						}
						else if (Integer.parseInt("" + sNumber.charAt(1)) != 0) {
							sRead = "lăm" + " ";
						} else
							sRead = "năm" + " ";
						break;
					}
					default:
						sRead = sSo[iTemp] + sDonvi[iRe];
				}
			} else {
				sRead = sSo[iTemp] + sDonvi[iRe];
			}

			sReturn = sRead + sReturn;
			iRe++;
		}
		if (sReturn.length() > 0) {
			sReturn += sPo[iPo];
		}
		// xu ly lan cuoi voi 220 000 tỷ 000 000 000 000 000
		if(sNumber.length()>12)
		{
			// tren gia tri can xu ly, kiem tra xem don vi TY co = 000 khong
			System.out.println(sNumber.substring(11, 8));
		}
		return sReturn;
	}
}