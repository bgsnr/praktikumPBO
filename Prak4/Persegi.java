package Prak4;

public class Persegi extends BangunDatar {
    private double Sisi;

    // public Persegi() {
    //     setJmlSisi(4);
    // }

    public Persegi(double Sisi, String warna, String border) {
        super(4, warna, border);
        this.Sisi = Sisi;
    }

    public double getSisi() {
        return Sisi;
    }

    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }
}
