/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab9;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);  
        
        // Input nilai awal  
        System.out.print("Masukan bilangan awal: ");  
        int nilaiAwal = scanner.nextInt();  
        
        // Input nilai akhir  
        System.out.print("Masukan bilangan akhir: ");  
        int nilaiAkhir = scanner.nextInt();  
        
        // Mencetak deret bilangan  
        System.out.print("Hasil deret bilangan: ");  
        
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {  
            System.out.print(i);  
            if (i + 5 <= nilaiAkhir) { // Menambahkan koma kecuali bilangan terakhir  
                System.out.print(", ");  
            }  
        }  
        
        // Menutup scanner  
        scanner.close();  
    }
}
