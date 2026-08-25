package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

    static void main() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Welche Note hast du in LF01? ");
        double mark1 = Double.parseDouble(reader.readLine());

        System.out.print("Welche Note hast du in LF02? ");
        double mark2 = Double.parseDouble(reader.readLine());

        System.out.print("Welche Note hast du in LF03? ");
        double mark3 = Double.parseDouble(reader.readLine());

        System.out.print("Welche Note hast du in LF04? ");
        double mark4 = Double.parseDouble(reader.readLine());

        System.out.print("Welche Note hast du in LF05? ");
        double mark5 = Double.parseDouble(reader.readLine());

        double result = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        System.out.println(result);


    }

}
