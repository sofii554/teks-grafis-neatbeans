/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab13;

/**
 *
 * @author TOSHIBA
 */
public class Segitiga {
    // Kelas untuk menghitung luas segitiga
    private double alas;
    private double tinggi;
    private double luas;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        calculateArea(); // Menghitung luas segitiga pada saat pembuatan objek
    }

    // Method untuk menghitung luas segitiga
    public void calculateArea() {
        this.luas = (alas * tinggi) / 2;
    }

    // Method overloading untuk menghitung luas segitiga dengan parameter tambahan
    public void calculateArea(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = (alas * tinggi) / 2;
    }

    // Method untuk menampilkan luas segitiga
    public void displayArea() {
        System.out.println("Luas segitiga: " + luas);
    }

    // Getter dan Setter untuk atribut
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
        calculateArea(); // Update luas segitiga jika alas diubah
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        calculateArea(); // Update luas segitiga jika tinggi diubah
    }

    public double getLuas() {
        return luas;
    }

    public static void main(String[] args) {
        // Membuat objek segitiga dengan alas dan tinggi tertentu
        Segitiga segitiga1 = new Segitiga(5, 10);
        segitiga1.displayArea(); // Menampilkan luas segitiga

        // Mengubah alas dan tinggi dan menghitung ulang luas
        segitiga1.setAlas(6);
        segitiga1.setTinggi(8);
        segitiga1.displayArea(); // Menampilkan luas segitiga yang baru

        // Menghitung luas segitiga dengan menggunakan method overloading
        Segitiga segitiga2 = new Segitiga(0, 0); // Membuat objek dengan nilai default
        segitiga2.calculateArea(7, 14); // Menghitung luas dengan parameter
        segitiga2.displayArea(); // Menampilkan luas segitiga
    }
}
