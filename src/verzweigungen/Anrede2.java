package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede2 {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe des Vornamens
        System.out.print("Wie ist dein Vorname? ");
        String vorname = reader.readLine();

        // Eingabe des Nachnamens
        System.out.print("\nWie ist dein Nachname? ");
        String nachname = reader.readLine();

        // Eingabe des Geschlechtes
        System.out.print("\nWas ist dein Geschlecht? [m für Mann, f für Frau, d für Divers] ");
        String geschlecht = reader.readLine();

        String anrede = geschlecht.equals("m") ? "Herr " : geschlecht.equals("f") ? "Frau " : "";

        // Ausgabe des Namens
        System.out.println("Hallo " + anrede + vorname + " " + nachname);
    }

}
