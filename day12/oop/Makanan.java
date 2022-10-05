package day12.oop;

public class Makanan {
    public static void main(String[] args) {
        Restoran restoran = new Restoran(true);

        // membuat data pada variabel
        restoran.setHarga(17000);
        restoran.setMenu("ayam pop");
        // restoran.setSpesial(true);

        System.out.println("Harga makanan = " + restoran.getHarga());
        System.out.println("Nama Makanan = " + restoran.getMenu());
        System.out.println("Spesialkah ? = " + restoran.isSpesial());
    }
}
