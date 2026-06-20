/*
NIM :24060124140154
Nama:Syahrafi Ahmad Pradika
tgl :02/05/2026
*/

class Datum<G>{
    //kamus
    G value;
    //algoritma
    Datum(G value){
        this.value = value;
    }
    public G getIsi(){
        return value;
    }

    public void setIsi(G value){
        this.value = value;
    }
}
