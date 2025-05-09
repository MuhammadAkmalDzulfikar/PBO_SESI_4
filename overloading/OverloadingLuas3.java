public class OverloadingLuas3 {
    public double hitungLuas(double alas, double tinggi, boolean isSegitiga) {
        if (isSegitiga) {
            return 0.5 * alas * tinggi;
        }
        return -1; // tanda error
    }

    public static void main(String[] args) {
        OverloadingLuas3 ol = new OverloadingLuas3();
        System.out.println("Luas Segitiga: " + ol.hitungLuas(6, 4, true));
    }
}