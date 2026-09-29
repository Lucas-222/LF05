package eindimensionaleArrays;

import helper.Service;

public class Summen {
    private static int countEven = 0;
    private static int sumEven = 0;
    private static int countOdd = 0;
    private static int sumOdd = 0;

    static void main(){
        int[] numbers = fillArray();
        calculate(numbers);
        output();
    }

    private static int[] fillArray() {
        int length = Service.readInt("Wie viele Werte? ");
        return Service.fillIntArray("Bitte geben sie ein Array bestehend aus Ganzzahlen an", length, "Wert ", " angeben ", 1);
    }

    private static void calculate(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
                sumEven += number;
            } else {
                countOdd++;
                sumOdd += number;
            }
        }
    }

    private static void output() {
        System.out.println("Anzahl gerade Zahlen: " + countEven);
        System.out.println("Summe gerade Zahlen: " + sumEven);

        System.out.println("Anzahl ungerade Zahlen: " + countOdd);
        System.out.println("Summe ungerade Zahlen: " + sumOdd);
    }

}
