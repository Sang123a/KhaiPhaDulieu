/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ADMIN
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("nguyen van A", 1, ngaysinh);
        
        System.out.println("Ho ten: " + person.getHoten() + "; Gioi tinh: "
        + person.getGioitinh() + "; Ngay sinh: " + df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("nguyen van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2012"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(sinhvien.getHoten()+ "; gioi tinh " + 
                sinhvien.getGioitinh() + "; ngay sinh" + df.format(sinhvien.getNgaysinh())
                + "; " + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Ngyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten()+ "; gioi tinh " + 
                congnhan.getGioitinh() + "; ngay sinh" + df.format(congnhan.getNgaysinh())
                + "; " + congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
            
    }
}
