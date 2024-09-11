/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab5;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
     public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);  
    
    System.out.println("#### Operator Mencari Luas Segitiga ####");
    System.out.println("Masukan nilai alas  :");  
    double alas = scanner.nextDouble();
    System.out.println("Masukan nilai tinggi :");
    double tinggi = scanner.nextDouble();
    
    double luas = (alas * tinggi)/2;

    System.out.println("Luas Segitiga : " + luas);
   

    // Menutup scanner  
    scanner.close(); 
    }
    
}
