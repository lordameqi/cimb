package day13;

import org.junit.Test;

public class ThreadNumberTest {
    @Test
    public void testRun() {
        NumberGenerator gen = new NumberGenerator(1000, 2000);
        for (int i = 0; i < 3; i++) {
            ThreadNumber tn = new ThreadNumber(gen);
            tn.setName("thread saya ke " + i);
            tn.start();
        }
    }
}
