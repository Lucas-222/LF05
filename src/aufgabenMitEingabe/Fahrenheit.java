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
        double celsius = Double.parseDouble(reader.readLine());

        /*
        Berechnung der Temperatur in Fahrenheit.
        Hier wird 9.0 verwendet, um dem Programm zu zeigen, dass es sich um eine Kommazahl handelt,
        damit die division möglich ist.
        Die Formel zur Berechnung von Fahrenheit ist: f = (c · 9 / 5) + 32
        */
        double fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        // Ausgabe des Ergebnisses
        System.out.println(fahrenheit);

    }

}
