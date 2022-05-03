/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class xuatnhap {
    public static void main(String[] args){
    boolean flag = true;
    int a = 15;
    byte b = 2;
    double c = 12.6;
    float d = 4.5f;
    String s = "Hello World";
    char ch = 'A';
    
    Scanner sc = new Scanner(System.in);
//    System.out.print("Hay nhap ho ten");
//    String hoten = sc.nextLine();
//    System.out.print("Ban da nhap ho ten la " + hoten);
    
    System.out.print("Hay nhap mot so nguyen ");
    String input = sc.nextLine();
    a = Integer.parseInt(input);
    System.out.print("So nguyen ma ban daa nhap la" + a);
    
    System.out.print("Hay nhap mot so thuc ");
    input = sc.nextLine();
    c = Double.parseDouble(input);
    System.out.print("So thuc ma ban daa nhap la" + c);
    }
}
