package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zaehlmass {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Zahl
        System.out.print("Gib eine Zahl an: ");

        // Umwandlung der Zahl in einen Integer (int)
        int number = Integer.parseInt(reader.readLine());

        // Wenn die eingegebene Zahl "0" ist, wird die Funktion nicht weiter ausgeführt
        if (number < 0) return;

        // "Math.divideExact(value1, value2)" gibt die Anzahl der exakten Zähler zurück.
        int gros = Math.divideExact(number, 144);
        int schock = Math.divideExact(number - (gros*144), 60);
        int dutzend = Math.divideExact(number - (gros*144) - (schock*60), 12);

        int rest = number - (gros * 144) - (schock * 60) - (dutzend*12);

        // Ausgabe der Wert
        System.out.println(gros + " gros");
        System.out.println(schock + " schock");
        System.out.println(dutzend + " dutzend");
        System.out.println(rest + " rest");

    }

}
