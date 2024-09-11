/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab15;

/**
 *
 * @author TOSHIBA
 */
public class kalkulator {
    public static void main(String[] args) {
        
    }
     // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Method pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan 0");
        }
        return a / b;
    }
    
    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }
}
