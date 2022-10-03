package day10;

import java.util.Scanner;

/**
 * Operator
 */
public class Operator {
    public static void main(String[] args) {
        // int angka1;
        // int angka2;
        // int hasil;

        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Input Angka 1 ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input Angka 2");
        // angka2 = keyboard.nextInt();

        // // penjumlahan
        // System.out.println("Penjumlahan");
        // hasil = angka1 + angka2;
        // System.out.println("Hasilnya adalah " + hasil);

        // // pengurangan
        // System.out.println("Pengurangan");
        // hasil = angka1 - angka2;
        // System.out.println("Hasilnya adalah " + hasil);

        // // perkalian
        // System.out.println("Perkalian");
        // hasil = angka1 * angka2;
        // System.out.println("Hasilnya adalah " + hasil);

        // // pembagian
        // System.out.println("Pembagian");
        // hasil = angka1 / angka2;
        // System.out.println("Hasilnya adalah " + hasil);

        // // sisa bagi
        // System.out.println("Sisa Bagi");
        // hasil = angka1 % angka2;
        // System.out.println("Hasilnya adalah " + hasil);
        // keyboard.close();

        // int a, b;
        // // pengisian nilai
        // a = 5;
        // b = 10;

        // // penambahan
        // b += a;
        // System.out.println("Penambahan " + b);

        // // pengurangan
        // b -= a;
        // System.out.println("Pengurangan " + b);

        // // perkalian
        // b *= a;
        // System.out.println("Perkalian " + b);

        // // pembagian
        // b /= a;
        // System.out.println("Pembagian " + b);

        // // sisa bagi
        // b %= a;
        // System.out.println("Sisa Bagi " + b);
        // int belanja = 0;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("total belanjaan: Rp ");
        // belanja = scan.nextInt();

        // if (belanja > 100000) {
        // System.out.println("Selamat anda mendapat hadiah");
        // }

        // System.out.println("Terimakasih1");

        // int nilai;
        // String nama;
        Scanner scan = new Scanner(System.in);

        // // mengambil input
        // System.out.println("Nama");
        // nama = scan.nextLine();
        // System.out.println("Nilai");
        // nilai = scan.nextInt();

        // scan.close();
        // if (nilai >= 70) {
        // System.out.println("Selamat " + nama + ", anda lulus");
        // } else {
        // System.out.println("Maaf " + nama + ", anda belum lulus ");
        // }
        // boolean suka = true;
        // String jawaban;
        // jawaban = suka ? "iya" : "tidak";

        // System.out.println(jawaban);

        int biayaAdmin = 2000;
        double bunga = 0.02;
        double cetak;
        System.out.println("Input Saldo");
        int saldo = scan.nextInt();

        if (saldo >= 10000) {
            cetak = saldo + bunga;
            System.out.println("Hasilnya = " + cetak);
        } else if (saldo < 2000) {
            cetak = saldo;
            System.out.println("Saldo " + (int) cetak);
        } else {
            cetak = saldo - biayaAdmin;
            System.out.println("Hasilnya adalah = " + (int) cetak);
        }
        scan.close();

    }
}