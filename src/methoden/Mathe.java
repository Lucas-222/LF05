package methoden;

public class Mathe {

    public static double runden(double number, int nachKommaStellen) {
        double multiplicant = 1;
        for (int i = 0; i < nachKommaStellen; i++) {
            multiplicant*= 10;
        }

        return (Math.round(multiplicant * number)) / multiplicant;
    }

    public static double plus(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static double exponent(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static double wurzel(double number1, double number2) {
        return Math.pow(number1, 1 / number2);
    }

}
