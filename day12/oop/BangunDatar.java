package day12.oop;

/**
 * BangunDatar
 */
public class BangunDatar {
    float luas() {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }

    float keliling() {
        System.out.println("menghitung keliling bangun datar");
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    Persegi() {
        this.sisi = 0;
    }

    Persegi(float a) {
        this.sisi = a;

    }

    @Override
    float luas() {
        float area = this.sisi * this.sisi;
        System.out.println("Luas Persegi " + area);
        return area;
    }

    @Override
    float keliling() {
        float perimeter = this.sisi * 4;
        System.out.println("keliling persegi " + perimeter);
        return perimeter;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    Lingkaran() {
        this.r = 0;
    }

    Lingkaran(float a) {
        this.r = a;
    }

}

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    PersegiPanjang() {
        this.lebar = 0;
        this.lebar = 0;
    }

    PersegiPanjang(float a, float b) {
        this.lebar = a;
        this.panjang = b;
    }
}

class Segitiga extends BangunDatar {
    float alas, tinggi;

    Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
    }

    Segitiga(float a, float b) {
        this.alas = a;
        this.tinggi = b;
    }
}