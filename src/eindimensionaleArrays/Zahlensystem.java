package eindimensionaleArrays;

public class Zahlensystem {

    public static int dezimalZuDual(int dezimal) {
        if (dezimal == 0) {
            return 0;
        }

        StringBuilder s = new StringBuilder();
        while (dezimal > 0) {
            s.append(dezimal % 2);
            dezimal /= 2;
        }

        return Integer.parseInt(s.reverse().toString());
    }

    public static String dezimalZuDual(String dezimal) {
        return String.valueOf(dezimalZuDual(Integer.parseInt(dezimal)));
    }

    public static int dualZuDezimal(int dual) {
        int dezimal = 0;

        for (char c : String.valueOf(dual).toCharArray()) {
            dezimal = dezimal * 2 + (c - '0');
        }

        return dezimal;
    }

    public static String dualZuDezimal(String dual) {
        return String.valueOf(dualZuDezimal(Integer.parseInt(dual)));
    }

}
