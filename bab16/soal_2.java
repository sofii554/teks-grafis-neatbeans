/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab16;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
    public static void main(String[] args) {
        Operasi penjumlahan = new Penjumlahan(9.5, 2.5);
        Operasi pengurangan = new Pengurangan(9.5, 2.5);
        Operasi perkalian = new Perkalian(9.5, 2.5);
        Operasi pembagian = new Pembagian(9.5, 2.5);
        
        System.out.println("Penjumlahan: " + penjumlahan.operasi());
        System.out.println("Pengurangan: " + pengurangan.operasi());
        System.out.println("Perkalian: " + perkalian.operasi());
        System.out.println("Pembagian: " + pembagian.operasi());
    }
}
