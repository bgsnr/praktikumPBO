package Prak2;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    Mahasiswa() {
        nim = "--";
        nama = "--";
        prodi = "--";
        listMatKul = new ArrayList<MataKuliah>(50);
        dosenWali = new Dosen("--", "--", "--");
        kendaraan = new Kendaraan("--", "--");
    }

    Mahasiswa(String NIM, String Nama, String Prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = NIM;
        this.nama = Nama;
        this.prodi = Prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        listMatKul = new ArrayList<MataKuliah>();
    }

    public String getNIM() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }   

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setNIM(String NIM) {
        this.nim = NIM;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.prodi = Prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah matkul) {
        listMatKul.add(matkul);
    }

    public Integer getJumlahSKS() {
        Integer totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public Integer getJumlahMatkul() {
        return listMatKul.size();
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + this.getNIM() + ", Nama: " + this.getNama() + ", Prodi: " + this.getProdi());
        System.out.println("Dosen Wali: " + this.getDosenWali().getNama());
        System.out.println("Kendaraan: " + this.getKendaraan().getJenis() + ", No Plat: " + this.getKendaraan().getNoPlat());
        System.out.println("Jumlah SKS: " + this.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + this.getJumlahMatkul());
        System.out.println("Mata Kuliah yang diambil: ");
        for (MataKuliah matkul : listMatKul) {
            matkul.printMatkul();
        }
    }
}
