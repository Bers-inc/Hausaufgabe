public class Bruche {
    public static void main(String[] args) {
        Bruch a = new Bruch(1,2);
        Bruch b = new Bruch(1,6);
        a.print();
        b.print();
        System.out.println("--- Addition (1/2 + 1/6) ---");
        Bruch summe = a.add(b);
        summe.print();

        System.out.println("--- Subtraktion (1/2 - 1/6) ---");
        Bruch differenz = a.subtract(b);
        differenz.print();

        System.out.println("--- Multiplikation (1/2 * 1/6) ---");
        Bruch produkt = a.multiply(b);
        produkt.print();

        System.out.println("--- Division (1/2 / 1/6) ---");
        Bruch quotient = a.divide(b);
        quotient.print();
    }
}
class Bruch {
    private int zaehler;
    private int nenner;
    public static int anzBruche = 0;

    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
        }
        this.zaehler = zaehler;
        this.nenner = nenner;
        updateAnz();
        printAnz();
        this.kuerzen();
    }
    public void updateAnz(){
        anzBruche++;
    }

    public void print() {
        System.out.println(zaehler);
        System.out.println("_");
        System.out.println(nenner);
        System.out.println();
    }
    public void printAnz(){
        System.out.println("Anzahl der Erzeugten Bruche:" + anzBruche);
    }

    private int ggt(int a, int b) {
        return b == 0 ? Math.abs(a) : ggt(b, a % b);
    }

    public void kuerzen() {
        int teiler = ggt(zaehler, nenner);
        if (teiler != 0) {
            zaehler /= teiler;
            nenner /= teiler;
            if (nenner < 0) {
                zaehler = -zaehler;
                nenner = -nenner;
            }
        }
    }
    public Bruch add(Bruch b) {
        int neuerZaehler = zaehler * b.getNenner() + b.getZaehler() * nenner;
        int neuerNenner = nenner * b.getNenner();
        return new Bruch(neuerZaehler, neuerNenner);
    }
    public Bruch subtract(Bruch b) {
        int neuerZaehler = zaehler * b.getNenner() - b.getZaehler() * nenner;
        int neuerNenner = nenner * b.getNenner();
        return new Bruch(neuerZaehler, neuerNenner);
    }
    public Bruch multiply(Bruch b) {
        int neuerZaehler = zaehler * b.getZaehler();
        int neuerNenner = nenner * b.getNenner();
        return new Bruch(neuerZaehler, neuerNenner);
    }
    public Bruch divide(Bruch b) {
        if (b.getZaehler() == 0) {
            throw new ArithmeticException("Division durch 0 ist nicht erlaubt!");
        }
        int neuerZaehler = zaehler * b.getNenner();
        int neuerNenner = nenner * b.getZaehler();
        return new Bruch(neuerZaehler, neuerNenner);
    }

    public int getNenner() {
        return nenner;
    }
    public int getZaehler() {
        return zaehler;
    }
}