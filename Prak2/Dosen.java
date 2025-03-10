package Prak2;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;


    Dosen() {
        nip = "--";
        nama = "--";
        prodi = "--";
    }

    Dosen(String NIP, String Nama, String Prodi) {
        this.nip = NIP;
        this.nama = Nama;
        this.prodi = Prodi;
    }

    public String getNIP() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNIP(String NIP) {
        this.nip = NIP;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.prodi = Prodi;
    }
}
