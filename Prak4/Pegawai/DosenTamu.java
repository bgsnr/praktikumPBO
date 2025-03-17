package Prak4.Pegawai;
import java.time.LocalDate;

class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tglAkhirKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public LocalDate hitungBUP() {
        return tglAkhirKontrak;
    }

    @Override
    public void printInfo() {
        System.out.println("Biodata " + "\n" 
            + "NIP: " + NIP + "\n"
            + "NIDK: " + NIDK + "\n"
            + "Nama: " + nama + "\n"
            + "Tanggal Lahir: " + tglLahir + "\n"
            + "TMT: " + TMT + "\n"
            + "Jabatan: Dosen Tamu" + "\n"
            + "Fakultas: " + fakultas + "\n" 
            + "Tanggal Akhir Kontrak: " + tglAkhirKontrak);
    }
}