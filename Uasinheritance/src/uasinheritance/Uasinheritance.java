/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasinheritance;

/**
 *
 * @author User
 */
public class Uasinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kelinci kelinci = new Kelinci("KUCING","DUA","PUTIH",3);
        Habitat habitat = new Habitat ("KELINCI","DUA","ABU","TUMBUHAN");
        
    
   kelinci.ViewHewan();
    kelinci.ViewKelinci();
    
    habitat.ViewHewan();
    habitat.ViewHabitat();
    }
    
}