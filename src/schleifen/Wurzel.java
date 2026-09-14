package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wurzel {

    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Startwert: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Endwert: ");
        int end = Integer.parseInt(reader.readLine());

        for (int i = start; i <= end; i++) {
            System.out.println("Zahl: " + i + ", Wurzel: " + Math.sqrt(i));
        }


    }


}
