package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit {

    static void main() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("In Celsius: ");
        double cel = Double.parseDouble(reader.readLine());

        double result = (cel * ((double) 9 /5)) + 32;
        System.out.println(result);

    }

}
