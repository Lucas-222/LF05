package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuchenInArray {

    static void main() throws IOException {
        menu();
    }

    private static void menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = new double[5];

        System.out.println("Bitte geben sie ein Array bestehend aus 5 Kommazahlen an");
        System.out.print("Wert 1 eingeben: ");
        numbers[0] = Double.parseDouble(br.readLine());
        System.out.print("Wert 2 eingeben: ");
        numbers[1] = Double.parseDouble(br.readLine());
        System.out.print("Wert 3 eingeben: ");
        numbers[2] = Double.parseDouble(br.readLine());
        System.out.print("Wert 4 eingeben: ");
        numbers[3] = Double.parseDouble(br.readLine());
        System.out.print("Wert 5 eingeben: ");
        numbers[4] = Double.parseDouble(br.readLine());

        System.out.print("\nNach welcher Zahl wollen sie suchen? ");
        double searchAfter = Double.parseDouble(br.readLine());

        auswerten(numbers, searchAfter);
    }

    private static void auswerten(double[] numbers, double searchAfter) {
        for (double number : numbers) {
            if (number == searchAfter) {
                System.out.println("Treffer");
            } else {
                System.out.println("Niete");
            }
        }
    }

}
