/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar.oop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BuiltlIn {
    public static void main (String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Ketik nama file");
            String namaFile = s.next()+".txt";
            File f = new File(namaFile);
            f.createNewFile();
            System.out.println("File "+namaFile+" telah dibuat");
            System.out.println("Lokasi file: "+f.getAbsolutePath());
        } catch (IOException e) {
        }
    }
}
