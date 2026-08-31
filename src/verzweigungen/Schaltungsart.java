package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schaltungsart {

    static void main(String[] args) throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Welche Art von Schaltung? [P = Parallel, R = Reihen] ");
        String art = reader.readLine();

        System.out.print("Widerstand 1: ");
        double widerstand1 = Double.parseDouble(reader.readLine());

        System.out.print("Widerstand 2: ");
        double widerstand2 = Double.parseDouble(reader.readLine());

        double result = 0;

        if ( art.equals("P") ) {
            result = (widerstand1 * widerstand2) / (widerstand1 + widerstand2);
        } else if ( art.equals("R") ) {
            result = widerstand1 + widerstand2;
        }

        System.out.println("Gesamtwiderstand = " + result);

    }

}
