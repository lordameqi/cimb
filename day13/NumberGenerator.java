package day13;

import java.util.Random;

public class NumberGenerator {
    private final int low;
    private final int high;

    public NumberGenerator(int rendah, int tinggi) {
        this.low = rendah;
        this.high = tinggi;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }
}
