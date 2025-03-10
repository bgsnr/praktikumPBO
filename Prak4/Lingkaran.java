package Prak4;

public class Lingkaran extends BangunDatar {
    private double Sisi;
    
    public Lingkaran(String warna, String border) {
        super(0, warna, border);
    }

    public double getSisi() {
        return Sisi;
    }

    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }
}
