package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuehrerschein {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Alter: ");
        int alter = Integer.parseInt(reader.readLine());

        if ( alter < 14 ) {
            System.out.println("Du darfst Bobby-Car oder Fahrrad fahren.");
        } else if ( alter < 16 ) {
            System.out.println("Du darfst schon 50er fahren.");
        } else if ( alter < 18 ) {
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
        } else {
            System.out.println("Du darfst jetzt auch Auto fahren.");
        }

    }

}
