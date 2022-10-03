package day11.arraykan;

public class Arraykan {
    public static void main(String[] args) {
        System.out.println("Example 01");
        int[] contoh = new int[4];
        contoh[0] = 1;
        System.out.println(contoh[0]);
        System.out.println(contoh[1]);

        double[] arrayDouble = new double[2];
        arrayDouble[0] = 1.0;
        System.out.println(arrayDouble[0]);
        System.out.println(arrayDouble[1]);

        for (double d : arrayDouble) {
            System.out.println(d);
        }

    }
}
