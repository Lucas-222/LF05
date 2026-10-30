package schleifen;

import helper.Service;

public class Schaltjahr {
    protected static int startJahr;
    protected static int endJahr;

    static void main() {
        do {
            input();
            calculate();
        } while (Service.readString("\nNochmal spielen? (y | n) ").equals("y"));
    }

    static void calculate() {
        for (int i = startJahr; i <= endJahr; i++) {
            if (isSchaltjahr(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isSchaltjahr(int jahr) {
        return (jahr % 100 == 0 && jahr % 400 == 0) || (jahr % 100 != 0 && jahr % 4 == 0);
    }

    static void input() {
        startJahr = Service.readInt("Bei welchem Jahr soll die Berechnung starten? ");
        endJahr = Service.readInt("Bis zu welchem Jahr soll die Berechnung gehen? ");
    }

}
