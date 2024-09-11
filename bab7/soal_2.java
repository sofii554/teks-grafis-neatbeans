/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab7;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        String nim = "1111111";
        String nama = "Agustav";
        int tahun = 3;
        char peminatan = 'M'; //Pilihan perminatan : M untuk Pemograman Mobile, J untuk java
                
       // Menampilan input yang di tetapkan
       System.out.println("### Pendataan siswa###");
       System.out.println("NIM : " + nim);
       System.out.println("NAMA : " + nama);
       System.out.println("TAHUN : " + tahun);
       System.out.println("PILIH PEMINATAN : " + peminatan);
       
       // Menentukan output berdasarkan pilihan perminatan
       System.out.println("\nOutput : ");
       switch (peminatan) {
           case 'M':
               System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
               break;
           case 4:
               switch (peminatan) {
           case 'C':
               System.out.println("KOMUNIKASI DATA, MULTIMEDIA");
               break;
           case 'E':
               System.out.println("SISTEM TERDISTRIBUSI, IMAGE PROCESSING");
               break;
           case 'M':
               System.out.println("SIM, SISTEM JARINGAN");
               break;
               }
               break;
          
       }
    }
}
