/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap3;

/**
 *
 * @author lehuo
 */
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;
     SinhVienPoly(String hoTen, String nganh) {
     this.hoTen = hoTen;
     this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
        if(this.getDiem() < 5) return "Yếu";
        if(this.getDiem() >= 5 && this.getDiem() < 6.5) return "Trung bình";     
        if(this.getDiem() >= 6.5 && this.getDiem() < 7.5) return "Khá";     
        if(this.getDiem() >= 7.5 && this.getDiem() < 9)return "Giỏi";
        return "Xuất sắc";
    }
    public void xuat()
    {
        System.out.println("Ten: "+this.hoTen+"\t Nganh: "+this.nganh
        +"\t Diem: "+this.getDiem()+"\t Hoc luc: "+this.getHocLuc()+"\n");
    }
}
