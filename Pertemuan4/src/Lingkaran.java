/*
Nama File   : Lingkaran.java
Deskripsi   : Subclass untuk Lingkaran
Pembuat     : Syahrafi Ahmad Pradika
Tanggal     : 9 maret 2026
*/

/*
Nama File   : Lingkaran.java
Deskripsi   : Subclass dari BangunDatar
*/

public class Lingkaran extends BangunDatar {

    private double jari;

    public Lingkaran(){
        super();
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // overriding
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}