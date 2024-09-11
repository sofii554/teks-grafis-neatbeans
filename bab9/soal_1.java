/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab9;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
        // TODO code application logic here
       
        // Baris luar  
        int i = 1;  
        while (i <= 5) {  
            // Baris dalam  
            int j = 1;  
            while (j <= i) {  
                System.out.print("* ");  
                j++; // Increment j  
            }  
            System.out.println(); // Pindah ke baris baru  
            i++; // Increment i  
        }  
    }  
}
