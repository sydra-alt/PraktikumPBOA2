/*
Nama File   : Kendaraan.java
Deskripsi   ; Membuat objek Kendaraan
Pembuat     : Syahrafi Ahmad Pradika 24060124140154
Tanggal     ; 02-mar-2026
*/
public class Kendaraan {
// Membuat Attribut Kendaraan
    private String noPlat;
    private String jenis;
            /**METHOD **/
    // Konstruktor Tanpa Parameter
    public Kendaraan() {
    }
    //Konstruktor Dengan Parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
/**Selector (get) dan Mutator (Set) **/
    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getjenis() {
        return jenis;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

}