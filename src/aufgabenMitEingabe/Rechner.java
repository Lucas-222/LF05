package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rechner {

    static void main() throws IOException {
        gewollteLoesung();
        bessereLoesung();
    }

    public static void gewollteLoesung() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        Die erste Zahl wird von der Konsole eingelesen.
        Um sie als Kommazahl weiterverarbeiten zu können wird sie mithilfe von Double.parse(Double)
        in eine Variable mit dem Datentyp double umgewandelt.
        Dabei kann eine IOException geworfen werden.
         */

        System.out.print("Zahl 1: ");
        double number1 = Double.parseDouble(reader.readLine());

        /*
        Die zweite Zahl wird eingelesen
         */
        System.out.print("Zahl 2: ");
        double number2 = Double.parseDouble(reader.readLine());

        /*
        Für das Ergebnis der jeweiligen Operation wird eine variable mit der Lösung erzeugt.
        Das Ergebnis wird dann ausgegeben.
         */

        // Für Addition
        double sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);

        // Für Subtraktion
        double minus = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + minus);

        // Für Multiplikation
        double product = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + product);

        // Für Division
        double division = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

        // Für Exponentiation

        // Hier wird die "Math" Klasse und die Funktion "pow()" verwendet um den exponenten zu berechnen
        double exponent = Math.pow(number1, number2);
        System.out.println(number1 + " hoch " + number2 + " = " + exponent);
    }

    public static void bessereLoesung() {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        Erstellung eines Arrays in dem die eingegebenen Zahlen gespeichert werden.
        Um ein Array zu erstellen werden eckige Klammern "[]" verwendet.
        Bei der Erstellung eines Arrays muss zwingend die Größe angegeben werden "[2]".
         */

        double[] numbers = new double[2];

        /*
        Die for Schleife läuft 2-mal durch, weil zwei Eingaben benötigt werden.
        Dafür wird eine "Zählervariable" Standardmässig "i" erzeugt.
        "i" wird der Wert "0" zugewiesen" (int i = 0)
        Die Schleife läuft so lange wie "i" kleiner als "2" ist. (i < 2)
        Bei jedem durchlaufen erhöht sich "i" um "1" (i++).
        Diese Einstellungen werden im Kopf der Schleife gesetzt.
         */

        for (int i = 0; i < 2; i++) {
            /*
            Dadurch das "i" den initialen Wert "0" hat, wird für die Ausgabe "i+1" verwendet.
            Das verändert nicht den Wert von "i", sondern es wird nur anders dargestellt.
             */
            System.out.print("Zahl " + (i+1) + ": ");

            /*
            Die erste Zahl wird von der Konsole eingelesen und in "numbers[i] gesetzt".
            "numbers[i]" greift auf den Wert in "numbers" zu der an "i"-ter Stelle steht.
            Beim ersten Durchlauf hat "i" den Wert "0" und greift dadurch auf den Wert im Array zu der den Index "0" hat.
            Das ist der erste Wert. Also die erste eingegebene Zahl.
            Bei dem nächsten Durchlauf erhöht sich "i" um "1", so wird der zweite Wert im Array gesetzt.

            Um sie als Kommazahl weiterverarbeiten zu können wird sie mithilfe von Double.parse(Double)
            in eine Variable mit dem Datentyp double umgewandelt.

            Um dabei nicht die IOException zu werfen wird sie durch ein "try catch" Block abgefangen.
            Dadurch kann man im Falle des auslösens der Exception zum Beispiel eine eigene Fehlermeldung ausgeben,
            ohne dass das Programm beendet wird.
            Das ist sehr Hilfreich zum debuggen.
             */

            try {
                numbers[i] = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.println("Fehler bei der Eingabe");
            }
        }

        /*
        Alle Ergebnisse werden in einem Array gespeichert.
        Dieser Array wird direkt mit Werten ausgefüllt mit den Daten die in den geschweiften Klammern stehen "{}",
        dadurch muss keine Größe direkt angegeben werden, da sich die größe aus der Anzahl an direkt gegebenen Werten ergibt.
         */

        double[] results = new double[] {
                numbers[0] + numbers[1],
                numbers[0] - numbers[1],
                numbers[0] * numbers[1],
                numbers[0] / numbers[1],
                Math.pow(numbers[0], numbers[1]),
        };

        /*
        Die Operatoren werden in einem Array gespeichert.
         Dieser Array wird direkt mit Werten ausgefüllt mit den Daten die in den geschweiften Klammern stehen "{}",
        dadurch muss keine Größe direkt angegeben werden, da sich die größe aus der Anzahl an direkt gegebenen Werten ergibt.
         */

        String[] operators = new String[] {
                " + ",
                " - ",
                " * ",
                " / ",
                " hoch ",
        };

        /*
        Für die Ausgabe wird eine For Schleife verwendet.
        Dafür wird eine "Zählervariable" Standardmässig "i" erzeugt.
        "i" wird der Wert "0" zugewiesen" (int i = 0)
        Die Schleife läuft so lange wie "i" kleiner als "5" ist. (i < 5)
        Bei jedem durchlaufen erhöht sich "i" um "1" (i++).
        Diese Einstellungen werden im Kopf der Schleife gesetzt.
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[0] + operators[i] + numbers[1] + " = " + results[i]);
        }

    }

}
