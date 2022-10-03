package day10;

import java.util.Scanner;

public class Lampu {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan lampu");
        lampu = scan.nextLine();

        switch (lampu.toLowerCase()) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Berhenti");
                break;
            case "Hijau":
                System.out.println("Lampu Hijau, Silahkan jalan");
                break;
            default:
                System.out.println("kurangin pasir sedap.");
                break;
        }
        scan.close();
    }
}
