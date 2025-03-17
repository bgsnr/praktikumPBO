package Prak4.Pegawai;
import java.time.LocalDate;
import java.time.Period;

abstract class Pegawai {
    protected String NIP, nama;
    protected LocalDate tglLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    public abstract LocalDate hitungBUP();
    public abstract void printInfo();
}