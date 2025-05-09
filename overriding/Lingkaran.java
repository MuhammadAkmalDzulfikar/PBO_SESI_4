public class Lingkaran extends BangunDatar {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }

    public static void main(String[] args) {
        BangunDatar bd1 = new Persegi(4);
        BangunDatar bd2 = new Lingkaran(7);

        System.out.println("Luas Persegi: " + bd1.hitungLuas());
        System.out.println("Luas Lingkaran: " + bd2.hitungLuas());
    }
}