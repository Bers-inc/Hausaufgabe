public class BMI {
    public static void main(String[] args) {
        double kg = 77.3;
        double m = 1.76;

        double bmi = kg / (kg * m);
        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 16.0) {
            System.out.println("Starkes Untergewicht");
        } else if (bmi < 18.5) {
            System.out.println("Untergewicht");
        } else if (bmi < 25.0) {
            System.out.println("Normalgewicht");
        } else if (bmi < 30.0) {
            System.out.println("Übergewicht");
        } else if (bmi < 35.0) {
            System.out.println("Adipositas Grad 1");
        } else if (bmi < 40.0) {
            System.out.println("Adipositas Grad 2");
        } else {
            System.out.println("Adipositas Grad 3");
        }
    }
}
