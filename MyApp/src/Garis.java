public class Garis {
    Titik titikAwal;
    Titik titikAkhir;

    Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
    }

    void printGaris() {
        System.out.println("Titik awal: ");
        titikAwal.printTitik();
        System.out.println("Titik akhir: ");
        titikAkhir.printTitik();
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    double hitungPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    void geserGaris(int dx, int dy) {
        titikAwal.geser(dx, dy);
        titikAkhir.geser(dx, dy);
    }

    void getKuadran() {
        System.out.println("Titik awal berada di kuadran: ");
        titikAwal.getKuadran();
        System.out.println("Titik akhir berada di kuadran: ");
        titikAkhir.getKuadran();
    }

    public static double hitungJarak(Garis g1, Garis g2) {
        return Math.abs(g1.hitungPanjang() - g2.hitungPanjang());
    }



}