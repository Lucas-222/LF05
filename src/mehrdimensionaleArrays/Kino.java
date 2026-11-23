package mehrdimensionaleArrays;

import helper.Service;

public class Kino {
    private static final String reserved = "X";
    private static final String free = "O";

    static void main() {
        String[][] saal = erzeugenSaal();

        while (true) {
            switch (Service.readString("\nWas möchtest du machen? [r = reservieren, s = stornieren, b = beenden] ")) {
                case "r": reservierungAendern(saal, reserved); break;
                case "s": reservierungAendern(saal, free); break;
                case "b": return;
                default: Service.error("Keine valide Option angegeben bitte nochmal\n"); break;
            }
        }
    }

    private static String[][] erzeugenSaal() {
        System.out.println("Eingabe der größe des Kinos");

        int rows = Service.readInt("Anzahl Reihen: ");
        int seats = Service.readInt("Anzahl Sitze pro Reihe: ");

        return Service.fillTwoDimensionalArray(rows, seats, free);
    }

    private static void reservierungAendern(String[][] saal, String symbol) {
        do {
            int row = Service.readInt("\nWelche Reihe? ") - 1;
            int seat = Service.readInt("Welcher Sitz? ") - 1;

            if (isOutOfBound(saal, row, seat)) {
                Service.error("Platz außerhalb des Saales!\n");
            } else if (saal[row][seat].equals(symbol)) {
                Service.error("Platz ist bereits " + (symbol.equals(free) ? "nicht " : "") + "reserviert");
            } else {
                saal[row][seat] = symbol;
            }

            Service.printTwoDimensionalArray("\nSaal:", saal);

        } while (Service.readString("\nWeitere" + (symbol.equals(reserved) ? "n Platz reservieren? " : "Reservierung stornieren ")).equals("y"));
    }

    private static boolean isOutOfBound(String[][] saal, int rows, int seats) {
        return rows >= saal.length || seats >= saal[0].length || rows < 0 || seats < 0;
    }

}
