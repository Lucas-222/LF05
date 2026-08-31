package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silvesterrakete {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Erstellung der Variable für die Erdanziehungskraft
        double g = 9.81;

        // Erstellung der Variable für die Zeit durch umwandlung in einen double Wert vom BufferedReader
        System.out.print("Wie viel Zeit benötigt der Raketenkörper? ");
        double time = Double.parseDouble(reader.readLine());

        // Formel für die Berechnung der Geschwindigkeit (v = g · t)
        double v = g * time;

        // Ausgabe der Geschwindigkeit in m/s
        System.out.println("Geschwindigkeit in m/s: " + v);

        // Ausgabe der Geschwindigkeit in km/h (km/h = m/s · 3.6)
        System.out.println("Geschwindigkeit in km/h: " + (v * 3.6));

    }

}
