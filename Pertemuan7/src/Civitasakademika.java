/*
NIM :24060124140154
Nama:Syahrafi Ahmad Pradika
Tgl :21/04/2026

*/

abstract class Civitasakademika{
    //kamus
    private String Nama;
    //method
    public Civitasakademika(String nama){
        this.Nama = nama;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public String getNama(){
        return Nama;
    }
    abstract String getNomor();
}