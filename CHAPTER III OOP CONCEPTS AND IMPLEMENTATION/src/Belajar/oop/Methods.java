/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar.oop;

/**
 *
 * @author LENOVO
 */
public class Methods {
    private int uts, uas, tugas;
    private String[] dataNilai;
    
    public void setNilai(int uts){
        this.uts = uts;
    }
    
    public void setNilai(int uts, int uas){
        this.uts = uts;
        this.uas = uas;
    }
    
    public void setNilai(int uts, int uas, int tugas) {
       this.uts = uts;
       this.uas = uas; 
       this.tugas = tugas;
    }
    
    public void setNilai(String[] dataNilai) {
        this.dataNilai = dataNilai;
    }
}
