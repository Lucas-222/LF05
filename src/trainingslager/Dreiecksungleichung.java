package trainingslager;

import helper.Service;

public class Dreiecksungleichung {

    static void main() {
        double a = Service.readDouble("Erste länge: ");
        double b = Service.readDouble("Zweite länge: ");
        double c = Service.readDouble("Dritte länge: ");

        double circumference = calculateCircumference(a, b, c);
        double area = calculateArea(a, b, c);

        output(check(a, b, c), circumference, area);
    }

    public static boolean check(double a, double b, double c) {
        if (a >= b + c) return false;
        if (b >= a + c) return false;
        if (c >= a + b) return false;
        return true;
    }

    public static double calculateCircumference(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static void output(boolean check, double circumference, double area) {
        if (check) {
            System.out.println("Das Dreieck kann existieren");
            System.out.println("Der Umfang ist: " + circumference);
            System.out.println("Die Fläche ist: " + area);
        } else {
            System.out.println("Das Dreieck kann nicht existieren");
        }
    }

}
