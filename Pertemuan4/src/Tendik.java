public class Tendik extends Pegawai {

    private String bidang;

    public Tendik(String nip,String nama,String tanggalLahir,
                  String tmt,double gajiPokok,String bidang){

        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan(int masaKerja){
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
    }
}