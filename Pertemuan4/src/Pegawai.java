public class Pegawai {

    protected String nip;
    protected String nama;
    protected String tanggalLahir;
    protected String tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public void printInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}