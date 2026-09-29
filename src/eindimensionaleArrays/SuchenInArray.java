package eindimensionaleArrays;

import helper.Service;

public class SuchenInArray {

    static void main() {
        double[] numbers = fillArray();
        double searchAfter = getSearchDouble();
        auswerten(numbers, searchAfter);
    }

    private static double[] fillArray() {
        return Service.fillDoubleArray("Bitte geben sie ein Array bestehend aus 5 Kommazahlen an", 5, "Wert ", " eingeben: ", 1);
    }

    private static double getSearchDouble() {
        return Service.readDouble("\nNach welcher Zahl wollen sie suchen? ");
    }

    private static void auswerten(double[] numbers, double searchAfter) {
        for (double number : numbers) {
            System.out.println(number == searchAfter ? "Treffer" : "Niete");
        }
    }

}
