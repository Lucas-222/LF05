package spielwiese;

import helper.Service;

public class Lotto {
    protected static final int min = 1;
    protected static final int max = 9;
    protected static final int size = 6;
    protected static final boolean withPuttingBack = false;

    static void main() {
        int[] numbers = generateNumbers();
        int extra = generateExtra(numbers);
        output(sort(numbers), extra);
    }

    static void output(int[] numbers, int extra) {
        System.out.println("Mit zurücklegen: " + withPuttingBack);
        System.out.print("Zahlen: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nZusatzzahl: " + extra);
    }

    static int[] generateNumbers() {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            int temp = Service.getRandomInt(min, max);

            if (!withPuttingBack && contains(numbers, temp)) {
                i--;
            } else {
                numbers[i] = temp;
            }
        }

        return numbers;
    }

    static int generateExtra(int[] numbers) {
        int temp = Service.getRandomInt(min, max);
        return !withPuttingBack && contains(numbers, temp) ? generateExtra(numbers) : temp;
    }

    static boolean contains(int[] array, int number) {
        for (int n : array) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }

    static int[] sort(int[] numbers) {
        return Service.sort(numbers);
    }

}
