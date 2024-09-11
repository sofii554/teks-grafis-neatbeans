/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab8;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
    public static void main(String[] args) {
        // TODO code application logic here 
  
        Scanner scanner = new Scanner(System.in);  

        // Input tahun akhir  
        System.out.print("Tahun Akhir : ");  
        int tahunAkhir = scanner.nextInt();  

        // Input tahun awal  
        System.out.print("Tahun Awal : ");  
        int tahunAwal = scanner.nextInt();  

        // Menampilkan tahun dari tahun akhir ke tahun awal  
        System.out.println("Hasilnya:");  
        for (int i = tahunAkhir; i >= tahunAwal; i--) {  
            System.out.println(i);  
        }  

        // Menutup scanner  
        scanner.close();  
    }
}
