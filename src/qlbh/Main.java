package qlbh;
import View.DangNhap;
    

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);    
            }
        });
    }
}
