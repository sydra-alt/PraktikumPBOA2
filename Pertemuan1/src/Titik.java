/**
 * File      : Titik.java
 * Deskripsi : Kelas untuk merepresentasikan titik pada bidang Kartesius
 * Pembuat   : Syahrafi Ahmad Pradika
 * Tanggal   : 2026-Feb-19
 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // Konstruktor
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser titik
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Menampilkan koordinat
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}
