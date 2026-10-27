package spielwiese;

import helper.Service;

import java.util.ArrayList;
import java.util.Objects;

public class Mastermind {
    protected static final int countNumbers = 4;
    protected static final int tries = 10;
    protected static final int min = 0;
    protected static final int max = 9;

    protected static int hits = 0;
    protected static int fullHits = 0;

    static void main() {
        gameLoop();
    }

    static void gameLoop() {
        do {
            preGameOutput();
            ArrayList<Integer> winners = generateNumbers();

            for (int i = 0; i < tries; i++) {
                ArrayList<Integer> guesses = getGuesses(i+1);
                afterRoundOutput(winners, guesses);

                if (fullHits == countNumbers) {
                    afterGameOutput(i);
                    i = tries;
                }

                hits = 0;
                fullHits = 0;
            }
        } while (Service.readString("\nNochmal spielen? ").equals("y"));
    }

    static ArrayList<Integer> getGuesses(int currentTry) {
        ArrayList<Integer> guesses = new ArrayList<>();

        String guess = Service.readString("Versuch " + currentTry + ": Rate: ");

        for (int i = 0; i < countNumbers; i++) {
            guesses.add(guess.charAt(i) - '0');
        }

        return guesses;
    }

    static void afterRoundOutput(ArrayList<Integer> guesses, ArrayList<Integer> winners) {
        isCorrect(guesses, winners);

        System.out.println("Treffer: " + hits);
        System.out.println("Volltreffer: " + fullHits + "\n");
    }

    static void afterGameOutput(int gebrauchteVersuche) {
        System.out.println("Geschafft!!! Gebrauchte Versuche: " + (gebrauchteVersuche + 1));
    }

    static void preGameOutput() {
        System.out.println("Anzahl Ziffern = " + countNumbers);
        System.out.println("Maximale Versuche = " + tries);
        System.out.println();
    }

    static void isCorrect(ArrayList<Integer> guesses, ArrayList<Integer> winners) {
        for (int i = 0; i < countNumbers; i++) {
            if (Objects.equals(guesses.get(i), winners.get(i))) {
                fullHits++;
            } else if (winners.contains(guesses.get(i))) {
                hits++;
            }
        }
    }

    static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < countNumbers; i++) {
            int number = Service.getRandomInt(min, max);
            if (!numbers.contains(number)) {
                numbers.add(number);
            } else {
                i--;
            }
        }

        return numbers;
    }

}
