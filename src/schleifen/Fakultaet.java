package schleifen;

import helper.Service;

public class Fakultaet {

    static void main() {
        int number = Service.readInt("Zahl: ");
        int sum = 1;

        for (int i = 1; i <= number; i++) {
            sum *= i;
            System.out.println(i + "! = " + sum);
        }

    }

}
