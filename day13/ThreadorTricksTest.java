package day13;

import org.junit.Test;

public class ThreadorTricksTest {
    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadorTricks instance = new ThreadorTricks(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
        }
    }
}
