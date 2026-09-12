import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Werte möchtest du eingeben? ");
        int n = sc.nextInt();

        float summe = 0;
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            float wert = sc.nextFloat();

            summe += wert;

            if (wert < min) {
                min = wert;
            }

            if (wert > max) {
                max = wert;
            }
        }
        float mittelwert = summe / n;

        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Kleinster Wert: " + min);
        System.out.println("Größter Wert: " + max);
    }
}