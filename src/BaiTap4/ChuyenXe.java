/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap4;

/**
 *
 * @author lehuo
 */
public abstract class ChuyenXe {
   public String maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public double doanhThu;

    public double getDoanhThu() {
        return doanhThu;
    }
    
    public ChuyenXe(String maSoChuyen,String hoTenTaiXe,String soXe, double doanhThu)
    {
        this.maSoChuyen=maSoChuyen;
        this.hoTenTaiXe=hoTenTaiXe;
        this.soXe=soXe;
        this.doanhThu=doanhThu;
                
               
    }
    public abstract void inThongTinChuyenXe(); 
}
