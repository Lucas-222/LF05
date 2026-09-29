package eindimensionaleArrays;

import helper.Service;

public class Balkendiagramm {

    static void main() {
        double[] numbers = fillArray();
        output(numbers);
    }

    private static double[] fillArray() {
        int length = Service.readInt("Wie viele Kandidaten sind noch im Rennen? ");
        return Service.fillDoubleArray("Erfassen sie jetzt die prozentuale Verteilung", length, "Kandidat ", ": ", 1);
    }

    private static void output(double[] numbers) {
        System.out.println("\nErgebnis");
        for (double number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.print(" " + number + "%\n");
        }
    }

}
