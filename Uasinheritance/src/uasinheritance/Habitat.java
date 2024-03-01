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
public class Habitat extends Hewan{
    private String makan;
    
public Habitat(String nama,String jumlahkaki,String warnakulit,String makan){
    super(nama, jumlahkaki, warnakulit);
    this.makan = makan;
}  
public void ViewHabitat(){
    System.out.println("MAKANANNYA               : " +makan);  

}
}