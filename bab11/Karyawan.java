/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab11;

/**
 *
 * @author TOSHIBA
 */
public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;
    
   // Constructor dengan parameter 
   public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok){
   this.idKaryawan = idKaryawan;
   this.namaKaryawan = namaKaryawan;
   this.golongan = golongan;
   this.jabatan = jabatan;
   this.gajiPokok = gajiPokok;
   }
   
// Metode untuk menampilkan informasi karyawan 
   public void tampilkanInfo() {
       System.out.println(" ID Karyawan: " + idKaryawan);
       System.out.println(" Nama Karyawan: " + namaKaryawan);
       System.out.println(" Golongan: " + golongan);
       System.out.println(" Jabatan: " + jabatan);
       System.out.println(" Gaji Pokok: " + gajiPokok);
       
   }
}
