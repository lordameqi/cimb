package day11.arraykan;

import java.util.Scanner;

public class Halo {
    public static void main(String[] args) {
        int[] intData = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < intData.length; i++) {
            System.out.print("masuk data untuk index " + i + " : ");
            intData[i] = in.nextInt();

        }
        in.close();
        int max = intData[0];
        int indexMax = 0;
        for (int i = 0; i < intData.length; i++) {
            if (intData[i] > max) {
                max = intData[i];
                indexMax = i;
            }

        }
        System.out.println("Data max : " + max + " dengan index : " + indexMax);
    }
}
