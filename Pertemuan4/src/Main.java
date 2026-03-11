/*
Nama File   : MBain.java
Deskripsi   : Main BangunDatarnya
Pembuat     : Syahrafi Ahmad Pradika
Tanggal     : 9 maret 2026
*/
public class Mmain {

    public static void main(String[] args) {

        Persegi p1 = new Persegi(4,"Merah","Hitam");

        System.out.println("PERSEGI ");
        p1.printInfo();
        System.out.println("Luas : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
        System.out.println("Diagonal : " + p1.getDiagonal());

        System.out.println();

        Lingkaran l1 = new Lingkaran(7,"Biru","Putih");

        System.out.println("LINGKARAN ");
        l1.printInfo();
        System.out.println("Luas : " + l1.getLuas());
        System.out.println("Keliling : " + l1.getKeliling());
    }
}