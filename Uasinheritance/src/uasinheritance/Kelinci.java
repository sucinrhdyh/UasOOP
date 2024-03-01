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
public class Kelinci extends Hewan {
    private int berkembangbiak;

public Kelinci (String nama,String jumlahkaki,String warnakulit,int berkembangbiak){
    super(nama ,jumlahkaki ,warnakulit);
    this.berkembangbiak = berkembangbiak;
}
public void ViewKelinci(){
    System.out.println("BERKEMBANGBIAK DENGAN   : " +berkembangbiak);
    
}
}
