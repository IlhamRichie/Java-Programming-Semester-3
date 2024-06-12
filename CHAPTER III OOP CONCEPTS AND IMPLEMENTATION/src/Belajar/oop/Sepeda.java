/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar.oop;

/**
 *
 * @author LENOVO
 */
public class Sepeda {
    String merek, warna;
    int tahunRilis;
    
    public Sepeda (String merek, String warna, int tahunRilis) {
        this.merek = merek;
        this.warna = warna;
        this.tahunRilis = tahunRilis;
    }
    
    public void aturWarna(String warna){
        this.warna = warna;
    }
    
    public void aturTahunRilis(int tahun){
        this.tahunRilis = tahun;
    }
    
    public void aturMerek(String merek){
        this.merek = merek;
    }
}
