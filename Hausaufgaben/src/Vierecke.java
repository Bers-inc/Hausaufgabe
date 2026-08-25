import java.util.Scanner;

public class Vierecke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anzahl der Ecken:");
        int ecken = sc.nextInt();

        if (ecken != 4) {
            System.out.println("Das ist kein Viereck.");
            return;
        }

        System.out.println("Gib die 4 Seitenlängen ein:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println("Gib die 4 Winkel ein:");

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();

        boolean alleRechtenWinkel =
                A == 90 && B == 90 && C == 90 && D == 90;

        boolean alleSeitenGleich =
                a == b && b == c && c == d;

        boolean gegenueberliegendeSeitenGleich =
                a == c && b == d;

        if (alleSeitenGleich && alleRechtenWinkel) {
            System.out.println("Das Viereck ist ein Quadrat.");
        }

        else if (alleSeitenGleich) {
            System.out.println("Das Viereck ist eine Raute.");
        }

        else if (alleRechtenWinkel && gegenueberliegendeSeitenGleich) {
            System.out.println("Das Viereck ist ein Rechteck.");
        }

        else if (gegenueberliegendeSeitenGleich) {
            System.out.println("Das Viereck ist ein Parallelogramm.");
        }

        else if ((a == b && c == d) || (a == d && b == c)) {
            System.out.println("Das Viereck ist ein Drachenviereck.");
        }

        else {
            System.out.println("Das Viereck ist ein allgemeines Viereck.");
        }

        sc.close();
    }
}