/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab6;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        

  
        // Membuat objek Scanner untuk mengambil input dari user  
        Scanner scanner = new Scanner(System.in);  

        // Mengambil input NIM  
        System.out.print("NIM  : ");  
        String nim = scanner.nextLine();  

        // Mengambil input NAMA  
        System.out.print("NAMA  : ");  
        String nama = scanner.nextLine();  

        // Mengambil input NILAI  
        System.out.print("NILAI  : ");  
        int nilai = scanner.nextInt();  

        // Menentukan Grade dari nilai  
        String grade;  
        if (nilai >= 85 && nilai <= 100) {  
            grade = "A";  
        } else if (nilai >= 75) {  
            grade = "B";  
        } else if (nilai >= 60) {  
            grade = "C";  
        } else if (nilai >= 50) {  
            grade = "D";  
        } else if (nilai >= 0) {  
            grade = "E";  
        } else {  
            grade = "Nilai tidak valid";  
        }  

        // Menampilkan output  
        System.out.println("=================================");  
        System.out.println("NIM    : " + nim);  
        System.out.println("NAMA   : " + nama);  
        System.out.println("NILAI  : " + nilai);  
        System.out.println("GRADE  : " + grade);  
        System.out.println("=================================");  
        
        // Menutup scanner  
        scanner.close();  
  
    }
}
