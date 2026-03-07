public class MKendaraan {

    public static void main(String[] args) {

        Kendaraan K1 = new Kendaraan("B0811BB","motor");
        Kendaraan K2 = new Kendaraan("B4511AB","mobil");

        System.out.println("No Plat Kendaraan : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K1.getJenis());

        System.out.println("No Plat Kendaraan : " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K2.getJenis());

    }
}