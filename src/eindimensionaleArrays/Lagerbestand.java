package eindimensionaleArrays;

import helper.Service;

public class Lagerbestand {

    static void main() {
        String[] articles = getArticles();
        double[] prices = getPriceBasedOnArticles(articles);
        int[] counts = getCountBasedOnArticles(articles);
        output(prices, counts);
    }

    private static String[] getArticles() {
        int length = Service.readInt("Wie viele unterschiedliche Artikel haben sie im Lager? ");
        return Service.fillStringArray(length, "Artikel ", " : ", 1);
    }

    private static double[] getPriceBasedOnArticles(String[] articles) {
        System.out.println("Erfassen sie jetzt den Einzelpreis jedes Artikels");

        double[] prices = new double[articles.length];

        for (int i = 0; i < prices.length; i++) {
            System.out.print("Preis des Artikels " +  articles[i] + ": ");
            prices[i] = Service.readDouble();
        }

        return prices;
    }

    private static int[] getCountBasedOnArticles(String[] articles) {
        System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikel");

        int[] counts = new int[articles.length];

        for (int i = 0; i < counts.length; i++) {
            System.out.print("Menge des Artikels " +  articles[i] + ": ");
            counts[i] = Service.readInt();
        }

        return counts;
    }

    private static void output(double[] prices, int[] counts) {
        int totalCount = 0;
        double totalPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            totalCount += counts[i];
            totalPrice += prices[i] * counts[i];
        }

        System.out.println("In ihrem Lager befinden sich " + totalCount + " Artikel im Wert von " + totalPrice + "€");

    }

}
