/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author huutr
 */
public class Staff extends Person{
    private int maNV;
    private float ngayCong;
    private float heSoLuong;
    private int luong;
    private int MaSoThue;

    public Staff(){        
    }
    public Staff( int maNV, String name, String gender, Date ngaySinh, String address,  int phone,  float ngayCong, float heSoLuong, int luong) {
        super(name, gender, ngaySinh, address, phone);
        this.maNV = maNV;
        this.ngayCong = ngayCong;
        this.heSoLuong = heSoLuong;
        this.luong = luong;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
    
    public int getMaSoThue() {
        return MaSoThue;
    }

    public void setMaSoThue(int MaSoThue) {
        this.MaSoThue = MaSoThue;
    }

    public float getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(float ngayCong) {
        this.ngayCong = ngayCong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    
}

