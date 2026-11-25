package rekursion;

public class Fibonacci {

    static void main() {
        System.out.println(fibonacci(1, 50, 0, 1));
    }

    static int fibonacci(int i, int max, int last, int current) {
        System.out.println(i + ": " + (last + current));
        return i < max ? fibonacci(i+1, max, current + last, current) : current + last;
    }

}
