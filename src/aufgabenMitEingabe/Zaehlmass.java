package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zaehlmass {

    static void main() throws IOException {
        gewollteLoesung();
        bessereLoesung();
    }

    public static void gewollteLoesung() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Zahl
        System.out.print("Gib eine Zahl an: ");

        // Umwandlung der Zahl in einen Integer (int)
        int number = Integer.parseInt(reader.readLine());

        // Wenn die eingegebene Zahl "0" ist, wird die Funktion nicht weiter ausgeführt
        if (number < 0) return;

        // Erstellung der Variablen außerhalb der Schleife
        int gros = 0;
        int schock = 0;
        int dutzend = 0;
        int rest = 0;

        /*
        Die Schleife läuft so lange durch bis rest gefüllt ist, da das der letzte Schritt ist.
        Es wird nach größe absteigend abgefragt, ob die Zahl größer als einer der festgelegten Werte ist.
        Falls das zutrifft erhöht sich der Zähler um "1" (gros++).
        Der festgelegte Wert (z.B.: 144) wird dann von der Zahl abgezogen.

        Der Rest der Schleife wird dann nicht weiter ausgeführt, sondern sie wird von vorne gestartet.
        Und erst, wenn der Rest feststeht wird die Schleife verlassen.
         */

        while (rest == 0) {
            if (number > 144) {
                gros++;
                number -= 144;
            } else if (number > 60) {
                schock++;
                number -= 60;
            } else if (number > 12) {
                dutzend++;
                number -= 12;
            } else {
                rest = number;
            }
        }

        // Ausgabe der Werte
        System.out.println(gros + " gros");
        System.out.println(schock + " schock");
        System.out.println(dutzend + " dutzend");
        System.out.println(rest + " rest");

    }

    public static void bessereLoesung() {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Zahl
        System.out.print("Gib eine Zahl an: ");

        // Umwandlung der Zahl in einen Integer (int)
        int number = 0;

        /*
        Die Zahl wird von der Konsole eingelesen.
        Um sie als Ganzzahl weiterverarbeiten zu können wird sie mithilfe von Integer.parseInt(String)
        in eine Variable mit dem Datentyp int umgewandelt.

        Um dabei nicht die IOException zu werfen wird sie durch ein "try catch" Block abgefangen.
        Dadurch kann man im Falle des auslösens der Exception zum Beispiel eine eigene Fehlermeldung ausgeben,
        ohne dass das Programm beendet wird.
        Das ist sehr Hilfreich zum debuggen.
         */

        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Fehler bei der Eingabe");
        }

        // Wenn die eingegebene Zahl "0" ist, wird die Funktion nicht weiter ausgeführt
        if (number < 0) return;

        // "Math.divideExact(value1, value2)" gibt die Anzahl der exakten Zähler zurück.
        int gros = Math.divideExact(number, 144);
        int schock = Math.divideExact(number - (gros*144), 60);
        int dutzend = Math.divideExact(number - (gros*144) - (schock*60), 12);

        int rest = number - (gros * 144) - (schock * 60) - (dutzend*12);

        // Ausgabe der Werte
        System.out.println(gros + " gros");
        System.out.println(schock + " schock");
        System.out.println(dutzend + " dutzend");
        System.out.println(rest + " rest");

    }

}
