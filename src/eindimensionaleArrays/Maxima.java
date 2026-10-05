package eindimensionaleArrays;

import helper.Service;

public class Maxima {

    static void main() {
        double[] numbers = fillArray();
        double[] maxAndSecondMax = calculateAndReturnMaxAndSecondMax(numbers);
        output(maxAndSecondMax);
    }

    private static double[] fillArray() {
        int length = Service.readInt("Wie viele Werte? ");
        return Service.fillDoubleArray(length, "Wert ", " eingeben: ", 1);
    }

    private static double[] calculateAndReturnMaxAndSecondMax(double[] numbers) {
        double max = numbers[0];
        double secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max <= numbers[i]) {
                secondMax = max;
                max = numbers[i];
            }
        }

        return new double[]{max, secondMax};
    }

    private static void output(double[] maxAndSecondMax) {
        System.out.println("\nGrößte Zahle: " + maxAndSecondMax[0]);
        System.out.println("Zweitgrößte Zahl " + maxAndSecondMax[1]);
    }

}
