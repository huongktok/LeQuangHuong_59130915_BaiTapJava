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
public class NhanVien {
    private String ten;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongGioLam;
  // Constructor không tham số.
  public NhanVien() 
    {
    this.ten="";
    this.tuoi= 0;
    this.diaChi="";
    this.tienLuong=0;
    this.tongGioLam=0;
    
    }
  public NhanVien(String ten,int tuoi,String diaChi,double tienLuong,int tongGioLam)
  {
       this.ten = ten;
       this.tuoi = tuoi;
       this.diaChi = diaChi;
       this.tienLuong = tienLuong;
       this.tongGioLam = tongGioLam;
  }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
// lay thong tin nv
    public  String getThongTin(){
        return "ten:"+ this.ten + "\t tuoi:"+this.tuoi+"\t dia chi:"+this.diaChi
       +"\t tien luong:"+this.tienLuong+"\t tong gio lam:"+this.tongGioLam
                +"\t tien thuong:"+tinhThuong();
    }
 //tinh luong nv
    public double tinhThuong(){
        if(this.tongGioLam>=200) return this.tienLuong*0.2;
        if(this.tongGioLam>=100) return this.tienLuong*0.1;
        return 0;
    }

    boolean getThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
