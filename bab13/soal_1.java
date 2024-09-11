/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab13;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        // Penjumlahan
        int hasilTambah = kalkulator.hitung(20, 10);
        System.out.println("Hasil Penjumlahan: " + hasilTambah);

        // Pengurangan
        int hasilKurang = kalkulator.hitung(20, 10, "kurang");
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        // Perkalian
        int hasilKali = kalkulator.hitung(20, 10, true);
        System.out.println("Hasil Perkalian: " + hasilKali);

        // Pembagian
        double hasilBagi = kalkulator.hitung(20.0, 10.0);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}
