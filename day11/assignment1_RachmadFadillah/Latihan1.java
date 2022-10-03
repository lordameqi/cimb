package day11.assignment1_RachmadFadillah;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        double Luas, P1;
        int r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Silahkan Masukkan Nilai R = ");
        r = scan.nextInt();
        scan.close();
        P1 = 3.14;

        Luas = P1 * r * r;
        System.out.println("Cetak Luas = " + Luas);
    }
}
