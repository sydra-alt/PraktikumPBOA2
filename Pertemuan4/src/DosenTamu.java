public class DosenTamu extends Dosen {

    private String nidk;
    private String tanggalAkhirKontrak;

    public DosenTamu(String nip,String nidk,String nama,String tanggalLahir,
                     String tmt,double gajiPokok,String fakultas,String tanggalAkhirKontrak){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Akhir Kontrak : " + tanggalAkhirKontrak);
    }
}