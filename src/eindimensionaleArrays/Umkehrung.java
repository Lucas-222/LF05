package eindimensionaleArrays;

import helper.Service;

public class Umkehrung {

    static void main() {
        String[] array = fillArray();
        String[] reversedArray =  reverse(array);
        output(reversedArray);
    }

    private static String[] fillArray() {
        int length = Service.readInt("Wie viele Buchstaben soll das Array enthalten? ");
        return Service.fillStringArray(length, "Buchstabe ", " eingeben: ", 1);
    }

    private static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }

    private static void output(String[] reversedArray) {
        System.out.println("Umgedrehtes Array");

        for (String v : reversedArray) {
            System.out.print(v + "\t\t");
        }

    }


}
