package day10;

public class Foran {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
