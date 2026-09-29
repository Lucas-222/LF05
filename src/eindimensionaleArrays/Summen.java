package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summen {

    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte geben sie ein Array bestehend aus Ganzzahlen an");
        System.out.print("Wie viele Werte? ");
        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            numbers[i] = Integer.parseInt(br.readLine());
        }

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

        System.out.println("Anzahl gerade Zahlen: " + countEven);
        System.out.println("Summe gerade Zahlen: " + sumEven);

        System.out.println("Anzahl ungerade Zahlen: " + countOdd);
        System.out.println("Summe ungerade Zahlen: " + sumOdd);
    }

}
