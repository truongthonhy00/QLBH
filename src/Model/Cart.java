package Model;


public class Cart extends Product{
    private int Stt;
    private String TenMHGH;
    private int DonGiaGH;
    private int SoLuongMua;
    private int ThanhTien;
    
    
    public Cart(){
        
    }
    public Cart(int Stt, String TenMHGH, int DonGiaGH, int SoLuongMua, int ThanhTien ) {
        this.Stt = Stt;
        this.SoLuongMua = SoLuongMua;
        this.TenMHGH = TenMHGH;
        this.DonGiaGH = DonGiaGH;
        this.ThanhTien = ThanhTien;
    }
    
    
    
     public int getStt() {
        return Stt;
    }

    public void setStt(int Stt) {
        this.Stt = Stt;
    }
    
    public String getTenMHGH() {
        return TenMHGH;
    }

    public void setTenMHGH(String TenMHGH) {
        this.TenMHGH = TenMHGH;
    } 
    
    public int getDonGiaGH() {
        return DonGiaGH;
    }

    public void setDonGiaGH(int DonGiaGH) {
        this.DonGiaGH = DonGiaGH;
    }    

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    public int getSoLuongMua() {
        return SoLuongMua;
    }

    public void setSoLuongMua(int SoLuongMua) {
        this.SoLuongMua = SoLuongMua;
    }
}