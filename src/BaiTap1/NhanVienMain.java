/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap1;

/**
 *
 * @author lehuo
 */
public class NhanVienMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       NhanVien nhanVien1 = new NhanVien("Lê Quang Hưởng", 21, "Ninh Hòa", 5000000, 300);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Anh Đức", 21, "Nha Trang", 3000000, 200);
        System.out.println(nhanVien1.getThongTin()+"Tiền Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Tiền Thưởng:"+nhanVien2.tinhThuong()); 
    }
    
}
