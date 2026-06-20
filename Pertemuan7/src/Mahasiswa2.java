/*
NIM :24060124140154
Nama:Syahrafi Ahmad Pradika
Tgl :21/04/2026

*/


public class Mahasiswa2 extends Civitasakademika{
    //kamus
    private String NIM;
    private Dosen dosenwali;
    //method
    public Mahasiswa2(String nama,String NIM,Dosen Dosenwali){
        super(nama);
        this.NIM = NIM;
        dosenwali = Dosenwali;
    }

    public String getNomor(){
        return NIM;
    }
    public Dosen getDosenWali(){
        return dosenwali;
    }
    public void setWali(Dosen wali){
        dosenwali = wali;
    }
    public void tampilDataMahasiswa2(){
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Dosen: " + dosenwali.getNama());
    }
}