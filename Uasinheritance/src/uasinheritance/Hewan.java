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
public class Hewan {
    private String nama;   
    private String jumlahkaki;
    private String warnakulit;
    
public Hewan(String nama,String jumlahkaki,String warnakulit){
    this.nama = nama;
    this.jumlahkaki = jumlahkaki;
    this.warnakulit = warnakulit;
}
public void ViewHewan(){
    System.out.println("NAMA HEWAN               : " +nama);
    System.out.println("JUMLAH KAKI                : " +jumlahkaki);
     System.out.println("WARNA                : " +warnakulit);
}
}