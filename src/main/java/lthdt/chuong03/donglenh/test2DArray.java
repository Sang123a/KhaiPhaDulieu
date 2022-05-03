/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong03.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matran = new int [][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
//        matran = new int [5][7];
//        
//        Random rnd = new Random();
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < matran.length;i++)
//            for(int j = 0;j < matran[i].length;j++){
////                matran[i][j] = rnd.nextInt(1000);
//            System.out.print("a["+ i +"; "+ j +"] = ");
//            String input = sc.nextLine();
//            int n = Integer.parseInt(input);
//            matran[i][j] = n;
//            }
        
//        xuat
        for(int i =0;i<matran.length;i++)
            for(int j = 0;j < matran[i].length;j++)
                System.out.print(matran[i][j]+" ");
            System.out.println();
    }
    
}
