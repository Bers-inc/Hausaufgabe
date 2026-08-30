import java.util.Scanner;

public class datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tageImMonat;
        String monatName;
        boolean schaltjahr;

        System.out.println("Tag:");
        int tag = sc.nextInt();
        System.out.println("Monat:");
        int monat = sc.nextInt();
        System.out.println("Jahr:");
        int jahr = sc.nextInt();

        if(jahr%400==0){
            schaltjahr=true;
        } else if(jahr%100==0){
            schaltjahr=false;
        } else if(jahr%4==0){
            schaltjahr=true;
        }else {
            schaltjahr=false;
        }

        if (monat < 1 || monat > 12) {
            System.out.println("Solcher Monat existiert nicht.");
            return;
        }
        switch (monat) {
            case 1:
                tageImMonat = 31;
                monatName = "Januar";
                break;
            case 2:
                if(schaltjahr) {
                    tageImMonat = 29;
                } else {
                    tageImMonat = 28;
                }
                monatName = "Februar";
                break;
            case 3:
                tageImMonat = 31;
                monatName = "Maerz";
                break;
            case 4:
                tageImMonat = 30;
                monatName = "April";
                break;
            case 5:
                tageImMonat = 31;
                monatName = "Mai";
                break;
            case 6:
                tageImMonat = 30;
                monatName = "Juni";
                break;
            case 7:
                tageImMonat = 31;
                monatName = "Juli";
                break;
            case 8:
                tageImMonat = 31;
                monatName = "August";
                break;
            case 9:
                tageImMonat = 30;
                monatName = "September";
                break;
            case 10:
                tageImMonat = 31;
                monatName = "Oktober";
                break;
            case 11:
                tageImMonat = 30;
                monatName = "November";
                break;
            default:
                tageImMonat = 31;
                monatName = "Dezember";
        }

        if (tag < 1 || tag > tageImMonat) {
            System.out.println("Dieser Tag existiert nicht.");
            return;
        }
        if (jahr < 1) {
            System.out.println("Solches Jahr existiert nicht.");
            return;
        }

        System.out.print(tag+"|");
        System.out.print(monatName+"|");
        System.out.print(jahr);
    }
}

