public class DosenTetap extends Dosen {

    private String nidn;

    public DosenTetap(String nip,String nidn,String nama,String tanggalLahir,
                      String tmt,double gajiPokok,String fakultas){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan(int masaKerja){
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
    }
}