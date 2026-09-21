package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sparvertrag {

    static void main() throws IOException {
        do {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Bitte Kapital angeben: ");
            double kapital = Double.parseDouble(reader.readLine());

            System.out.print("Bitte Zinssatz angeben: ");
            double zinssatz = Double.parseDouble(reader.readLine());

            System.out.print("Bitte Laufzeit in Jahren angeben: ");
            double laufzeit = Double.parseDouble(reader.readLine());

            double jahresbetrag;
            double zinsbetrag;

            System.out.println("Jahr\tAnfangskapital\tZinsbetrag\tJahresendbetrag");

            for (int i = 1; i <= laufzeit; i++) {
                zinsbetrag = kapital / 100 * zinssatz;
                jahresbetrag = kapital + zinsbetrag;

                System.out.println(i + "\t\t" + String.format("%.2f", kapital) + "\t\t\t" + String.format("%.2f", zinsbetrag) + "\t\t" + String.format("%.2f", jahresbetrag));

                kapital = jahresbetrag;
            }

            System.out.print("\nNochmal y | n: ");
            if (!reader.readLine().equals("y")) return;
        } while (true);
    }

}
