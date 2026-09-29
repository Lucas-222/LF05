package eindimensionaleArrays;

import helper.Service;

public class Summen {

    static void main(){
        int[] numbers = fillArray();
        int[] results = calculate(numbers);
        output(results);
    }

    private static int[] fillArray() {
        System.out.println("Bitte geben sie ein Array bestehend aus Ganzzahlen an");
        int length = Service.readInt("Wie viele Werte? ");

        return Service.fillIntArray(length, "Wert ", " angeben ", 1);
    }

    private static int[] calculate(int[] numbers) {
        int countEven = 0;
        int sumEven = 0;
        int countOdd = 0;
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
                sumEven += number;
            } else {
                countOdd++;
                sumOdd += number;
            }
        }

        return  new int[]{countEven, sumEven, countOdd, sumOdd};
    }

    private static void output(int[] results) {
        System.out.println("Anzahl gerade Zahlen: " + results[0]);
        System.out.println("Summe gerade Zahlen: " + results[1]);

        System.out.println("Anzahl ungerade Zahlen: " + results[2]);
        System.out.println("Summe ungerade Zahlen: " + results[3]);
    }

}
