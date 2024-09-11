/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab17;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah kota
        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();  // Untuk menangani newline setelah nextInt()

        // Membuat array untuk menyimpan nama kota
        String[] kota = new String[jumlahKota];

        // Memasukkan nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + " : ");
            kota[i] = scanner.nextLine();
        }

        // Menampilkan nama kota yang telah dimasukkan
        System.out.println("Kota-kota yang dimasukan:");
        for (String k : kota) {
            System.out.println(k);
        }
    }
}
