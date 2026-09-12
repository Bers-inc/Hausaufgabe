import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int cace;
        int v1;
        int v2;
        int v3;
        String zeichen;
        int punkte = 0;

        for (int i = 0; i < 10; i++) {
            cace = rn.nextInt(3);
            v1 = rn.nextInt(19) + 1;
            v2 = rn.nextInt(19) + 1;

            switch (cace) {
                case 0:
                    zeichen = "+";
                    break;
                case 1:
                    zeichen = "-";
                    break;
                case 2:
                    zeichen = "*";
                    break;
                case 3:
                    zeichen = "/";
                    break;
                default:
                    zeichen = "";
            }
            while (true) {
                System.out.println(v1 + " " + zeichen + " " + v2 + " =");
                v3 = sc.nextInt();
                if (cace == 0 && v1 + v2 == v3) {
                    punkte = punkte + 10;
                    System.out.println("Richtig! Punkte:" + punkte);
                    break;
                } else if (cace == 1 && v1 - v2 == v3) {
                    punkte = punkte + 10;
                    System.out.println("Richtig! Punkte:" + punkte);
                    break;
                } else if (cace == 2 && v1 * v2 == v3) {
                    punkte = punkte + 10;
                    System.out.println("Richtig! Punkte: " + punkte);
                    break;
                } else if (cace == 3 && v1 / v2 == v3) {
                    punkte = punkte + 10;
                    System.out.println("Richtig! Punkte: " + punkte);
                    break;
                } else {
                    punkte = punkte - 10;
                    System.out.println("Falsch, rechne erneut! Punkte:" + punkte);
                }
            }
        }
    }
}