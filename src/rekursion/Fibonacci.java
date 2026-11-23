package rekursion;

public class Fibonacci {

    static void main() {
        fibonacci(0, 30, 1, 0);
    }

    static int fibonacci(int i, int max, int current, int last) {
        int number = current + last;
        i++;

        // for every number in the sequence
        System.out.println(i + ": " + number);

        return i < max ? fibonacci(i, max, number, current) : number;
    }

}
