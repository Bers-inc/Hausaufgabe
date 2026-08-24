import java.util.Scanner;
import java.time.LocalDate;

public class Main1 {

    public static void main(String[] args) {

        int birthdate = 2007;
        int date = LocalDate.now().getYear();
        int age = date - birthdate;

        System.out.println("Hallo!");
        System.out.println("Mein Name ist Alex");
        System.out.println("Ich bin ein Schüller");
        System.out.println("Mein Guburtsdatum: " + date + " - " + birthdate + " = " + age);
        System.out.println("Ich interessiere mich für Programmieren, Modelbau und Computer");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Stell dich jetzt vor!");

        System.out.print("Wie heißt du?");
        String yourName = scanner.nextLine();

        System.out.print("In welchem Jahr bist du geboren?");
        int yourBirthdate = scanner.nextInt();

        System.out.print("Welhe Hobbys hast du?");
        scanner.nextLine();
        String hobby = scanner.nextLine();

        int yourAge = date - yourBirthdate;

        System.out.println();
        System.out.println("Deine Daten:");
        System.out.println("Name: " + yourName);
            if (yourBirthdate == 0){
                System.out.println("Alter: " + date + " - " + yourBirthdate + " = " + yourAge + " JESUS?!");
            }else {
                System.out.println("Alter: " + date + " - " + yourBirthdate + " = " + yourAge);
            }
        System.out.println("Hobby: " + hobby);
        scanner.close();
    }
}