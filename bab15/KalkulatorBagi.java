/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab15;

import tugas.bab13.Kalkulator;

/**
 *
 * @author TOSHIBA
 */
public class KalkulatorBagi {
     public static void main(String[] args) {
        kalkulator kalkulator = new kalkulator();
        float hasilPembagian = kalkulator.pembagian(10f, 2f);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
    }
}
