package eindimensionaleArrays;

import helper.Service;

public class Verschieben {

    static void main() {
        double[] array = fillArray();
        double[] result = transform(array);
        output(result);
    }

    private static double[] fillArray() {
        int length = Service.readInt("Wie viele Werte soll das Array enthalten? ");
        return Service.fillDoubleArray(length, "Wert ", " eingeben: ", 1);
    }

    private static double[] transform(double[] array) {
        int moveCount = Service.readInt("Um wie viele Stellen soll das Array verschoben werden? ");
        String direction = Service.readString("Soll das Array nach Rechts [r] oder nach Links [l] verschoben werden? ");

        int n = array.length;
        double[] result = new double[n];
        if (n == 0) {
            return result;
        }

        int shift = moveCount % n;

        for (int i = 0; i < n; i++) {
            if (direction.equals("r")) {
                result[(i + shift) % n] = array[i];
            } else if (direction.equals("l")) {
                result[(i - shift + n) % n] = array[i];
            }
        }

        return result;
    }

    private static void output(double[] result) {
        System.out.println("Array mit verschobenen Werten");
        for (double v : result) {
            System.out.println(v);
        }
    }

}
