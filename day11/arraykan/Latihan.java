package day11.arraykan;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Halo");

        System.out.println("Masukan jumlah array yg anda inginkan = ");
        int jumlahArray = in.nextInt();
        int buatArray[] = new int[jumlahArray];

        for (int i = 0; i < buatArray.length; i++) {

            System.out.println("Masukkan index" + "[" + i + "] yaitu adalah =");
            buatArray[i] = in.nextInt();

        }
        System.out.println(" ");
        for (int i : buatArray) {
            System.out.println(i);
        }

        int nilaiMin = buatArray[0];
        int indexnyaMin = 0;
        for (int i = 0; i < buatArray.length; i++) {
            if (buatArray[i] < nilaiMin) {
                nilaiMin = buatArray[i];
                indexnyaMin = i;
            }
        }

        int nilaiMax = buatArray[0];
        int indexnyaMax = 0;
        for (int i = 0; i < buatArray.length; i++) {
            if (buatArray[i] + 1 > nilaiMax) {
                nilaiMax = buatArray[i];
                indexnyaMax = i;
            }
        }
        System.out.println("Data min : " + nilaiMin + " dengan index : " + indexnyaMin);
        System.out.println("Data max : " + nilaiMax + " dengan index : " + indexnyaMax);
        in.close();
    }
}
