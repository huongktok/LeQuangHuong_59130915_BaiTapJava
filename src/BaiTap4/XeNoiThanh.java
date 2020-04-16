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
    public int soTuyen;
    public int soKM;
    public XeNoiThanh(String maSoChuyen,String hoTenTaiXe,String soXe, double doanhThu,int soTuyen,int soKM)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen=soTuyen;
        this.soKM=soKM;
    }
    @Override
    public void inThongTinChuyenXe()
    {
     System.out.println("Ma So Chuyen: "+this.maSoChuyen+
                        "\nHo Va Ten Tai Xe: "+this.hoTenTaiXe+
                        "\nSo Xe: "+this.soXe+
                        "\nSO Tuyen: "+this.soTuyen+
                        "\nSO KM di duoc: "+this.soKM+
                        "\nDoanh Thu: "+this.doanhThu);
    }
}
