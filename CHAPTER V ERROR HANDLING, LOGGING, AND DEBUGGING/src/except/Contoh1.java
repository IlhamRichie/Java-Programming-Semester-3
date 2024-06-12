/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package except;

/**
 *
 * @author LENOVO
 */
public class Contoh1 {
    
    public static void main (String[] args) {
        try {
            int divider = 0;
            int a = 10 / divider;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error 001 " + e);
        } finally {
            System.out.println("\u2192 Done!");
        }
    }
    
}
