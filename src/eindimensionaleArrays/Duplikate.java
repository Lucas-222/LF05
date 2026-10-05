package eindimensionaleArrays;

import helper.Service;
import java.util.ArrayList;

public class Duplikate {

    static void main() {
        double[] array = fillArray();
        double[] result = removeDuplicates(array);
        output(result);
    }

    private static double[] fillArray() {
        int length = Service.readInt("Wie viele Werte soll das Array enthalten? ");
        return Service.fillDoubleArray(length, "Wert ", " eingeben: ", 1);
    }

    private static double[] removeDuplicates(double[] array) {
        ArrayList<Double> result = new ArrayList<>();

        for (double v : array) {
            if (!result.contains(v)) result.add(v);
        }

        double[] resultAsArray = new double[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultAsArray[i] = result.get(i);
        }

        return resultAsArray;
    }

    private static void output(double[] array) {
        System.out.println("Array ohne Duplikate");
        for (double v : array) {
            System.out.print(v + "\t\t");
        }

    }

}
