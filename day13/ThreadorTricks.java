package day13;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadorTricks implements Runnable {

    private final String name;

    public ThreadorTricks(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + ": Hellow");

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

            Logger.getLogger(ThreadorTricks.class.getName()).log(Level.SEVERE, null, e);
        }

    }

}
