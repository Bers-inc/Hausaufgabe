public class MainBody {
    public static void main(String[] args) {
        Star sonne = new Star("Sonne", 1.989e30, 26.74);
        Planet merkur = new Planet("Merkur", 3.301e23);
        Terra erde = new Terra("Erde", 5.972e24, 8_000_000_000L);
        GasGiant jupiter = new GasGiant("Jupiter", 1.898e27, "H2, He");
        Satellite mond = new Satellite("Mond", 7.342e22);

        Body[] bodies = {sonne, merkur, erde, jupiter, mond};

        for (Body body : bodies) {
            body.print();
        }
    }
}

class Body {
    private static int nextId = 0;

    protected int id;
    protected String name;
    protected double mass;

    public Body(String name, double mass) {
        this.id = nextId++;
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.printf("[%s] ID: %d | Name: %-7s | Mass: %.2e kg%n",
                getClass().getSimpleName(), id, name, mass);
    }
}

class Star extends Body {
    private double luminosity;

    public Star(String name, double mass, double luminosity) {
        super(name, mass);
        this.luminosity = luminosity;
    }
}

class Planet extends Body {
    public Planet(String name, double mass) {
        super(name, mass);
    }
}

class Terra extends Planet {
    private long population;

    public Terra(String name, double mass, long population) {
        super(name, mass);
        this.population = population;
    }
}

class GasGiant extends Planet {
    private String gasType;

    public GasGiant(String name, double mass, String gasType) {
        super(name, mass);
        this.gasType = gasType;
    }
}

class Satellite extends Body {
    public Satellite(String name, double mass) {
        super(name, mass);
    }
}