/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab10;

/**
 *
 * @author TOSHIBA
 */
public class soal_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        aritmatika3 aritmatikaku= new aritmatika3();
        int a = 10, b = 20;
        
        aritmatikaku.setTambah(a,    b);
        System.out.println("Bilangan 1= " +a);
        System.out.println("Bilangan 2= " +b);
        System.out.println("Hasil Pertambahan " + aritmatikaku.getAngka());
        
        aritmatikaku.setPengurangan(a, b);
        System.out.println("Hasil Pengurangan " + aritmatikaku.getAngka());
        
        aritmatikaku.setPerkalian(a, b);
        System.out.println("Hasil Perkalian " + aritmatikaku.getAngka());
        
        aritmatikaku.setPembagian(a, b); 
       System.out.println("Hasil Pembagian " + aritmatikaku.getAngka());
       
        aritmatikaku.setPangkat(a, b);
        System.out.println("Hasil Pangkat " + aritmatikaku.getAngka());


    }
}
