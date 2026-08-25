package aufgabenMitEingabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    static void main() throws IOException {
        System.out.println("Hello World");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Eingabe : ");

        String s  = reader.readLine();

        System.out.println(s);

    }

}
