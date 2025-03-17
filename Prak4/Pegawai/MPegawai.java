package Prak4.Pegawai;
import java.time.LocalDate;
// import java.time.Period;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("12345", "Dr. Rahmat", LocalDate.of(1960, 5, 10), LocalDate.of(1990, 8, 15), 7000000, "Teknik", "56789");
        DosenTamu dosenTamu = new DosenTamu("67890", "Dr. Anita", LocalDate.of(1975, 3, 20), LocalDate.of(2005, 2, 1), 5000000, "Ekonomi", "54321", LocalDate.of(2030, 12, 31));
        Tendik tendik = new Tendik("11223", "Budi Santoso", LocalDate.of(1985, 6, 5), LocalDate.of(2010, 7, 1), 4000000, "Kemahasiswaan");

        dosenTetap.printInfo();
        System.out.println("BUP: " + dosenTetap.hitungBUP());
        System.out.println("Tunjangan: " + dosenTetap.hitungTunjangan());

        dosenTamu.printInfo();
        System.out.println("BUP: " + dosenTamu.hitungBUP());
        System.out.println("Tunjangan: " + dosenTamu.hitungTunjangan());

        tendik.printInfo();
        System.out.println("BUP: " + tendik.hitungBUP());
        System.out.println("Tunjangan: " + tendik.hitungTunjangan());
    }
}
