/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab10;

/**
 *
 * @author TOSHIBA
 */
public class soal_2 {
     public static void main(String[] args) {
        // TODO code application logic here
   aritmatika1 aritmatikaku = new aritmatika1();
   int bilangan1 = 10, bilangan2 = 5;
   
System.out.println("Bilangan 1= " + bilangan1);
System.out.println("Bilangan 2= " + bilangan2);

aritmatikaku.setPengurangan(bilangan1, bilangan2);
System.out.println("Hasil Pengurangan " + aritmatikaku.getAngka());

aritmatikaku.setPerkalian(bilangan1, bilangan2);
System.out.println("Hasil Perkalian " + aritmatikaku.getAngka());

aritmatikaku.setPembagian(bilangan1, bilangan2);
System.out.println("Hasil Pembagian " + aritmatikaku.getAngka());

aritmatikaku.setPangkat(bilangan1, bilangan2);
System.out.println("Hasil Pangkat " + aritmatikaku.getAngka());

 }
}
