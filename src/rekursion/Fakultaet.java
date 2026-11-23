package rekursion;

import helper.Service;

public class Fakultaet {

    static void main() {
        System.out.println(loop(1, 1, Service.readInt("Bis zu welcher Zahl? ")));
    }

    static int loop(int sum, int i, int number) {
        sum *= i;
        i++;
        return i <= number ? loop(sum, i, number) : sum;
    }

}
