package eindimensionaleArrays;

import helper.Service;

public class Tonsignal {

    static void main(String[] args) {
        int[] array = fillArray();
        int[] geglaettet = glaetten(array);
        output(geglaettet);
    }

    private static int[] fillArray() {
        int length = Service.readInt("Wie viele Werte? ");
        return Service.fillIntArray(length, "Wert ", " eingeben: ", 1);
    }

    private static int[] glaetten(int[] array) {
        int[] geglaettet = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                geglaettet[i] = (array[i] + array[i + 1]) / 2;
            } else if (i == array.length - 1) {
                geglaettet[i] = (array[i] + array[i - 1]) / 2;
            } else {
                geglaettet[i] = (array[i - 1] + array[i] + array[i + 1]) / 3;
            }
        }

        return geglaettet;
    }

    private static void output(int[] array) {
        System.out.println("Geglättete Werte");
        for (int v : array) {
            System.out.print(v + " ");
        }
    }

}
