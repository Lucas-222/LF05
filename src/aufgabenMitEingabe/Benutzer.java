package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe des Vornamens
        System.out.print("Wie ist dein Vorname? ");
        String vorname = reader.readLine();

        // Eingabe des Nachnamens
        System.out.print("\nWie ist dein Nachname? ");
        String nachname = reader.readLine();

        // Ausgabe des Namens
        System.out.println("Hallo " + vorname + " " + nachname);

    }

}
