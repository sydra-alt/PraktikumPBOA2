/*
Nama File   : Dosen.java
Deskripsi   ; Membuat objek dosen
Pembuat     : Syahrafi Ahmad Pradika 24060124140154
Tanggal     ; 02-mar-2026
*/
public class Dosen {
// Membuat Attribut Dosen
   private String nip;
   private String nama;
   private String prodi;


       /****METHOD ****/
//Konstruktor tanpa parameter
   public Dosen() {
   }
//Konstruktor dengan paramater
   public Dosen(String nip, String nama, String prodi) {
       this.nip = nip;
       this.nama = nama;
       this.prodi = prodi;
   }
// Selector (get) dan mutator (set)
   public String getNip() { // Mengambil Nilai Nip Dosen yang dipanggil
       return nip;
   }


   public void setNip(String nip) { // Mengubah Nilai Nip Dosen
       this.nip = nip;
   }


   public String getNama() { // Mengambil Nama Dosen yang dipanggil
       return nama;
   }


   public void setNama(String nama) { // Mengubah Nama dosen
       this.nama = nama;
   }


   public String getProdi() { // Mengambil prodi yang dipanggil
       return prodi;
   }


   public void setProdi(String prodi) { //Mengubah nama prodi
       this.prodi = prodi;
   }
}
