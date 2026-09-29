package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Verdoppeln {

    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte geben sie ein Array bestehend aus Kommazahlen an");
        System.out.print("Wie viele Werte? ");
        int length = Integer.parseInt(br.readLine());
        double[] numbers = new double[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            numbers[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("\nUrsprüngliches Array: ");
        for (double number : numbers) {
            System.out.print(number + "\t");
        }

        System.out.println("\n\nVerdoppeltes Array: ");
        for (double number : numbers) {
            System.out.print( (number*2) + "\t");
        }
    }

}
