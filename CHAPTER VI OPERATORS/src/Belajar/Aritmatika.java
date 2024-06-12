/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar;

/**
 *
 * @author LENOVO
 */
public class Aritmatika {
    
    public static void main(String[] args) {
        double up = +1;
        double um = -0.1;
        double n1 = 1 * up;
        double n2 = n1/2;
        double n3 = n2 + n1;
        double n4 = n3 - n2;
        double n5 = n4 % n3;
        double nilai = n1 - n2 * n3 / n4 % n5 + um;
        
        System.out.println("1 * " + up + "\t\t= "+ n1);
        System.out.println(n1 + " / 2\t\t= "+ n2);
        System.out.println(n2 + " + "+ n1 + "\t= "+ n3);
        System.out.println(n3 + " + "+ n2 + "\t= "+ n4);
        System.out.println(n4 + " + "+ n3 + "\t= "+ n5);
        System.out.println("nilai\t\t= "+ nilai);       
    }
}
