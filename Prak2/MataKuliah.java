package Prak2;

// import java.util.ArrayList;

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    MataKuliah() {
        idMatkul = "--";
        nama = "--";
        sks = 0;
    }

    MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void printMatkul() {
        System.out.println("ID Mata Kuliah: " + this.getIdMatkul() + ", Nama Mata Kuliah: " + this.getNama() + ", SKS: " + this.getSks());
    }
}