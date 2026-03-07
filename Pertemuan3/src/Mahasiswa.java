/*
Nama File   : Mahasiswa.java
Deskripsi   ; Membuat objek Mahasiswa
Pembuat     : Syahrafi Ahmad Pradika 24060124140154
Tanggal     ; 02-mar-2026
*/
public class Mahasiswa {
// Membuat Attribut
    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;

    private Dosen dosenWali;
    private Kendaraan kendaraan;
/**Method **/
    //Konstruktor Tanpa Parameter
    public Mahasiswa() {
    }
    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    // Selector (get) dan mutator(set)
    public void setDosenWali(Dosen dosen) { //MENGUBAH DOSENWALI
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) { //MENGGUBAH KENDARAAN
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk) { //MENAMBAHKAN MATUKUL BARU
        listMatKul[jumlahMatKul] = mk;
        jumlahMatKul++;
    }

    public int getJumlahMatKul() { //Memanggil jumlah matkulnya
        return jumlahMatKul;
    }

    public int getJumlahSKS() {  // memanggil jumlah sks matkul

        int total = 0;

        for(int i=0;i<jumlahMatKul;i++){
            total += listMatKul[i].getSks();
        }

        return total;
    }

    public void printDetailMhs(){ //print hasil

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);

        System.out.println("\nDosen Wali:");
        System.out.println(dosenWali.getNama());

        System.out.println("\nMata Kuliah:");

        for(int i=0;i<jumlahMatKul;i++){
            System.out.println(listMatKul[i].getNama());
        }

        if(kendaraan != null){
            System.out.println("\nKendaraan:");
            System.out.println(kendaraan.getNoPlat());
        }

    }
}