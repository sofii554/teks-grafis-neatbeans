/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab16;

/**
 *
 * @author TOSHIBA
 */
public class Penjumlahan extends Operasi {
     public Penjumlahan(double A, double B) {
        super(A, B);
    }

    @Override
    protected double operasi() {
        return A + B;
    }
}

class Pengurangan extends Operasi {
    public Pengurangan(double A, double B) {
        super(A, B);
    }

    @Override
    protected double operasi() {
        return A - B;
    }
}

class Perkalian extends Operasi {
    public Perkalian(double A, double B) {
        super(A, B);
    }

    @Override
    protected double operasi() {
        return A * B;
    }
}

class Pembagian extends Operasi {
    public Pembagian(double A, double B) {
        super(A, B);
    }

    @Override
    protected double operasi() {
        return A / B;
    }
}
