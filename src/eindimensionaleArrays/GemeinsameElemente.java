package eindimensionaleArrays;

import helper.Service;

import java.util.ArrayList;

public class GemeinsameElemente {

    static void main() {
        int length = Service.readInt("Wie viele Werte? ");
        double[] firstArray = fillFirstArray(length);
        double[] secondArray = fillSecondArray(length);
        double[] duplicates = getOnlyDuplicates(firstArray, secondArray);
        output(duplicates);
    }

    private static double[] fillFirstArray(int length) {
        return Service.fillDoubleArray(length, "Wert ", " eingeben: ", 1);
    }

    private static double[] fillSecondArray(int length) {
        return Service.fillDoubleArray(length, "Wert ", " eingeben: ", 2);
    }

    private static double[] getOnlyDuplicates(double[] firstArray, double[] secondArray) {
        ArrayList<Double> combinedArray = new ArrayList<>();

        ArrayList<Double> first = new  ArrayList<>();
        ArrayList<Double> second = new  ArrayList<>();

        for (int i = 0; i < firstArray.length; i++) {
            first.add(firstArray[i]);
            second.add(secondArray[i]);
            combinedArray.add(first.get(i));
            combinedArray.add(second.get(i));
        }

        ArrayList<Double> result = new ArrayList<>();
        for (int  i = 0; i < first.size(); i++) {
            if (first.contains(combinedArray.get(i)) &&  second.contains(combinedArray.get(i)) && !result.contains(combinedArray.get(i))) {
                result.add(combinedArray.get(i));
            }
        }

        double[] arr =  new double[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }

    private static void output(double[] arr) {
        System.out.println("Doppelte Werte");
        for (double v : arr) {
            System.out.println(v);
        }
    }


}
