package Prak4.Pegawai;
import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * gajiPokok;
    }

    @Override
    public LocalDate hitungBUP() {
        return tglLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("Tendik: " + nama + ", Bidang: " + bidang);
    }
}