package spielwiese;

import helper.Service;

public class Zahlraten {

    static void main() {
        guess();
    }

    static void guess() {
        int countGuesses = 0;

        int min = 1;
        int max = 100;

        int guess = max - ((max - min + 1) / 2);

        boolean correct = false;

        while (!correct) {
            countGuesses++;

            System.out.print("Ist die Zahl kleiner als " + guess + "(y, n, e)? ");
            String isSmaller = Service.readString();

            if (isSmaller.equals("y")) {
                max = guess;
                guess = max - ((max - min + 1) / 2);
            } else if (isSmaller.equals("n")) {
                min = guess;
                guess = min + ((max - min + 1) / 2);
            } else {
                correct = true;
            }

        }

        System.out.println("\nZahl ist " + guess);
        System.out.println("Erraten in " +  countGuesses + " Fragen");
    }

}
