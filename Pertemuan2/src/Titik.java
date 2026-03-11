/**
 * Nama File  : Titik.java
 * Deskripsi  : Class yang merepresentasikan titik pada bidang Kartesius
 * Pembuat    : Syahrafi Ahmad Pradika
 * Tanggal    : 2026-Feb-23
 */

public class Titik {

    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Konstruktor default (0,0)
    public Titik() {
        this(0, 0);   // constructor chaining
    }

    // Konstruktor dengan parameter (overloading)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // Setter
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Geser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Refleksi terhadap sumbu X (mengubah objek langsung)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Menghasilkan objek baru hasil refleksi sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Print koordinat
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}


