package rekursion;

import helper.Service;

public class Fakultaet {

    static void main() {
        System.out.println(loop(1, 1, Service.readInt("Bis zu welcher Zahl? ")));
    }

    static int loop(int sum, int i, int number) {
        return i < number ? loop(sum*i, i+1, number) : sum*i;
    }

}
