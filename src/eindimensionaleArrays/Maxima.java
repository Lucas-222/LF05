package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maxima {

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

        double max = numbers[0];
        double secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondMax = max;
                max = numbers[i];
            }
        }

        System.out.println("Größte Zahle: " + max);
        System.out.println("Zweitgrößte Zahl " + secondMax);


    }

}
