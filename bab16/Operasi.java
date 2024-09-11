/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab16;

/**
 *
 * @author TOSHIBA
 */
public class Operasi {
      protected double A;
    protected double B;

    // Konstruktor
    public Operasi(double A, double B) {
        this.A = A;
        this.B = B;
    }

    // Method dasar untuk penjumlahan
    protected double operasi() {
        return 0; // Ini akan di override oleh subclass
    }
}
