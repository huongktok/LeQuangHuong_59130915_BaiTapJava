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
        NhanVien nv1 = new NhanVien("Nguyen Quang Trung",21,"Quy Nhon , Binh Dinh",7000000,99);
      NhanVien nv2 = new NhanVien("Han Mac Tu",26,"Quy Nhon , Binh Dinh",14000000,201);
      //
      //in thong tin nv
      System.out.println(nv1.getThongTin());
      System.out.println(nv2.getThongTin()) ;
      
      
    }
    }
    
}
