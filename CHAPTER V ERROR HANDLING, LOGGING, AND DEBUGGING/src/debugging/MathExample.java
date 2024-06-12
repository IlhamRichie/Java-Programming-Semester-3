/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debugging;

/**
 *
 * @author LENOVO
 */
public class MathExample {
    public static void main(String[] args) {
        String[] transkrip = {"82","84.5","90","89"};
        double avg = findAverage (transkrip);
        System.out.println("Rata-rata: " +avg);
    }
    
    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Double.valueOf(s);
        }
        return result;
    }
    
}
