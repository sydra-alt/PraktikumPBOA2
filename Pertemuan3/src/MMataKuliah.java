public class MMataKuliah {

    public static void main(String[] args) {

        MataKuliah MK1 = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MK2 = new MataKuliah("MBD","Manajemen Basis Data",3);

        System.out.println("ID Mata Kuliah : " + MK1.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + MK1.getNama());
        System.out.println("SKS : " + MK1.getSks());

        System.out.println();

        System.out.println("ID Mata Kuliah : " + MK2.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + MK2.getNama());
        System.out.println("SKS : " + MK2.getSks());

    }
}