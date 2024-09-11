/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab18;

/**
 *
 * @author TOSHIBA
 */
public class soal_1b {
     public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Umur harus 18 atau lebih.");
        } else {
            System.out.println("Selamat datang, Anda sudah cukup umur.");
        }
    }
    
    public static void main(String[] args) {
        try {
            checkAge(16);  // Akan melempar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception ditangkap: " + e.getMessage());
        }
        System.out.println("Program terus berjalan...");
    }
}
