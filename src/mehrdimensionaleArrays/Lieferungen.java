package mehrdimensionaleArrays;

import helper.Service;

public class Lieferungen {

    static void main() {
        String[] artikel = erfassenArtikel();
        String[] kunden = erfassenKunden();

        System.out.println("\nMonat 1");
        double[][] month1 = getNumbers(artikel, kunden);

        System.out.println("\nMonat 2");
        double[][] month2 = getNumbers(artikel, kunden);

        double[][] sum = sum(month1, month2);

        output(artikel, kunden, sum);
    }

    private static String[] erfassenArtikel() {
        int length = Service.readInt("Wie viel Artikel? ");
        return Service.fillStringArray(length, "Name von Artikel ", "? ", 1);
    }

    private static String[] erfassenKunden() {
        int length = Service.readInt("\nWie viel Kunden? ");
        return Service.fillStringArray(length, "Name von Kunde", "? ", 1);
    }

    private static double[][] getNumbers(String[] artikel, String[] kunden) {
        double[][] numbers =  new double[artikel.length][kunden.length];

        for (int i = 0; i < artikel.length; i++) {
            for (int j = 0; j < kunden.length; j++) {
                numbers[i][j] = Service.readDouble("Preis für Artikel " + artikel[i] + " und Kunde " + kunden[j] + "? ");
            }
        }

        return numbers;
    }

    private static double[][] sum(double[][] month1, double[][] month2) {
        double[][] sum = new double[month1.length][month2.length];

        for (int i = 0; i < month1.length; i++) {
            for (int j = 0; j < month2.length; j++) {
                sum[i][j] = month1[i][j] + month2[i][j];
            }
        }

        return sum;
    }

    private static void output(String[] artikel, String[] kunden, double[][] sum) {
        System.out.print("Summe ");

        for (String kunde : kunden) {
            System.out.print(kunde + " ");
        }
        System.out.println();

        for (int i = 0; i < sum.length; i++) {
            System.out.print(artikel[i] + " ");
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

}
