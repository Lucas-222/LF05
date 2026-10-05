package eindimensionaleArrays;

import helper.Service;
import methoden.Mathe;

public class Temperaturauswertungen {
    private static double mid;
    private static double min;
    private static double max;
    private static double span;
    private static double maxDiff;

    static void main() {
        double[] numbers = fillArray();
        calculate(numbers);
        output();
    }

    private static double[] fillArray() {
        return Service.fillDoubleArray(7, "Bitte geben sie die Temperatur an Tag ", " ein: ", 1);
    }

    private static void calculate(double[] numbers) {
        if (numbers.length == 0) return;

        max = numbers[0];
        min = numbers[0];
        maxDiff = 0;
        double sum = 0;

        for (int i  = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (i != 0 && numbers[i] - numbers[i-1] > maxDiff) {
                maxDiff = numbers[i] - numbers[i-1];
            }
        }

        span = max - min;
        mid = sum / numbers.length;
    }

    private static void output() {
        System.out.println("Mittelwert: " + Mathe.runden(mid, 2));
        System.out.println("Min: " + Mathe.runden(min, 2));
        System.out.println("Max: " + Mathe.runden(max, 2));
        System.out.println("Span: " + Mathe.runden(span, 2));
        System.out.println("MaxDiff: " + Mathe.runden(maxDiff, 2));
    }

}
