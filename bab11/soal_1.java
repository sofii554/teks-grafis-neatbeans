/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab11;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
// Membuat objek karyawan dengan constructor parameter
        Karyawan karyawan1 = new Karyawan("001", "John Doe", "A", "Manager", 8000000.0);
        Karyawan karyawan2 = new Karyawan("002", "Jane Smith", "B", "Staff", 6000000.0);
        
        // Menampilkan informasi karyawan
        System.out.println(" Informasi Karyawan 1: ");
        karyawan1.tampilkanInfo();
        
        System.out.println("\nInformasi Karyawan 2: ");
        karyawan2.tampilkanInfo();
        
}
}
