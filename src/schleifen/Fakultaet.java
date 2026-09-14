package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultaet {

    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Zahl: ");
        int number = Integer.parseInt(reader.readLine());

        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
            System.out.println(i + "! = " + sum);
        }

    }

}
