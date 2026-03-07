public class MDosen {

    public static void main(String[] args) {

        Dosen K1 = new Dosen("001","Eddy","Informatika");
        Dosen K2 = new Dosen("002","Satrio","Management Basis Data");

        System.out.println("Nip Dosen : " + K1.getNip());
        System.out.println("Nama Dosen : " + K1.getNama());
        System.out.println("Prodi : " + K1.getProdi());

        System.out.println("Nip Dosen : " + K2.getNip());
        System.out.println("Nama Dosen : " + K2.getNama());
        System.out.println("Prodi : " + K2.getProdi());
    }
}