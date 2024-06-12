/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elemen;

import java.util.List;
/**
 *
 * @author LENOVO
 */
public class StronglyTypedLanguage {
    
    String alamat;
    Gaji gaji;
    CurriculumVitae riwayat;
    long gaji_perbulan;
    List<String> list;
    int usia;
    
    private void cetakInfo (CurriculumVitae cv,int usia, long gaji) {
        if (cv instanceof CurriculumVitae) {
        }
    }
    public void infoLengkap(){
        CurriculumVitae theCV = new CurriculumVitae();
        int u = 30;
        long g = 15000000;
        cetakInfo(theCV, u, g);
    }
    
}
