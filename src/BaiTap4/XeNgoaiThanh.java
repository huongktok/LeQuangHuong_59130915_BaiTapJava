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
public class XeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgayDi;
    public XeNgoaiThanh(String maSoChuyen,String hoTenTaiXe,String soXe, double doanhThu,String noiDen,int soNgayDi)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen=noiDen;
        this.soNgayDi=soNgayDi;
    }
    @Override
    public void inThongTinChuyenXe()
    {
     System.out.println("Ma So Chuyen: "+this.maSoChuyen+
                        "\nHo Va Ten Tai Xe: "+this.hoTenTaiXe+
                        "\nSo Xe: "+this.soXe+
                        "\nNoi Den: "+this.noiDen+
                        "\nSO Ngay Di: "+this.soNgayDi+
                        "\nDoanh Thu: "+this.doanhThu);
    }
}