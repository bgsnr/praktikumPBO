package Prak4.Pegawai;
import java.time.LocalDate;
// import java.time.Period;

class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {}
    
    @Override
    public LocalDate hitungBUP() { return null; }
}
