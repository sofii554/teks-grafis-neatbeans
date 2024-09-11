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
public class soal_1 {
    public static void main(String[] args) {
        // TODO code application logic here 

        Scanner scanner = new Scanner(System.in);  

        // Input nilai awal  
        System.out.print("Nilai Awal : ");  
        int nilaiAwal = scanner.nextInt();  

        // Input nilai akhir  
        System.out.print("Nilai Akhir : ");  
        int nilaiAkhir = scanner.nextInt();  

        // Menampilkan bilangan dengan pertambahan 5  
        System.out.println("Hasilnya :");  
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {  
            System.out.println(i);  
        }  

        // Menutup scanner  
        scanner.close();  
    }  
}
