package eindimensionaleArrays;

public class Bubblesort {

    public static double[] sort(double[] arr) {
        double temp;
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = (int) temp;
                }

            }
        }
        return arr;
    }

    public static int[] sort(int[] arr) {
        int temp;
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static double[] reverse(double[] arr) {
        double[] reversed =  new double[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }

        return reversed;
    }

    public static int[] reverse(int[] arr) {
        int[] reversed =  new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }

        return reversed;
    }

}
