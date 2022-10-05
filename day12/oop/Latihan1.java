package day12.oop;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("Menentukan Bilangan Terbesar, Terkecil dan rata-rata");

        int[] arraykan = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arraykan.length; i++) {
            if (i == 0) {
                System.out.print("Masukan Bilangan Pertama (X) = ");
            } else if (i == 1) {
                System.out.print("Masukan Bilangan Kedua (Y) = ");
            } else {
                System.out.print("Masukan Bilangan Ketiga (Z) = ");
            }
            arraykan[i] = in.nextInt();
        }
        System.out.println("Hasil");
        double rataRata = ratarata(arraykan);
        System.out.println("Rata - Ratanya adalah " + rataRata);

        double max = besar(arraykan);
        double min = kecil(arraykan);
        System.out.println(max + " adalah bilangan terbesar");
        System.out.println(min + " adalah bilangan terkecil");
    }

    public static double ratarata(int[] data) {
        double rataRata = 0;
        double hasil = 0;
        for (int i : data) {
            rataRata += i;
            hasil = rataRata / data.length;

        }
        return hasil;
    }

    public static double besar(int[] data) {
        double max = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] + 1 > data[i]) {
                max = data[i];
            }

        }
        return max;
    }

    public static double kecil(int[] data) {

        double nilaiMin = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] + 1 < data[i]) {
                nilaiMin = data[i];
            }
        }
        return nilaiMin;
    }
}
