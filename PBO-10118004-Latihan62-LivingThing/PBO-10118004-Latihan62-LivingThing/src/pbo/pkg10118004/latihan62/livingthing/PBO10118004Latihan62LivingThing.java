/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118004.latihan62.livingthing;

/**
 *
 * @author 
 *  NAMA  : Dahlia
 * KELAS : IF 1
 * NIM   : 10118004
 * Deskripsi Program : Program ini untuk membuat tampilan override abstract.

 */
public class PBO10118004Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Humas humas = new Humas();
        humas.setNama("Dahlia");
        humas.walk(humas.getNama());
        humas.breath(humas.getNama());
        humas.eat(humas.getNama());
        

    }
    
}
