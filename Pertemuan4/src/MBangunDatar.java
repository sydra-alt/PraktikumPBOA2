/*
Nama File   : MBangunDatar.java
Deskripsi   : Main BangunDatarnya
Pembuat     : Syahrafi Ahmad Pradika
Tanggal     : 9 maret 2026
*/
public class MBangunDatar {

    public static void main(String[] args) {

        BangunDatar b1 = new BangunDatar(0,"Hitam","Putih");

        System.out.println("Bangun Datar");
        b1.printInfo();

        System.out.println();

        Persegi p1 = new Persegi(4,"Merah","Putih");

        System.out.println("Persegi");
        p1.printInfo();
        System.out.println("Luas : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
        System.out.println("Diagonal : " + p1.getDiagonal());

        System.out.println();

        Lingkaran l1 = new Lingkaran(7,"Biru","Putih");

        System.out.println("Lingkaran");
        l1.printInfo();
        System.out.println("Luas : " + l1.getLuas());
        System.out.println("Keliling : " + l1.getKeliling());
        //javac -d bin src/*.java
        //java -cp bin MbangunDatar
    }
}

