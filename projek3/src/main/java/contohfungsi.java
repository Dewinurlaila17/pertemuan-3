/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab pc 2
 */
public class contohfungsi {
    int alas = 10, tinggi = 12;
    
    int hitungluasJajargenjang(){
        int luas = alas * tinggi;
        System.out.println("Alas= "+alas);
        System.out.println("Tinggi= "+tinggi);
        return luas;
    }
    
   public static void main(String[]args){
       contohfungsi F = new contohfungsi();
       System.out.println("Luas Jajargenjang = "+ F.hitungluasJajargenjang());
   }
   
}
