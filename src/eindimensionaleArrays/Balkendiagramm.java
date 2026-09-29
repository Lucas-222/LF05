package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balkendiagramm {

    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wie viele Kandidaten sind noch im Rennen? ");
        int length = Integer.parseInt(br.readLine());
        double[] numbers = new double[length];

        System.out.println("Erfassen sie jetzt die prozentuale Verteilung");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Kandidat " + (i+1) + ": ");
            numbers[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("Ergebnis");

        for (double number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.print(" " + number + "%");
            System.out.println("");
        }

    }

}
