public class Dosen extends Pegawai {

    protected String fakultas;

    public Dosen(String nip,String nama,String tanggalLahir,
                 String tmt,double gajiPokok,String fakultas){

        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
    }
}