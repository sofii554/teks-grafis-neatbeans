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
public class soal_1 {
     public static void main(String[] args) {
        // TODO code application logic here
      
        // Membuat objek Scanner untuk membaca input dari pengguna  
        Scanner scanner = new Scanner(System.in);  
            
        System.out.println("###Pendataan Karyawan PT. Petani Kode ### ");
        // Meminta pengguna untuk memasukkan nama  
        System.out.print("Nama Karyawan : ");  
        String nama = scanner.nextLine();  
        
        // Meminta pengguna untuk memasukkan umur  
        System.out.print("Alamat : ");  
        String alamat = scanner.nextLine();  
        System.out.print("Usia : "); 
        int usia = scanner.nextInt();
        System.out.print("Gaji : ");  
        int gaji = scanner.nextInt();

        System.out.println("=============================================");
        // Menampilkan output  
        System.out.println("Nama Karyawan : " + nama);  
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " Tahun");  
        System.out.println("Gaji : " + "Rp " + gaji);  

        
        // Menutup scanner  
        scanner.close();  

    }
}
