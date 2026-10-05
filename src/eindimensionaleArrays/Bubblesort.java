package eindimensionaleArrays;

public class Bubblesort {

    static void main() {
        double[] test = new double[] {4, 5, 8, 10, 12, 1};
        double[] sorted = sort(test);

        for (double v : sorted) {
            System.out.print(v + " ");
        }
    }

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

}
