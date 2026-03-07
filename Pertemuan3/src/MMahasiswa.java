/*
Nama File   : MMahasiswa.java
Deskripsi   ; Memanggil Semua fungsi
Pembuat     : Syahrafi Ahmad Pradika 24060124140154
Tanggal     ; 02-mar-2026
*/
public class MMahasiswa {

    public static void main(String[] args) {

        MataKuliah PBO = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);

        Mahasiswa M1 = new Mahasiswa("154","Syahrafi","Informatika");

        Dosen D1 = new Dosen("001","Bu Khadijah","Informatika");

        Kendaraan K1 = new Kendaraan("B0811BB","motor");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        M1.printDetailMhs();

        System.out.println("Jumlah MatKul : " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + M1.getJumlahSKS());

    }
}

/* 
CMD untuk Run Java
javac -d bin src/Mahasiswa.java src/MMahasiswa.java
java -cp bin MMahasiswa  
*/