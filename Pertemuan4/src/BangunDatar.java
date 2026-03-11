/*
Nama File   : BangunDatar.java
Deskripsi   : Superclass untuk bangun datar
Pembuat     : Syahrafi Ahmad Pradika
Tanggal     : 9 maret 2026
*/

public class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar(){
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}