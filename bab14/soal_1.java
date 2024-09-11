/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab14;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
       // Membuat objek dari class Burung
        burung burung = new burung();

        // Memanggil method abstract yang telah diimplementasikan di class Burung
        burung.suara(); // Output: Suara Burung mencicit

        // Memanggil method konkrit dari parent class (AbstrakHewan)
        burung.suara2(); // Output: Ini method konkrit dari parent class
    } 
    }

