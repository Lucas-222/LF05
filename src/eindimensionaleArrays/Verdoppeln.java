package eindimensionaleArrays;

import helper.Service;

public class Verdoppeln {

    static void main() {
        double[] numbers = fillArray();
        outputNormalArray(numbers);
        outputDoubledArray(numbers);
    }

    private static double[] fillArray() {
        System.out.println("Bitte geben sie ein Array bestehend aus Kommazahlen an");
        int length = Service.readInt("Wie viele Werte? ");

        return Service.fillDoubleArray(length, "Wert ", " eingeben ", 1);
    }

    private static void outputNormalArray(double[] numbers) {
        System.out.println("\nUrsprüngliches Array: ");
        for (double number : numbers) {
            System.out.print(number + "\t");
        }
    }

    private static void outputDoubledArray(double[] numbers) {
        System.out.println("\n\nVerdoppeltes Array: ");
        for (double number : numbers) {
            System.out.print( (number*2) + "\t");
        }
    }

}
