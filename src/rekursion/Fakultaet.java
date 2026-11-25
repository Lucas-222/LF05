package rekursion;

import helper.Service;

public class Fakultaet {

    static void main() {
        System.out.println(faculty(1, 1, Service.readInt("Bis zu welcher Zahl? ")));
    }

    static int faculty(int sum, int i, int number) {
        return i < number ? faculty(sum*i, i+1, number) : sum*i;
    }

}
