package day10;

import java.math.BigDecimal;

public class Monetary {
    public static void main(String[] args) {
        // cara 1
        BigDecimal a = new BigDecimal(2.1);
        BigDecimal b = new BigDecimal(2.2);
        BigDecimal c = a.add(b);
        System.out.println(c);

        // cara2
        BigDecimal a1 = BigDecimal.valueOf(2.1);
        BigDecimal b1 = BigDecimal.valueOf(2.2);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        BigDecimal c2 = BigDecimal.valueOf(1.123456789123456789);
        System.out.println(c2);

        // cara3
        BigDecimal a11 = new BigDecimal("2.1");
        BigDecimal b11 = new BigDecimal("2.2");
        BigDecimal c11 = a11.add(b11);
        System.out.println(c11);
    }
}
