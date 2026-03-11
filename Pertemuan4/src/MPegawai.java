public class MPegawai {

    public static void main(String[] args) {

        // Dosen Tetap
        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                "5 Mei 1990",
                "8 Januari 2015",
                5000000,
                "Fakultas Sains dan Matematika"
        );

        System.out.println("Dosen tetap");
        d1.printInfo();
        System.out.println("Tunjangan : Rp " + d1.hitungTunjangan(10));

        System.out.println();

        DosenTamu d2 = new DosenTamu(
                "12345678",
                "123456",
                "Budi",
                "10 Juni 1985",
                "12 Februari 2022",
                4500000,
                "Fakultas Teknik",
                "12 Februari 2026"
        );

        System.out.println("Dosen tamu");
        d2.printInfo();
        System.out.println("Tunjangan : Rp " + d2.hitungTunjangan());

        System.out.println();

        // Tendik
        Tendik t1 = new Tendik(
                "01234567",
                "Siti",
                "20 Maret 1992",
                "1 Januari 2018",
                3500000,
                "Akademik"
        );

        System.out.println("tendik");
        t1.printInfo();
        System.out.println("Tunjangan : Rp " + t1.hitungTunjangan(7));
        //javac -d bin src/*.java
        //java -cp bin MPegawai
    }
}