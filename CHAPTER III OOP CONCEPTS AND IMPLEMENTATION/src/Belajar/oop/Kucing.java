/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar.oop;

/**
 *
 * @author LENOVO
 */
public class Kucing implements Hewan {

    @Override
    public void suaraHewan() {
        System.out.println("Kucing bersuara: Meong");
    }
    
    @Override
    public void tidur() {
        System.out.println("Zzz");
    }
}
