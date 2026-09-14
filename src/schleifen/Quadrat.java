package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrat {

    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Größe: ");
        int length = Integer.parseInt(reader.readLine());

        fullLine(length);
        startAndEnd(length);
        fullLine(length);
    }

    private static void fullLine(int length) {
        System.out.print("\n");
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
    }

    private static void startAndEnd(int length) {
        for (int i = 1; i <= length - 2; i++) {
            System.out.print("\n");
            System.out.print("*");
            for (int j = 1; j <= length - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }

}
