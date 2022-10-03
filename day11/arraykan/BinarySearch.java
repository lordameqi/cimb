package day11.arraykan;

import java.util.Scanner;

class node {
    int value;
    node left, right;

    public void input(int a) {
        value = a;
    }
}

class tree {
public void insert(node a,int b,){
if(b< a.value){
if(a != null){
insert(a.left, b);
}else{
    a.left = new node();
    a.left.input(b);
    System.out.println("Nilai "+b+" dikiri"+a.value);

}
}else if(b > a.value)
}

    public void view(node a) {

    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 1;
        int a;
        while (menu != 3) {
            System.out.println(" 1. input");
            System.out.println(" 2. view");
            System.out.println(" 3. keluar");

            System.out.println("Masukan Pilihan anda");
            int Pilihan = in.nextInt();

            if (menu == 1) {
                System.out.println("Masukan nilai :");
                a = in.nextInt();
            } else if (menu == 2) {

            } else if (menu == 3) {
                System.out.println("Keluar");
            } else {
                System.out.println("Pilihan salah");
            }
        }

        in.close();
    }
}
