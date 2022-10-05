package day13;

import org.junit.Test;

public class ThreadWorldTest {
    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadWorld instanc = new ThreadWorld();
            instanc.setName("" + i);
            instanc.start();
        }
    }
}
