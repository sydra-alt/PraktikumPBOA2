/*
Nama File   : Persegi.java
Deskripsi   : Subclass untuk Persegi
Pembuat     : Syahrafi Ahmad Pradika
Tanggal     : 9 maret 2026
*/
public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(){
        super();
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border); // keyword super
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * sisi;
    }

    // overriding method
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
}