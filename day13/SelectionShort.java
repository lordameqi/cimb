package day13;

import java.util.Scanner;

public class SelectionShort {
    public static void main(String[] args) {
        // buat objek scanner
        Scanner in = new Scanner(System.in);

        // input jumlah data
        System.out.print("Masukkan Jumlah Data = ");
        int jlh_data = in.nextInt();
        // input nilai tiap data
        int[] data = new int[jlh_data];// array untuk tiap data
        System.out.println();
        for (int i = 0; i < jlh_data; i++) {
            System.out.print("Input nilai data ke-" + (i + 1) + " : ");
            data[i] = in.nextInt();
        }

        // tampilkan data sebelum di sorting
        System.out.println();
        System.out.print("Data sebelum disorting");
        for (int i = 0; i < jlh_data; i++) {
            System.out.print(data[i] + " ");
        }

        // proses selection short
        System.out.println("\n\nProses selection short");
        for (int i = 0; i < jlh_data - 1; i++) {
            System.out.print("Iterasi ke-" + (i + 1) + " : ");
            for (int j = 0; j < jlh_data; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("   Apakah Data" + data[i] + " sudah benar pada urutannya?");
            boolean tukar = false;
            int index = 0;
            int min = data[i];
            String pesan = "  tidak ada pertukaran";
            for (int y = i + 1; y < jlh_data; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if (tukar == true) {
                // pertukaran data
                pesan = " Data" + data[i] + " ditukar dengan data " + data[index];
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println(pesan + "\n");
        }
        // tampillkan data setelah di sorting
        System.out.print("Data Setelah disorting = ");
        for (int i = 0; i < jlh_data; i++) {
            System.out.print(data[i] + " ");
        }
        in.close();
    }
}
