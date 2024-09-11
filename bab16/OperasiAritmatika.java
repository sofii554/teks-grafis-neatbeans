/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab16;

/**
 *
 * @author TOSHIBA
 */
abstract class OperasiAritmatika {
    protected double A;
    protected double B;

    // Konstruktor
    public OperasiAritmatika(double A, double B) {
        this.A = A;
        this.B = B;
    }

    // Method abstrak untuk operasi aritmatika
    protected abstract double penjumlahan();
    protected abstract double pengurangan();
    protected abstract double perkalian();
    protected abstract double pembagian();
}
