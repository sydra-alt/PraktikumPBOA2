public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();

        t1.printTitik();     // (0,0)

        t1.setAbsis(3);
        t1.setOrdinat(4);
        t1.printTitik();     // (3,4)

        t1.geser(2, 1);
        t1.printTitik();     // (5,5)
    }
}
