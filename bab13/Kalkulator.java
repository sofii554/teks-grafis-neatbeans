/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab13;

/**
 *
 * @author TOSHIBA
 */
public class Kalkulator {
    // Method penjumlahan
    public int hitung(int a, int b) {
        return a + b;
    }

    // Method pengurangan
    public int hitung(int a, int b, String operasi) {
        if (operasi.equalsIgnoreCase("kurang")) {
            return a - b;
        }
        return 0;
    }

    // Method perkalian
    public int hitung(int a, int b, boolean isMultiply) {
        if (isMultiply) {
            return a * b;
        }
        return 0;
    }

    // Method pembagian
    public double hitung(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagi tidak boleh 0");
            return 0;
        }
    }
}
