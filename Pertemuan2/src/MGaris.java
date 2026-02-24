/**
 * Nama File  : MGaris.java
 * Deskripsi  : Main class untuk menguji class Garis
 * Pembuat    : Syahrafi Ahmad Pradika
 * Tanggal    : 2026
 */

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);

        Garis G1 = new Garis(T1, T2);

        G1.printGaris();

        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();

        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());

        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());
    }
}
