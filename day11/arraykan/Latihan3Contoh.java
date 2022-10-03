package day11.arraykan;

public class Latihan3Contoh {
    public static void main(String[] args) {
        char[] data01 = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println(data01);

        // char[] data02 = new char[4];
        char[] data02 = { 'i', 'j', 'k', 'l' };
        System.out.println(data02);

        System.arraycopy(data01, 1, data02, 1, 3);
        System.out.println(data02);

    }
}