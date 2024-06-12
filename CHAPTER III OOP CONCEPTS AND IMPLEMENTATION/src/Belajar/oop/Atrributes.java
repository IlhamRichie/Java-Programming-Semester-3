package Belajar.oop;

public class Atrributes {
    
    int nilai = 99;
    String kelas = "A";
    int angkatan = 2019;
    
    private void cetakNilai (){
        System.out.println("Nilai: "+nilai);
    }
    
    private void ubahNilai(int nilaiBaru){
        this.nilai = nilaiBaru;
    }
    
    private int nilaiAkhir(int nilaiBaru){
        this.nilai = nilaiBaru;
        return this.nilai + 5;
    }
    
    public static void main(String[] args) {
        Atrributes obyek = new Atrributes ();
        obyek.ubahNilai (88);
        obyek.cetakNilai();
        int nilaiAkhir = obyek.nilaiAkhir(90);
        System.out.println(nilaiAkhir);
    }
}
