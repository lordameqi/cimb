package day13;

public class ThreadNumber extends Thread {
    private final NumberGenerator ha;

    public ThreadNumber(NumberGenerator ha) {
        this.ha = ha;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        // // synchronized (ha) {
        // for (int i = 0; i < 3; i++) {
        // System.out.println(getName() + " " + ha.randomNumber());
        // }
        // // }
        synchronized (ha) {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " " + ha.randomNumber());
            }
        }
    }
}
