package Prak3;

class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKe1i1ing ( ) {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[] args) {
        double jariJari = 0;
        assert (jariJari>0) : "jari jari tidak boleh nol! ! ! ";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKe1i1ing() ;
        System.out.println ("keliling lingkaran = " + kelilingLingkaran) ;
    }
}
