import java.util.Scanner;

public class Zahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine positive ganze Zahl n ein: ");
        int n = scanner.nextInt();

        int summe = 0;

        for (int i = 1; i <= n; i++) {
            summe += i;
        }

        System.out.println("Die Summe der ersten " + n + " Zahlen ist: " + summe);

        System.out.println("Gerade Zahlen kleiner als " + n + ":");

        for (int i = 2; i < n; i += 2) {
            System.out.println(i);


        }
    }
}
