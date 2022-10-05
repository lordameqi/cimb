package day12.oop;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Java Tentang Penjualan Barang");
        System.out.print("Masukan Jumlah Beli : ");
        int jumlahBeli = in.nextInt();
        int kodeBarang, qty;
        String barang[] = new String[jumlahBeli];
        int harga[] = new int[jumlahBeli];
        double diskon[] = new double[jumlahBeli];
        int qtyA[] = new int[jumlahBeli];
        double subTotal[] = new double[jumlahBeli];
        for (int i = 0; i < jumlahBeli; i++) {
            System.out.print("Masukan Kode Barang ke-" + (i + 1) + " : ");
            kodeBarang = in.nextInt();
            System.out.print("Masukkan qty ke-" + (i + 1) + " : ");
            qty = in.nextInt();
            if (kodeBarang == 1) {
                barang[i] = "Mouse Bluetooth 5.0";
                harga[i] = 149999;
                diskon[i] = 10;
                qtyA[i] = qty;
                subTotal[i] = (qtyA[i] * harga[i]) * ((100 - diskon[i]) / 100);
            } else if (kodeBarang == 2) {
                barang[i] = "Headphone Eksternal    ";
                harga[i] = 246000;
                diskon[i] = 5;
                qtyA[i] = qty;
                subTotal[i] = (qtyA[i] * harga[i]) * ((100 - diskon[i]) / 100);
            } else if (kodeBarang == 3) {
                barang[i] = "Power Bank 10.000 mAh  ";
                harga[i] = 136000;
                diskon[i] = 0;
                qtyA[i] = qty;
                subTotal[i] = (qtyA[i] * harga[i]) * ((100 - diskon[i]) / 100);
            } else if (kodeBarang == 4) {
                barang[i] = "Tripod Kamera          ";
                harga[i] = 267999;
                diskon[i] = 20;
                qtyA[i] = qty;
                subTotal[i] = (qtyA[i] * harga[i]) * ((100 - diskon[i]) / 100);
            } else if (kodeBarang == 5) {
                barang[i] = "Smart Watch Xiomi      ";
                harga[i] = 899000;
                diskon[i] = 10;
                qtyA[i] = qty;
                subTotal[i] = (qtyA[i] * harga[i]) * ((100 - diskon[i]) / 100);
            } else {
                System.out.println("Kode barang tidak tersedia");
            }
        }
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println(
                "No  Barang                                  Harga            QTY     Diskon      Sub Total");
        for (int i = 0; i < barang.length; i++) {
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            kursIndonesia.setDecimalFormatSymbols(formatRp);

            System.out.println(
                    (i + 1) + "   " + barang[i] + "                 Rp. " + nf.format(harga[i]) + ",00    " + qtyA[i]
                            + "      " + diskon[i] + "%     " + "  " + kursIndonesia.format(subTotal[i]));
        }
    }
}
