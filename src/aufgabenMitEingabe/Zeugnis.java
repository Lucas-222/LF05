package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

    static void main() throws IOException {
        gewollteLoesung();
        bessereLoesung();
    }

    public static void gewollteLoesung() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Note für LF01 und Umwandlung in ein double Wert mit "double.parseDouble()"
        System.out.print("Welche Note hast du in LF01? ");
        double mark1 = Double.parseDouble(reader.readLine());

        // Eingabe der Note für LF02 und Umwandlung in ein double Wert mit "double.parseDouble()"
        System.out.print("Welche Note hast du in LF02? ");
        double mark2 = Double.parseDouble(reader.readLine());

        // Eingabe der Note für LF03 und Umwandlung in ein double Wert mit "double.parseDouble()"
        System.out.print("Welche Note hast du in LF03? ");
        double mark3 = Double.parseDouble(reader.readLine());

        // Eingabe der Note für LF04 und Umwandlung in ein double Wert mit "double.parseDouble()"
        System.out.print("Welche Note hast du in LF04? ");
        double mark4 = Double.parseDouble(reader.readLine());

        // Eingabe der Note für LF05 und Umwandlung in ein double Wert mit "double.parseDouble()"
        System.out.print("Welche Note hast du in LF05? ");
        double mark5 = Double.parseDouble(reader.readLine());

        // Berechnung des Mittelwertes der Noten
        double result = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;

        // Ausgabe des Mittelwertes
        System.out.println(result);
    }

    public static void bessereLoesung() {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Erstellung einer Variable um die Summe der Noten zu speichern
        double markSum = 0;

        // Erstellung einer Variable um die Anzahl an Daten zu speichern. In diesem Fall auf "5" festgelegt
        double markCount = 5;

        /*
        Die for Schleife läuft 5-mal durch, weil fünf Eingaben benötigt werden.
        Dafür wird eine "Zählervariable" Standardmässig "i" erzeugt.
        "i" wird der Wert "0" zugewiesen" (int i = 0)
        Die Schleife läuft so lange wie "i" kleiner als "markCount" ist. (i < markCount).
        "markCount" ist in diesem Fall "5" könnte aber um die Erweiterung leichter zu machen, einfach verändert werden.
        Bei jedem durchlaufen erhöht sich "i" um "1" (i++).
        Diese Einstellungen werden im Kopf der Schleife gesetzt.
         */

        for (int i = 0; i < markCount; i++) {
            /*
            Dadurch dass "i" in der Schleife am Anfang den Wert "0" hat, wird bei der Ausgabe "(i+1)" verwendet.
            Das erhöht nicht den Wert von "i", sondern ist nur für die richtige Darstellung da.
             */

            System.out.print("Welche Note hast du in LF0" + (i+1) + "? ");

            /*
            Die erste Zahl wird von der Konsole eingelesen und auf "markSum" dazu addiert (markSum += value).

            Um sie als Kommazahl weiterverarbeiten zu können wird sie mithilfe von Double.parse(Double)
            in eine Variable mit dem Datentyp double umgewandelt.

            Um dabei nicht die IOException zu werfen wird sie durch ein "try catch" Block abgefangen.
            Dadurch kann man im Falle des auslösens der Exception zum Beispiel eine eigene Fehlermeldung ausgeben,
            ohne dass das Programm beendet wird.
            Das ist sehr Hilfreich zum debuggen.
             */

            try {
                markSum += Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.print("Fehler bei der Eingabe");
            }
        }

        // Der Mittelwert wird in der Ausgabe berechnet und ausgegeben.
        System.out.println("\nDer Mittelwert der Noten ist: " + (markSum / markCount));

    }

}
