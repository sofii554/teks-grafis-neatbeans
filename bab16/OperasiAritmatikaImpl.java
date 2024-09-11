/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab16;

/**
 *
 * @author TOSHIBA
 */
public class OperasiAritmatikaImpl extends OperasiAritmatika {
    // Konstruktor
    public OperasiAritmatikaImpl(double A, double B) {
        super(A, B);
    }

    // Implementasi method penjumlahan
    @Override
    protected double penjumlahan() {
        return A + B;
    }

    // Implementasi method pengurangan
    @Override
    protected double pengurangan() {
        return A - B;
    }

    // Implementasi method perkalian
    @Override
    protected double perkalian() {
        return A * B;
    }

    // Implementasi method pembagian
    @Override
    protected double pembagian() {
        return A / B;
    }
}
