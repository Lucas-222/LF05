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

        System.out.print("Wie viel Zeit benötigt der Raketenkörper? ");
        double time = Double.parseDouble(reader.readLine());

        // Formel für die Berechnung der Geschwindigkeit (v = g · t)
        double v = g * time;

        // Ausgabe der Geschwindigkeit in m/s
        System.out.println(v);

        // Ausgabe der Geschwindigkeit in km/h
        System.out.println(v * 3.6);

    }

}
