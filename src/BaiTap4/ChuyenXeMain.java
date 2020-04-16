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
public class ChuyenXeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Khởi tạo
        ChuyenXe cx1 = new XeNoiThanh("001", 90, "001", "Lê Quang Hưởng", "79-Z1011.10", 3500000);
        ChuyenXe cx2 = new XeNoiThanh("002", 140, "002", "Nguyễn Song Thành", "56-A2102.34", 8200000);
        ChuyenXe cx3 = new XeNoiThanh("003", 300, "003", "Nguyễn Vạn Năng", "72-C2192.56", 13000000);
        ChuyenXe cx4 = new XeNgoaiThanh("TPHCM", 3, "004", "Hồ Lê Thanh Thiện", "TH1010", 4000000);
        ChuyenXe cx5 = new XeNgoaiThanh("Hà Nội", 4, "005", "Lê Thành Phương", "TH33333", 2300000);
        ChuyenXe cx6 = new XeNgoaiThanh("Phú Yên", 1, "006", "", "Nguyễn Cao Hùng", 7550000);
        
        // Thêm vào DS
        QuanLyChuyenXe quanlychuyenxe = new QuanLyChuyenXe();
        quanlychuyenxe.themChuyenXe(cx1);
        quanlychuyenxe.themChuyenXe(cx2);
        quanlychuyenxe.themChuyenXe(cx3);
        quanlychuyenxe.themChuyenXe(cx4);
        quanlychuyenxe.themChuyenXe(cx5);
        quanlychuyenxe.themChuyenXe(cx6);
        
        // Xuất DS
        quanlychuyenxe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: "+quanlychuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+quanlychuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(quanlychuyenxe.tinhDoanhThuNoiThanh()+quanlychuyenxe.tinhDoanhThuNgoaiThanh()));
    }
    
    
}
