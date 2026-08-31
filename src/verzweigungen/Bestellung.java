package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bestellung {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Anzahl der Schrauben
        System.out.print("Schrauben? ");
        int schrauben = Integer.parseInt(reader.readLine());

        // Eingabe der Anzahl der Muttern
        System.out.print("Muttern? ");
        int muttern = Integer.parseInt(reader.readLine());

        // Eingabe der Anzahl der Unterlegscheiben
        System.out.print("Unterlegscheiben? ");
        int unterlegscheiben = Integer.parseInt(reader.readLine());

        // Berechnung des Summen-produktes
        double sum =  (double) ((schrauben * 5) + (muttern * 3) + (unterlegscheiben)) / 100;

        // Ausgabe der Summe
        System.out.println("Summe: " + sum + "€");

        // Abfrage, ob die Anzahl an Schrauben und Muttern gleich sind
        if ( schrauben != muttern ) {
            System.out.println("Die Anzahl an Schrauben und Muttern ist unterschiedlich");
        }

    }

}
