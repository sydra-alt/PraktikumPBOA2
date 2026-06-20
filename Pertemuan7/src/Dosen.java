/*
NIM :24060124140154
Nama:Syahrafi Ahmad Pradika
Tgl :21/04/2026

*/


public class Dosen extends Civitasakademika{
    //kamus
    private String NIP;
    //method
    public Dosen(String nama,String NIP){
        super(nama);
        this.NIP = NIP;
    }

    public String getNomor(){
        return NIP;
    }
}