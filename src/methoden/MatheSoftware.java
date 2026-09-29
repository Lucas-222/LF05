package methoden;

import methoden.exceptions.InvalidSymbolException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatheSoftware {
    private static double number1;
    private static double number2;
    private static double result;
    private static String input;

    static void main() {
        menu();
        input();
        calculate();
        output();
    }

    private static void menu() {
        System.out.println("Folgende Rechenoperationen stehen zur Verfügung");
        System.out.println("[+] für Addition");
        System.out.println("[-] für Subtraktion");
        System.out.println("[*] für Multiplikation");
        System.out.println("[/] für Division");
        System.out.println("[p] für Potenzieren");
        System.out.println("[w] für Wurzelziehen");
    }

    private static void input() {
        System.out.print("Deine Auswahl: ");
        input = readLine();

        try {
            isValidSymbol(input);
        } catch (InvalidSymbolException e) {
            input();
        }

        System.out.print("\nBitte erste Zahl angeben: ");
        number1 = Double.parseDouble(readLine());

        System.out.print("Bitte zweite Zahl angeben: ");
        number2 = Double.parseDouble(readLine());
    }

    private static void output() {
        System.out.println("Das Ergebnis ist " + result);
    }

    private static String readLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isValidSymbol(String symbol) {
        if (symbol.length() != 1) return false;

        String[] validSymbols = new String[] {"+", "-", "*", "/", "p", "w"};

        for (String validSymbol : validSymbols) {
            if (symbol.equals(validSymbol)) return true;
        }

        return false;
    }

    private static void calculate() {
        switch (input) {
            case "+" -> result = Mathe.plus(number1, number2);
            case "-" -> result = Mathe.minus(number1, number2);
            case "*" -> result = Mathe.multiply(number1, number2);
            case "/" -> result = Mathe.divide(number1, number2);
            case "p" -> result = Mathe.exponent(number1, number2);
            case "w" -> result = Mathe.wurzel(number1, number2);
        }
    }

}
