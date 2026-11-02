package mehrdimensionaleArrays;

import helper.Service;

public class Kino {
    private static final String[][] saal = erzeugenSaal();

    static void main() {
        do {
            String option = Service.readString("Was möchtest du machen? [a = anzeigen, r = reservieren, s = stornieren]");

            switch (option) {
                case "a": anzeigenSaal(); break;
                case "r": reservierenPlatz(); break;
                case "s": stornierenPlatz(); break;
            }

        } while (Service.readString("Noch etwas machen? ").equals("y"));


    }

    private static String[][] erzeugenSaal() {
        int rows = Service.readInt("Anzahl Reihen: ");
        int seats = Service.readInt("Anzahl Sitze pro Reihe: ");

        String[][] saal = new String[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                saal[i][j] = "O";
            }
        }

        return saal;
    }

    private static void anzeigenSaal() {
        for (String[] row : saal) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    private static void reservierenPlatz() {
        do {
            int row = Service.readInt("Welche Reihe? ");
            int seat = Service.readInt("Anzahl Sitze pro Reihe? ");

            if (saal[row][seat].equals("O")) {
                saal[row][seat] = "X";
            } else {
                System.out.println("Platz bereits reserviert");
            }

            anzeigenSaal();
        } while (Service.readString("Noch ein Platz reservieren? ").equals("y"));

    }

    private static void stornierenPlatz() {
        int row = Service.readInt("Welche Reihe? ");
        int seat = Service.readInt("Anzahl Sitze pro Reihe? ");

        if (saal[row][seat].equals("X")) {
            saal[row][seat] = "0";
        } else {
            System.out.println("Platz nicht reserviert");
        }

        anzeigenSaal();

    }

}
