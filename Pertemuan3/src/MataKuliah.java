/*
Nama File   : MataKuliah.java
Deskripsi   ; Membuat objek Matakuliah
Pembuat     : Syahrafi Ahmad Pradika 24060124140154
Tanggal     ; 02-mar-2026
*/
public class MataKuliah {
// Membuat Attribut Kuliah
    private String idMatKul;
    private String nama;
    private int sks;
        /**Method **/
    // Konstruktor tanpa parameter
    public MataKuliah() {
    }
    //Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() { //Memanggil IDmatkul
        return idMatKul;
    }

    public void setIdMatKul(String idMatKul) { //Mengubah IDMATKUL
        this.idMatKul = idMatKul;
    }

    public String getNama() { //Memanggil Nama matkul
        return nama;
    }

    public void setNama(String nama) { // Mengubah Nama Matkul
        this.nama = nama;
    }

    public int getSks() { // Memanggil SKS Matkul
        return sks;
    }

    public void setSks(int sks) { // Menggubah SKS
        this.sks = sks;
    }
}