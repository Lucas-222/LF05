package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tankfuellung {

    static void main() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Liter: ");
        double liter = Double.parseDouble(reader.readLine());

        System.out.print("Nettopreis: ");
        double price = Double.parseDouble(reader.readLine());

        double result = liter * price;
        System.out.println("Nettopreis: " + String.format("%.2f", result));

        double tax = result * 0.19;
        System.out.println("Mehrwehrtsteuer: " + String.format("%.2f", tax));

        double finalresult = result + tax;
        System.out.println("Bruttobetrag: " + String.format("%.2f", finalresult));
    }

}
