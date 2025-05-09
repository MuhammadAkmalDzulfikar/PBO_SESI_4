public class OverloadingLuas1 {
    public int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        OverloadingLuas1 ol = new OverloadingLuas1();
        System.out.println("Luas Persegi: " + ol.hitungLuas(4));
    }
}