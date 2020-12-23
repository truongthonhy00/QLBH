/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author huutr
 */
public class Product {
    private String MaMH;
    private String TenMH;
    private String HangSX;
    private int SoLuong;
    private int DonGia;
    private String LoaiMH;
    private int SttMH;

    public int getSttMH() {
        return SttMH;
    }

    public void setSttMH(int SttMH) {
        this.SttMH = SttMH;
    }
    
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public Product(){
        
    }
    public Product(int SttMH, String MaMH, String TenMH, String HangSX, int soLuong, int DonGia, String LoaiMH) {
        this.SttMH = SttMH;
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.HangSX = HangSX;
        this.SoLuong = soLuong;
        this.DonGia = DonGia;
        this.LoaiMH = LoaiMH;
    }

    public String getLoaiMH() {
        return LoaiMH;
    }

    public void setLoaiMH(String LoaiMH) {
        this.LoaiMH = LoaiMH;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }
    
}

