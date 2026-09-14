package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {

    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Limit: ");
        int number = Integer.parseInt(reader.readLine());

        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += 1 / Math.pow(2, i);
            System.out.println(i + "ter Durchlauf = " + sum);
        }

    }

}
