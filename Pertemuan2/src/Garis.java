/**
 * Nama File  : Garis.java
 * Deskripsi  : Class yang merepresentasikan garis pada bidang Kartesius
 * Pembuat    : Syahrafi Ahmad Pradika
 * Tanggal    : 2026
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor default (0,0) ke (1,1)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik tAwal, Titik tAkhir) {
        this.titikAwal = tAwal;
        this.titikAkhir = tAkhir;
        counterGaris++;
    }

    // Getter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Setter
    public void setTitikAwal(Titik t) {
        this.titikAwal = t;
    }

    public void setTitikAkhir(Titik t) {
        this.titikAkhir = t;
    }

    // Panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // Cek sejajar
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Cek tegak lurus
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Tampilkan garis
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Persamaan garis y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
