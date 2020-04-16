/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author lehuo
 */
public class IQuanLyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         NhanVien nv0 = new NhanVien("Le Quang A",20,"Binh Dinh", 5000000, 140);
        NhanVien nv1 = new NhanVien("Le Quang B",20,"Quy Nhon", 9000000, 209);
        NhanVien nv2 = new NhanVien("Le Quang C",20,"Khanh Hoa", 4000000, 159);
        NhanVien nv3 = new NhanVien("Le Quang D",20,"Quy Nhon", 7000000, 301);
        NhanVien nv4 = new NhanVien("Le Quang E",20,"Phu Yen", 3000000, 69);
       QuanLyNhanVien qlnv = new QuanLyNhanVien();
     
       qlnv.them(nv0);
       qlnv.them(nv1);
       qlnv.them(nv2);
       qlnv.them(nv3);
       qlnv.them(nv4);
    
        qlnv.inDS();
    }

    private static class var {

        public var() {
        }

        private void them(NhanVien nv0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
