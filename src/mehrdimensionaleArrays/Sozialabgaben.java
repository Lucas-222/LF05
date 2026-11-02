package mehrdimensionaleArrays;

import helper.Service;

public class Sozialabgaben {
    private static final double krankenversicherung = 7;
    private static final double pflegeversicherung = 1.525;
    private static final double arbeitslosenversicherung = 1.2;
    private static final double rente = 9.3;

    static void main() {
        double[] gehaelter = getGehaelter();
        double[][] table = berechnenTabelle(gehaelter);
        output(table);
    }

    static double[] getGehaelter() {
        int length = Service.readInt("Wie viele Mitarbeiter? ");
        return Service.fillDoubleArray(length, "Wie viel verdient Mitarbeiter ", "? ", 1);
    }

    static double[][] berechnenTabelle(double[] gehaelter) {
        double[][] table = new double[gehaelter.length][5];

        for (int i = 0; i < gehaelter.length; i++) {
            table[i][0] = gehaelter[i];
            table[i][1] = gehaelter[i] / 100 * krankenversicherung;
            table[i][2] = gehaelter[i] / 100 * pflegeversicherung;
            table[i][3] = gehaelter[i] / 100 * arbeitslosenversicherung;
            table[i][4] = gehaelter[i] / 100 * rente;
        }

        return table;
    }

    static void output(double[][] table) {
        System.out.println("\nGehalt Krank Pflege Arbeit Rente");

        for (double[] doubles : table) {
            for (double aDouble : doubles) {
                System.out.print(Service.round(aDouble, 2) + " ");
            }
            System.out.println();
        }
    }

}
