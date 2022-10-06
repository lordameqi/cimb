package day12.oop;

import java.util.Scanner;
//import java.net.Socket;
import java.text.NumberFormat;
// import java.text.DecimalFormat;
// import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Latihan3 {
    public static void main(String[] args) {
        double pembelian, harga;
        double diskon;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan harga pembelian = ");
        pembelian = in.nextInt();
        while (pembelian != 1000000) {
            System.out.println("Maaf belum Rp. 1.000.000,-");
            System.out.print("Silahkan ulangi = ");
            pembelian = in.nextInt();
        }

        diskon = 10;
        harga = pembelian * ((100 - diskon) / 100);

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println("Rp. " + nf.format(pembelian) + ",-");
        System.out.println("Diskon  = " + (int) diskon + "%");
        System.out.println("Harga Bayar  = Rp. " + nf.format(harga));

    }
}
