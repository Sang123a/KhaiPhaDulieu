/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong02.donglenh;

import lthdt.chuong02.logiclayer.PhuongTrinhBac2;

/**
 *
 * @author ADMIN
 */
public class testPTB2 {
    public static void main(String[] args){
        System.out.println("Giair phuong trinh bac2 ");
        PhuongTrinhBac2 obj = new PhuongTrinhBac2(3.5, -4, 2);
        obj.giaiphuongtrinh();
        System.out.println(obj.getKetqua());
    }
}
