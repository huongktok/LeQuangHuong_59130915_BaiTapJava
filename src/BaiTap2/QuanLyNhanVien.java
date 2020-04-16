/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author lehuo
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> DSNhanVien = new ArrayList<>();
    public void them(NhanVien nv) {
        DSNhanVien.add(nv);
    }
    
    public void inDS() {
         for (int i = 0; i < DSNhanVien.size(); i++) {
            System.out.println("Nhan vien thu: "+(i+1));
            System.out.println(DSNhanVien.get(i).getThongTin());
        }
    }
}
