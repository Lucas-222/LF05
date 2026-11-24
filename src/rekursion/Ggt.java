package rekursion;

import helper.Service;

public class Ggt {

    static void main() {
        int number1 = Service.readInt("Zahl 1: ");
        int number2 = Service.readInt("Zahl 2: ");

        System.out.println(getGgt(number1, number2));
    }

    static int getGgt(int number1, int number2) {
        return number1 % number2 == 0 ? number2 : getGgt(number2, number1 % number2);
    }

}
