public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(3, 4);
        Garis g1 = new Garis(t1, t2);
        g1.printGaris();
        System.out.println("Panjang garis: " + g1.hitungPanjang());
        g1.geserGaris(1, 1);
        g1.printGaris();
        g1.getKuadran();
        Titik t3 = new Titik(5, 6);
        Titik t4 = new Titik(7, 8);
        Garis g2 = new Garis(t3, t4);
        System.out.println("Jarak antara dua garis: " + Garis.hitungJarak(g1, g2));
    }
}
