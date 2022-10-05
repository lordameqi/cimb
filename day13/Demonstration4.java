package day13;

public class Demonstration4 {
    public static void main(String[] args) {
        Thread4A thread4a = new Thread4A();
        Thread4B thread4b = new Thread4B();
        Thread4C thread4c = new Thread4C();

        thread4a.start();
        thread4b.start();
        thread4c.start();

        System.out.println("Is Thread4A interupted now? " + thread4a.isInterrupted());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Exit-Main");
    }
}

class Thread4A extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread4A prints -> " + i);
            if (i == 2) {
                System.out.println("Going to interrupt the thread");
                interrupt();
                System.out.println("Is thread4a interupted?" + Thread4A.interrupted());
            }
        }
        System.out.println("Exit thread");
    }
}

class Thread4B extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread4B Prints -> " + i);
            if (i == 3) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Exit thread4B");
    }
}

class Thread4C extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread4C Prints -> " + i);
            if (i == 4) {
                Thread.yield();
            }
        }
        System.out.println("Exit Thread4C");
    }

}