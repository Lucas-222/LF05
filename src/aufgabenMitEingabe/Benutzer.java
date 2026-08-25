package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

    static void main() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wie ist dein Vorname? ");
        String vorname = reader.readLine();

        System.out.print("\nWie ist dein Nachname? ");
        String nachname = reader.readLine();

        System.out.println("Hallo " + vorname + " " + nachname);

    }


}
