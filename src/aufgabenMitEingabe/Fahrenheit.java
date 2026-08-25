package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Temperatur in Celsius
        System.out.print("In Celsius: ");
        double cel = Double.parseDouble(reader.readLine());

        // Berechnung der Temperatur in Fahrenheit
        double result = (cel * ((double) 9 /5)) + 32;

        // Ausgabe des Ergebnisses
        System.out.println(result);

    }

}
