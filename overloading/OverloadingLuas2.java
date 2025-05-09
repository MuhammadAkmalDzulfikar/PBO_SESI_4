public class OverloadingLuas2 {
    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        OverloadingLuas2 ol = new OverloadingLuas2();
        System.out.println("Luas Persegi Panjang: " + ol.hitungLuas(4.5, 3.0));
    }
}