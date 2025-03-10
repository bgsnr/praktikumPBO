public class Titik {
    double absis;
    double ordinat;
    int counterTitik = 0;

    Titik() {
        absis = 0;
        ordinat = 0;
    }

    Titik(double x, double y) {
        this.absis = x;
        ordinat = y;
        counterTitik++;
    }

    int getAbsis() {
        return (int) absis;
    }

    int getOrdinat() {
        return (int) ordinat;
    }

    void setAbsis(int x) {
        this.absis = x;
    }

    void setOrdinat(int y) {
        this.ordinat = y;
    }

    void printTitik() {
        System.out.println("Absis: " + this.getAbsis() + ", Ordinat: " + this.getOrdinat());
    }

    void geser(int dx, int dy) {
        this.absis += dx;
        this.ordinat += dy;
    }

    void getKuadran() {
        if (absis > 0 && ordinat > 0) {
            System.out.println("Titik berada di kuadran 1");
        } else if (absis < 0 && ordinat > 0) {
            System.out.println("Titik berada di kuadran 2");
        } else if (absis < 0 && ordinat < 0) {
            System.out.println("Titik berada di kuadran 3");
        } else if (absis > 0 && ordinat < 0) {
            System.out.println("Titik berada di kuadran 4");
        } else {
            System.out.println("Titik berada di sumbu");
        }
    }
    
    public static double hitungJarak(Titik t1, Titik t2){
        return Math.abs(t1.getAbsis()-t2.getAbsis());
    }
}
