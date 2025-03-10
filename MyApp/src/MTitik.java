public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(22);
        T1.setOrdinat(3);

        System.out.println("Absis T1:" + T1.getAbsis());
        System.out.println("Ordinat T1:" + T1.getOrdinat());
        T1.printTitik();

        Titik T2 = T1;
        T2.setAbsis(4);
        T2.setOrdinat(4);
        T1.printTitik();

        System.out.println("Absis T2:" + T2.getAbsis());
        System.out.println("Ordinat T2:" + T2.getOrdinat());

        Titik T3 = new Titik(5, 6);
        
        // System.out.println("Jarak antara T1 dan T3: " + Titik.hitungJarak(T1, T3));
        // System.out.println("Jarak antara T2 dan T3: " + Titik.hitungJarak(T2, T3));
        // System.out.println("Jarak antara T1 dan T2: " + Titik.hitungJarak(T1, T2));

        double sisiA = Titik.hitungJarak(T1, T2);
        double sisiB = Titik.hitungJarak(T2, T3);
        double sisiC = Titik.hitungJarak(T1, T3);

        double keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling segitiga: " + keliling);
    }
}
