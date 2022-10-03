package day11.assignment1_RachmadFadillah;

public class Latihan5b {
    public static void main(String[] args) {
        // hardcode dari 5a
        int y1, y2, X1, X2;
        y1 = 2;
        y2 = 2;
        X1 = (y1 + y2) * (y1 + y2);
        X2 = (y1 % 4) * y2;

        System.out.println("Nilai X1 = " + X1);
        System.out.println("Nilai X2 = " + X2);
        // end of hardcode

        // point b
        System.out.println("X1 besar sama dengan X2 ===> " + (X1 >= X2));
        System.out.println("X2 besar sama dengan X1 ===> " + (X2 >= X1));
        System.out.println("X1 mod 4 == ++X2 mod 5 ===> " + ((X1 % 4) == (++X2 % 5)));
    }
}
