package day9;

/**
 * cimb
 */
public class cimb {

    public static void main(String[] args) {
        Boolean happy = true;
        boolean sad = false;
        happy.booleanValue();
        if (happy) {
            System.out.println("im happy");
        } else if (sad) {
            System.out.println("im sad");
        }

        int maxDistance = 10;
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("maaf anda tidak mendapat diskon");
        }

        if (distanceToHome <= maxDistance) {
            System.out.println("selamat anda mendapat diskon sebesar 10%");
        }

        int speed = 90;
        int maxSpeed = 100;
        int speedForFine = 110;

        if (speed > maxSpeed) {
            if (speed > speedForFine) {
                System.out.println("kena tilang");
            } else {
                System.out.println("masih dibawah batas tilang tapi kencang");
            }
        } else {
            System.out.println("pelan");
        }

        String a = "Rahmat";
        String b = "RahmaT";

        int hasil = a.compareTo(b);
        System.out.println(hasil);

        if (hasil == 0) {

            // Both are equal
            System.out.println("0");
        } else if (hasil < 0) {

            // obj1 < obj2
            System.out.println("-1");
        } else {

            // obj1 > obj2
            System.out.println("1");
        }
    }
}