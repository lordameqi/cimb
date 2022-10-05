package day13;

import java.util.Scanner;

public class QuickShort {
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data = ");
        int inputan = in.nextInt();
        int data[] = new int[inputan];
        int minRand = 0;
        int maxRand = inputan;
        for (int i = 0; i < inputan; i++) {
            // System.out.print("Masukan Data = ");
            // data[i] = in.nextInt();
            data[i] = (int) Math.floor(Math.random() * (maxRand - minRand + 1) + minRand);
        }
        in.close();
        long start = System.nanoTime();
        ob.bubbleSort(data);
        long finish = System.nanoTime();
        long elapsedTime = (finish - start) / 1000000000;
        System.out.println("Sorted array");
        ob.printArray(data);
        System.out.print("time runing = " + elapsedTime);
    }
}
