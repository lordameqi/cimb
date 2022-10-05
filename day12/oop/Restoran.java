package day12.oop;

/**
 * Restoran
 */
public class Restoran {
    // variabel private
    private String menu;
    private double harga;
    private boolean spesial;

    Restoran(boolean huy) {
        this.spesial = huy;
    }

    // getter
    public double getHarga() {
        return harga;
    }

    public String getMenu() {
        return menu;
    }

    public boolean isSpesial() {
        return spesial;
    }

    // setter
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    // public void setSpesial(boolean spesial) {
    // this.spesial = spesial;
    // }
}