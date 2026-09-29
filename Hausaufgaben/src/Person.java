import java.util.ArrayList;

    public class Person {

        private String vorname;
        private String nachname;
        private int alter;
        private String adresse;

        private ArrayList<Person> bekannte;

        public Person(String vorname, String nachname, int alter, String adresse) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.alter = alter;
            this.adresse = adresse;
            this.bekannte = new ArrayList<>();
        }


        public String getVorname() {
            return vorname;
        }

        public void setVorname(String vorname) {
            this.vorname = vorname;
        }

        public String getNachname() {
            return nachname;
        }

        public void setNachname(String nachname) {
            this.nachname = nachname;
        }

        public int getAlter() {
            return alter;
        }

        public void setAlter(int alter) {
            this.alter = alter;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        public String getName() {
            return vorname + " " + nachname;
        }

        public void lerneKennen(Person p) {
            if (!bekannte.contains(p) && p != this) {
                bekannte.add(p);
            }
        }

        public boolean kennt(Person p) {
            return bekannte.contains(p);
        }

        public int getAnzahlBekannte() {
            return bekannte.size();
        }

        public void info() {
            System.out.println("Name: " + getName());
            System.out.println("Alter: " + alter);
            System.out.println("Adresse: " + adresse);
            System.out.println("Anzahl Bekannte: " + bekannte.size());
        }
    }
