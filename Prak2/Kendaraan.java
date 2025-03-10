package Prak2;

public class Kendaraan {
    private String noPlat;
    private String jenis;

    Kendaraan(){
        noPlat = "--";
        jenis = "Mobil";
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
        if (jenis == null) {
            this.jenis = "Mobil";
        }else if (jenis == "Motor" || jenis == "motor") {
            this.jenis = "Motor";
        } else {
            System.out.println("Error, pilihan hanya Motor atau Mobil");
        }
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
