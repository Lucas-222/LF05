package schleifen;

import helper.Service;

import java.io.IOException;

public class Sparvertrag {
    protected static double startKapital;
    protected static double zinssatzProzent;
    protected static int laufzeit;

    static void main() throws IOException {
        do {
            input();
            show();
        } while (Service.readString("\nNochmal spielen? (y | n) ").equals("y"));
    }

    static void input() {
        startKapital = Service.readDouble("Bitte Kapital angeben: ");
        zinssatzProzent =  Service.readDouble("Bitte Zinssatz angeben: ");
        laufzeit = Service.readInt("Laufzeit: ");
    }

    static void show() {
        System.out.println("Jahr\t\tAnfangskapital\t\t\tZinsbetrag\t\tJahresendbetrag");

        for (int i = 1; i <= laufzeit; i++) {
            double zinsen = startKapital / 100 * zinssatzProzent;
            double endKapital = startKapital + zinsen;

            System.out.println(
                    i + "\t\t\t" +
                    Service.round(startKapital, 2) + "\t\t\t\t\t" +
                    Service.round(zinsen, 2) + "\t\t\t" +
                    Service.round(endKapital, 2)
            );

            startKapital = endKapital;
        }
    }

}
