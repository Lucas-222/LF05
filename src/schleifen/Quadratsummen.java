package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsummen {

    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Zahl: ");
        int number = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= number; i++) {
            System.out.println(i + "^2 = " + Math.pow(i, 2));
        }

    }

}
