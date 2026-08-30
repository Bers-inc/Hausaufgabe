import java.util.Scanner;

public class Zahlen2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        int a = scanner.nextInt();

        System.out.print("Gib die zweite Zahl ein: ");
        int b = scanner.nextInt();

        int ergebnis = 0;

        for (int i = 0; i < b; i++) {
            ergebnis = ergebnis + a;
        }
        System.out.println("Ergebnis: " + ergebnis);
    }
}
