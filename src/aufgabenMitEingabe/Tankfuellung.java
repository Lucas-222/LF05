package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tankfuellung {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe der Liter
        System.out.print("Liter: ");
        double liter = Double.parseDouble(reader.readLine());

        // Eingabe des Nettopreises
        System.out.print("Nettopreis: ");
        double nettoPrice = Double.parseDouble(reader.readLine());

        // Berechnung des Nettopreises
        double result = liter * nettoPrice;
        // Ausgabe des Nettopreises (Auf zwei Nachkommastellen gerundet durch String.format("%.2d", value))
        System.out.println("Nettopreis: " + String.format("%.2f", result));

        // Berechnung der Mehrwertsteuer (19%)
        double tax = result * 0.19;
        // Ausgabe der Mehrwertsteuer (Auf zwei Nachkommastellen gerundet durch String.format("%.2d", value))
        System.out.println("Mehrwertsteuer: " + String.format("%.2f", tax));

        // Berechnung des Bruttopreises
        double bruttoPrice = result + tax;
        // Ausgabe des Bruttopreises (Auf zwei Nachkommastellen gerundet durch String.format("%.2d", value))
        System.out.println("Bruttobetrag: " + String.format("%.2f", bruttoPrice));

    }

}
