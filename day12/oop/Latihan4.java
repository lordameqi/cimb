package day12.oop;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tahun = ");
        int inputan = in.nextInt();

        if (inputan % 400 == 0) {
            System.out.println(inputan + " adalah tahun kabisat");
        } else if (inputan % 100 == 0) {
            System.out.println(inputan + " bukan tahun kabisat");
        } else if (inputan % 4 == 0) {
            System.out.println(inputan + " adalah tahun kabisat");
        } else {
            System.out.println(inputan + " bukan tahun kabisat");
        }
    }
}
