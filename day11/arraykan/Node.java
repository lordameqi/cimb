package day11.arraykan;

import java.util.Scanner;

public class Node {
    Node left, right;
    int value;

    public static void main(String[] args) {
        Tree tr = new Tree();
        Node root = new Node();
        int menu = 1;
        int r = 1;
        int a;
        while (menu != 3) {
            System.out.print("1.Input\n2.View\n3.Exit\n :");
            menu = Tree.in.nextInt();
            if (menu == 1) {
                System.out.print("Masukan Angka: ");
                a = Tree.in.nextInt();
                if (r == 1) {
                    root.input(a);
                    r--;
                } else {
                    tr.insert(root, a);
                }
            } else if (menu == 2) {
                tr.view(root);
            } else if (menu == 3) {
                System.out.println("Keluar");
            } else {
                System.out.println("Salah");
            }
        }
    }

    public void input(int a) {
        value = a;
    }
}

class Tree {
    static Scanner in = new Scanner(System.in);

    public void insert(Node a, int b) {
        if (b < a.value) {
            if (a.left != null) {
                insert(a.left, b);
            } else {
                a.left = new Node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null) {
                insert(a.right, b);
            } else {
                a.right = new Node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void view(Node a) {
        System.out.print("Pre Order:");
        preOrder(a);
        System.out.println(" ");

        System.out.print("in Order:");
        inOrder(a);
        System.out.println(" ");

        System.out.print("post Order:");
        PostOrder(a);
    }

    public void preOrder(Node a) {
        if (a != null) {
            System.out.print(a.value + " ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }

    public void inOrder(Node a) {
        if (a != null) {
            preOrder(a.left);
            System.out.print(a.value + " ");

            preOrder(a.right);
        }
    }

    public void PostOrder(Node a) {
        if (a != null) {
            preOrder(a.left);
            preOrder(a.right);
            System.out.print(a.value + " ");

        }
    }
}
