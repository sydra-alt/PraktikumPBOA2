// Syahrafi Ahamd Pradika
// 24060124140154

public class Anabul {
    protected String nama; // nama panggilan

    public String getNama() { return nama; } // ambil nama
    public void setNama(String nama) { this.nama = nama; } // set nama
}

class Kucing extends Anabul {
    public double bobot; // bobot khusus kucing
}

class Anjing extends Anabul {}
class Burung extends Anabul {}