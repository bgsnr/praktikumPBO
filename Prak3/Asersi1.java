package Prak3;

public class Asersi1 {
    public static void main(String[] args) {
        int x = -1;
        if (x > 0) {
            System.out.println("X Bilangan Positif");
        }else{
            assert (x < 0) : "Nilai x tidak boleh negatif";
            System.out.println("X Bilangan Negatif");
        }
    }
}
