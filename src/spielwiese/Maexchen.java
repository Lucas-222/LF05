package spielwiese;

import helper.Service;

public class Maexchen {

    static void main() {
        int firstDice = Service.readInt("Erster Würfel: ");
        int secondDice = Service.readInt("Zweiter Würfel: ");

        output(checkWin(firstDice, secondDice));
    }

    public static int checkWin(int firstDice, int secondDice) {
        int winSum;

        if (isMaexchen(firstDice, secondDice)) {
            winSum = 1000;
        } else if (isPasch(firstDice, secondDice)) {
            winSum = 100 * firstDice;
        } else {
            winSum = 10 * (firstDice + secondDice);
        }

        return winSum;
    }

    static void output(int winSum) {
        System.out.println("Der Gewinn ist: " + winSum);
    }

    static boolean isMaexchen(int firstDice, int secondDice) {
        return (firstDice == 1 && secondDice == 2) || (firstDice == 2 && secondDice == 1);
    }

    static boolean isPasch(int firstDice, int secondDice) {
        return firstDice == secondDice;
    }

}
