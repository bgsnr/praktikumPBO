package Prak4.Pegawai;
import java.time.LocalDate;
// import java.time.Period;

class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * gajiPokok;
    }

    @Override
    public LocalDate hitungBUP() {
        return tglLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("Dosen Tetap: " + nama + ", NIDN: " + NIDN + ", Fakultas: " + fakultas);
    }
}
