package spielwiese;

import helper.Service;

public class Lotto {
    protected static final int min = 1;
    protected static final int max = 49;
    protected static final int size = 6;
    protected static final boolean withPuttingBack = false;

    static void main() {
        int[] numbers = generateNumbers();
        int[] sorted = Service.sort(numbers);
        int extra = generateExtra(numbers);
        output(sorted, extra);
    }

    static void output(int[] numbers, int extra) {
        System.out.println("Mit zurücklegen: " + (withPuttingBack ? "ja" : "nein"));
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

            if (!withPuttingBack && Service.contains(numbers, temp)) {
                i--;
            } else {
                numbers[i] = temp;
            }
        }

        return numbers;
    }

    static int generateExtra(int[] numbers) {
        int temp = Service.getRandomInt(min, max);
        return !withPuttingBack && Service.contains(numbers, temp) ? generateExtra(numbers) : temp;
    }

}
