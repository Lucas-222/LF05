package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenberechnung {

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wie viele Punkte können erreicht werden? ");
        double maxPoints = Double.parseDouble(reader.readLine());

        System.out.print("Wie viele Punkte hast du erreicht? ");
        double actualPoints = Double.parseDouble(reader.readLine());

        double percentage = maxPoints / 100 * actualPoints;
        String mark = "";

        if ( percentage >= 92 ) {
            mark = "1";
        } else if ( percentage >= 81 ) {
            mark = "2";
        } else if ( percentage >= 67 ) {
            mark = "3";
        } else if ( percentage >= 50 ) {
            mark = "4";
        } else if ( percentage >= 30 ) {
            mark = "5";
        } else {
            mark = "6";
        }

        if ( actualPoints > maxPoints ) {
            System.out.println("Die Anzahl der erreichten Punkte ist größer als die maximalen Punkte");
        } else {
            System.out.println("Du hast " + percentage + "%  und damit die Note " + mark + " erreicht.");
        }
    }

}
