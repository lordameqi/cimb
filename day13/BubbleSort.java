package day13;

import java.util.Scanner;

public class BubbleSort {
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

    public void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
