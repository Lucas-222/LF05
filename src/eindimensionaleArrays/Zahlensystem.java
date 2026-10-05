package eindimensionaleArrays;

import java.util.ArrayList;
public class Zahlensystem {

    static void main() {
        // test
        System.out.println(dezimalZuDual(127));
        System.out.println(dualZuDezimal(1010));
    }

    public static int dezimalZuDual(int dezimal) {
        ArrayList<Integer> dual = new ArrayList<>();

        while (dezimal > 0) {
            int rest = dezimal % 2;
            dezimal /= 2;
            dual.add(rest);
        }

        StringBuilder s = new  StringBuilder();
        for (Integer integer : dual) {
            s.append(integer);
        }

        return Integer.parseInt(s.toString());
    }

    public static int dualZuDezimal(int dual) {
        int dezimal = 0;
        String s = String.valueOf(dual);

        for (int i = 0; i < s.length(); i++) {
            int ziffer = s.charAt(i) - '0';
            int stelle = s.length() - 1 - i;
            dezimal += ziffer * (int) Math.pow(2, stelle);
        }

        return dezimal;
    }

}
