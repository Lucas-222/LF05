package methoden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatheSoftware {

    static void main() {
        schreibeMenue();
    }

    public static void schreibeMenue() {
        System.out.println("Folgende Rechenoperationen stehen zur Verfügung");
        System.out.println("[+] für Addition");
        System.out.println("[-] für Subtraktion");
        System.out.println("[*] für Multiplikation");
        System.out.println("[/] für Division");
        System.out.println("[p] für potenzieren");
        System.out.println("[w] für Wurzelziehen");

        System.out.print("Deine Auswahl: ");
        String input = getInput();

        System.out.print("\nBitte erste Zahl angeben: ");
        double number1 = Double.parseDouble(getInput());

        System.out.print("Bitte zweite Zahl angeben: ");
        double number2 = Double.parseDouble(getInput());

        output(calculate(input, number1, number2));
    }

    public static void output(double result) {
        System.out.println("Das Ergebnis ist " + result);
    }

    public static String getInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static double calculate(String input, double number1, double number2) {
        return switch (input) {
            case "+" -> Mathe.plus(number1, number2);
            case "-" -> Mathe.minus(number1, number2);
            case "*" -> Mathe.multiply(number1, number2);
            case "/" -> Mathe.divide(number1, number2);
            case "p" -> Mathe.exponent(number1, number2);
            case "w" -> Mathe.wurzel(number1, number2);
            default -> 0;
        };
    }

}
