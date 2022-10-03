package day11.arraykan;

public class Array2Dimensi {
    public static void main(String[] args) {
        String[][] framework = {
                { "Java", "Kotlin" },
                { "React", "ReactJS" },
                { "PHP", "Laravel" }
        };
        // System.out.println(framework);
        // cara 1
        for (int i = 0; i < framework.length; i++) {
            for (String data : framework[i]) {
                System.out.print(data + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------");
        // cara2
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(framework[i][j] + " ");
            }
            System.out.println(" ");
        }
        // copy array
        System.arraycopy(framework[0], 0, framework[2], 1, 1);
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(i + "." + j + " " + framework[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
