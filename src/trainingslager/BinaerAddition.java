package trainingslager;

import helper.Service;

public class BinaerAddition {

    static void main() {
        System.out.println("Gebe zwei dual Zahlen an");
        int number1 = Service.readInt("Erste Zahl: ");
        int number2 = Service.readInt("Zweite Zahl: ");

        if (containsNumberOtherThanOneAndZero(number1) || containsNumberOtherThanOneAndZero(number2)) {
            System.out.println("Zahl beinhaltet falsche Zeichen");
            return;
        }

        int result = add(number1, number2);
        output(result);
    }

    static boolean containsNumberOtherThanOneAndZero(int number) {
        String numberAsString = String.valueOf(number);

        for (int i = 0; i < numberAsString.length(); i++) {
            if (numberAsString.charAt(i) != '0' && numberAsString.charAt(i) != '1') {
                return true;
            }
        }

        return false;
    }

    static int add(int number1, int number2) {
        int number1AsDezimal = Service.dualZuDezimal(number1);
        int number2AsDezimal = Service.dualZuDezimal(number2);

        return Service.dezimalZuDual(number1AsDezimal + number2AsDezimal);
    }

    static void output(int result) {
        System.out.println("Das Ergebnis ist: " + result);
    }
}
