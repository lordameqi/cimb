package day11.arraykan;

import java.util.Scanner;

public class Latihan2Contoh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Halo");

        System.out.println("Masukan jumlah array yg anda inginkan = ");
        int jumlahArray = in.nextInt();
        int buatArray[] = new int[jumlahArray];
        int i = 0;
        for (i = 0; i < buatArray.length; i++) {

            System.out.println("Masukkan index" + "[" + i + "] yaitu adalah =");
            buatArray[i] = in.nextInt();

        }
        in.close();
        displayData(buatArray);
        System.out.println("Data max : " + max(buatArray) + " dengan index : " + indexnyaMax(i));
    }

    public static int max(int[] data) {
        int nilaiMax = data[0];
        int indexnyaMax = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] + 1 > nilaiMax) {
                nilaiMax = data[i];
                indexnyaMax = i;
            }
        }
        indexnyaMax(indexnyaMax);
        return nilaiMax;
    }

    public static int indexnyaMax(int a) {
        return a;
    }

    public static void displayData(int[] data) {

        int nilaiMin = data[0];
        int indexnyaMin = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < nilaiMin) {
                nilaiMin = data[i];
                indexnyaMin = i;
            }
        }

        // int nilaiMax = buatArray[0];
        // int indexnyaMax = 0;
        // for (int i = 0; i < buatArray.length; i++) {
        // if (buatArray[i] + 1 > nilaiMax) {
        // nilaiMax = buatArray[i];
        // indexnyaMax = i;
        // }
        // }
        System.out.println("Data min : " + nilaiMin + " dengan index : " + indexnyaMin);
        // System.out.println("Data max : " + nilaiMax + " dengan index : " +
        // indexnyaMax);
        // in.close();
    }

}
