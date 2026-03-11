
/**
 * Nama File  : MTitik.java
 * Deskripsi  : Main class untuk menguji class Titik
 * Pembuat    : Syahrafi Ahmad Pradika
 * Tanggal    : 2026-Feb-23
 */

public class MTitik {
    public static void main(String[] args) {

        // Overloading Constructor
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 4);

        System.out.println("T1:");
        T1.printTitik();

        System.out.println("T2:");
        T2.printTitik();

        // Static counter
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());

        // Refleksi (fungsi - tidak mengubah objek asli)
        System.out.println("\nHasil getRefleksiX (objek baru):");
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();

        System.out.println("T2 tetap:");
        T2.printTitik();

        // Refleksi (prosedur - mengubah objek asli)
        System.out.println("\nRefleksiX langsung pada T2:");
        T2.refleksiX();
        T2.printTitik();
    }
}


