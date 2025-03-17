package Prak5;

public class Lingkaran extends BangunDatar {
    private double radius;
    private double Sisi;
    
    public Lingkaran(double radius, String warna, String border) {
        super(0, warna, border);
        this.radius = radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    public double getSisi() {
        return Sisi;
    }

    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }
}
