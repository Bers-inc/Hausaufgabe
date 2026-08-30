import java.util.Scanner;
import java.time.LocalDate;

public class datum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jahr:");
        int year = sc.nextInt();
        System.out.println("Monat:");
        int month = sc.nextInt();
        System.out.println("Tag:");
        int day = sc.nextInt();

        try {
            LocalDate date = LocalDate.of(year, month, day);
            System.out.printf(day+"|"+month+"|"+year);
        }
        catch (Exception e){
            System.out.println("Solches Datum existiert nicht.");
        }
    }
}
