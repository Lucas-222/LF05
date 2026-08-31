package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Gewicht (kg): ");
        double gewicht = Double.parseDouble(reader.readLine());

        System.out.print("Größe (cm): ");
        double length = Double.parseDouble(reader.readLine());

        System.out.println("Geschlecht [m = männlich, f = weiblich] ");
        String geschlecht = reader.readLine();

        double bmi = gewicht / (length * length);

        if ( ( geschlecht.equals("m") && bmi < 20 ) || ( geschlecht.equals("f") && bmi < 19) ) {
            System.out.println("Untergewicht.");
        } else if ( ( geschlecht.equals("m") && bmi < 25 ) || ( geschlecht.equals("f") && bmi < 24) ) {
            System.out.println("Normalgewicht");
        } else if ( ( geschlecht.equals("m") && bmi < 30 ) || ( geschlecht.equals("f") && bmi < 30) ) {
            System.out.println("Übergewicht");
        } else if ( ( geschlecht.equals("m") && bmi < 40 ) || ( geschlecht.equals("f") && bmi < 40) ) {
            System.out.println("Adipositas");
        } else {
            System.out.println("Starke Adipositas");
        }

    }

}
