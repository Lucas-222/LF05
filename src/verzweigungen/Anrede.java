package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Anrede {
    public enum genders {HERR, FRAU, DIVERS}

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
        System.out.print("\nWas ist dein Geschlecht? [1 für Mann, 2 für Frau, 3 für Divers] ");
        int input = Integer.parseInt(reader.readLine());

        genders gender = getGender(input);
        String anrede = gender == genders.HERR ? "Herr " : gender == genders.FRAU ? "Frau " : "";

        // Ausgabe des Namens
        System.out.println("Hallo " + anrede + vorname + " " + nachname);
    }

    public static genders getGender(int input) {
        return input == 1 ? genders.HERR : input == 2 ? genders.FRAU : genders.DIVERS;
    }

    public static boolean isNameValid(String name) {
        String[] invalidChars = {
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "+",
                ".",
                "-",
                "/",
                "!",
        };

        if ( name.length() <= 1 || name.length() > 20 ) {
            return false;
        }

        for ( String invalidChar : invalidChars) {
            if ( name.contains(invalidChar) ) {
                return false;
            }
        }

        return true;
    }

}
