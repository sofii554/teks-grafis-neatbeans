/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab18;

/**
 *
 * @author TOSHIBA
 */
public class soal_1a {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Akan menghasilkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception ditangkap: " + e.getMessage());
        }
        System.out.println("Program terus berjalan...");
    }
}
