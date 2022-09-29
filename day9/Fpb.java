package day9;

public class Fpb {
    public static void main(String[] args) {
        int nilai1 = 18;
        int nilai2 = 30;

        double hasil = fpb(nilai1, nilai2);
        System.out.println(hasil);
    }

    public static int fpb(int x, int y) {
        return (y == 0) ? x : fpb(y, x % y);
    }
}
