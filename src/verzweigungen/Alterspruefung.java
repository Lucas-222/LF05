package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {
    public enum ages {UNDERAGE, OFAGE}

    static void main() throws IOException {
        // Erstellung des BufferedReaders
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Eingabe des Alters
        System.out.print("Gib dein Alter ein: ");
        int age = Integer.parseInt(reader.readLine());

        // Altersüberprüfung
        if ( !isAgeInRange(age) ) {
            System.err.println("Das Alter liegt außerhalb des erlaubten Bereichs");
            return;
        }

        // Set output
        String output = setAge(age) == ages.UNDERAGE ? "Minderjährig" : "Volljährig";
        System.out.println(output);

    }

    public static ages setAge(int age) {
        return age < 18 ? ages.UNDERAGE : ages.OFAGE;
    }

    public static boolean isAgeInRange(int age) {
        return age >= 0 && (age <= 99);
    }

}
