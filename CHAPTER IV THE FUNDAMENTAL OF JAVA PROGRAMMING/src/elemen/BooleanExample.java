/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elemen;

/**
 *
 * @author LENOVO
 */
public class BooleanExample {
    public static void main(String[] args) {
        boolean b;
        b= false;
        System.out.println("b adalah "+b);
        b= true;
        System.out.println("b adalah "+b);
        //Nilai boolean dapat mengendalikan pernyataan if 
        if (b) {
            System.out.println("Pernyataan ini dieksekusi ");
        }
        b= false;
        if (b){
            System.out.println("Pernyataan isi tidak dieksekusi ");
        }
        //hasil dari operator relational
        System.out.println("10 > 7 adalah"+(10>7));
    }
}
