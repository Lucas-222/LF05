package schleifen;

import helper.Service;

public class Bevoelkerung {
    protected static double anfangsPopulation;
    protected static double zuwachsProzent;
    protected static int laufzeit;
    protected static int nachkommastellen;

    static void main() {
        do {
            System.out.println("ü?äß2w23");
            input();
            show();
        } while (Service.readString("\nNochmal spielen? (y | n) ").equals("y"));
    }

    static void input() {
        anfangsPopulation = Service.readDouble("Bitte die aktuelle Populationsgröße in Milliarden angeben: ");
        zuwachsProzent = Service.readDouble("Bitte den jährlichen Zuwachs in Prozent eingeben: ");
        laufzeit = Service.readInt("Bitte die Laufzeit der Prognose in Jahren eingeben: ");
        nachkommastellen = Service.readInt("Bitte die Anzahl der anzuzeigenden Nachkommastellen eingeben: ");
    }

    static void show() {
        double start = anfangsPopulation;

        System.out.println("Jahr\t\tAnfangspopulation\t\tZuwachs\t\tEndpopulation");

        for (int i = 1; i <= laufzeit; i++) {
            double zuwachs = anfangsPopulation / 100 * zuwachsProzent;
            double endPopulation = anfangsPopulation + zuwachs;

            System.out.println(
                    Service.round(laufzeit, nachkommastellen) + "\t\t\t" +
                    Service.round(anfangsPopulation, nachkommastellen) + "\t\t\t\t" +
                    Service.round(zuwachs, nachkommastellen) + "\t\t" +
                    Service.round(endPopulation, nachkommastellen) + (start / 100 * 20 + start < endPopulation ? "*" : "")
            );

            anfangsPopulation = endPopulation;
        }
    }

}
