/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar.oop;

/**
 *
 * @author LENOVO
 */
public class SepedaGunung extends Sepeda {
    double diameterRoda;
   
    public SepedaGunung (String merek, String warna, int tahun, double diameter){
        super (merek, warna, tahun);
        this.diameterRoda = diameter;
    }
    
    public void aturDiameterRoda(double diameter){
        this.diameterRoda = diameter;
    }
    
    public void lihatInfoSepeda(){
        System.out.println("=====Informasi Sepeda=====");
        System.out.println("Merek:"+merek);
        System.out.println("Warna:"+warna);
        System.out.println("Tahun:"+tahunRilis);
        System.out.println("Diameter Roda:"+diameterRoda);
        System.out.println("");
    }
}
