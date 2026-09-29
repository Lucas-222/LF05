package eindimensionaleArrays;

import helper.Service;

public class SuchenInArray {

    static void main() {
        menu();
    }

    private static void menu() {
        System.out.println("Bitte geben sie ein Array bestehend aus 5 Kommazahlen an");
        double[] numbers = Service.fillDoubleArray(5, "Wert ", " eingeben: ", 1);

        double searchAfter = Service.readDouble("\nNach welcher Zahl wollen sie suchen? ");
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
