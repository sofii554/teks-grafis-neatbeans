/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bab18;

/**
 *
 * @author TOSHIBA
 */
public class soal_2finally {
     public static void main(String args[]){
        try{
            // Kode di bawah ini tidak menghasilkan exception
            Float data = 500f / 15f; 
            System.out.println(data);
        } 
        catch(NullPointerException e){ 
            System.out.println(e); 
        } 
        finally { 
            System.out.println("blok finally akan selalu di eksekusi"); 
        }
    }
}
