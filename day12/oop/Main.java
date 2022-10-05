package day12.oop;

import day12.oop.BangunDatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi ka = new Persegi();
        ka.sisi = 2;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 8;
        persegiPanjang.panjang = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        bangunDatar.luas();
        bangunDatar.keliling();

        ka.luas();
        ka.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
}
