package day12.oop;

abstract class Manusia {
    // deklarasi class dan method tipe abstract
    protected abstract void nyanyiLagu();
}

class Cowok extends Manusia {
    // mengguna method dari class abstract manusia
    @Override
    protected void nyanyiLagu() {
        System.out.println("da du di dam");
    }
}

class Cewek extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("duri duri dam");
    }
}

public class Cetak {
    public static void main(String[] args) {
        // buat object referensi class manusia, dengan cons cowok
        Manusia cowok = new Cowok();
        cowok.nyanyiLagu();

        Manusia cewek = new Cewek();
        cewek.nyanyiLagu();

    }
}
