package day12.oop;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        String[][] kelas = new String[2][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j < kelas[i].length; j++) {
                System.out.print("Siapa yang akan duduk di kelas (" + i + "," + j + ") :");
                kelas[i][j] = in.nextLine();
            }
        }
        in.close();
        // elements
        System.out.println("===========================================================");
        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j < kelas[i].length; j++) {
                // System.out.printf("|" + kelas[i][j] + "|" + "\t");
                System.out.printf("|%10s|\t\t", kelas[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("===========================================================");

    }
}
