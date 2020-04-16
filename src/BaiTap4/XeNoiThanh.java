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
public class XeNoiThanh extends ChuyenXe{
    String soTuyen;
    double soKm;
    public XeNoiThanh(){
    }
    public XeNoiThanh(String soTuyen, double soKm, String MaSoChuyen, String HoTenTX, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTX, SoXe, DoanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Số tuyến:"+soTuyen+"\n"+"Số km:"+soKm+"\n");
    }   
}
