package praktikum7ara;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {

    private String nama = "Ara";
    private String npm = "2157051005";
    private double nilaiTugas = 100;
    private double nilaiUas = 100;
    private double nilaiUts = 100;
    private double NA;

    public void printData(String jurusan) {
        System.out.println("NPM\t:" + this.npm);
        System.out.println("Nama\t:" + this.nama);
        System.out.println("jurusan\t:" + jurusan);
        System.out.println("Nilai TUGAS\t:" + nilaiTugas);
        System.out.println("Nilai UTS\t:" + nilaiUts);
        System.out.println("Nilai UAS\t:" + nilaiUas);
        System.out.println("Nilai Akhir:" + this.NA);
    }

    public int sumValue(int x, int y) {
        return x+y;
    }
    
    public void hitungNA(){
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.NA = (nilaiTugas*0.3) + (nilaiUts*0.35) + (nilaiUas*0.35);
    }
    
    public void hitungNA(String pesan){
        System.out.println("Nilai tidak valid");
    }
    
}
