package spielwiese;

import helper.Service;

import java.util.HashMap;
import java.util.Map;

public class BoeseEins {
    protected enum Player {PLAYER1, PLAYER2}

    protected static final int min = 1;
    protected static final int max = 6;
    protected static final int roundGoal = 11;
    protected static final int goal = 100;

    protected static Player activePlayer = Player.PLAYER1;

    static void main() {
        // initialize player as map<PLayer, Integer>; Integer = points
        Map<Player, Integer> points = initPlayer();

        do {
            // before game output
            beforeGameOutput(activePlayer);

            // add points from round to player
            points.put(activePlayer, round());

            // after round output
            afterRoundOutput(activePlayer, points.get(activePlayer));

            // if one player has won!
            if (points.get(activePlayer) >= goal) {
                afterGameOutput(activePlayer);
            }

            // switch active player
            activePlayer = activePlayer.equals(Player.PLAYER1) ? Player.PLAYER2 : Player.PLAYER1;
        } while (Service.readString("\nNochmal spielen? (y | n) ").equals("y"));

    }

    static Map<Player, Integer> initPlayer() {
        return new HashMap<>() {
            {
                put(Player.PLAYER1, 0);
                put(Player.PLAYER2, 0);
            }
        };
    }

    static int round() {
        boolean continueGame;
        int sum = 0;
        int diceCount = 0;

        do {
            // after each round continueGame is reset
            continueGame = false;

            // track how many dices were rolled this round
            diceCount++;

            // get dice roll
            int diceRoll = getDiceRoll();

            // output last dice roll
            inRoundOutput(diceCount, diceRoll, sum);

            // if dice is "1" return 0
            if (diceRoll == 1) return 0;

            // else, add dice to sum
            sum += diceRoll;

            // if round goal is reached, another dice roll is optional
            if (sum >= roundGoal) {
                continueGame = Service.readString("\nWeiter würfeln? (y | n) ").equals("y");
            }
        } while (sum < roundGoal || continueGame);

        return sum;
    }

    static int getDiceRoll() {
        return Service.getRandomInt(min, max);
    }

    static void beforeGameOutput(Player activePlayer) {
        System.out.println("Spieler " +  (activePlayer.equals(Player.PLAYER1) ? "Player 1" : "Player 2"));
    }

    static void inRoundOutput(int diceCount, int diceRoll, int sum) {
        System.out.println(diceCount + ". " + diceRoll + "; Summe: " + sum);
    }

    static void afterRoundOutput(Player player, int sum) {
        System.out.println("Die Summe von Spieler (" + getPLayerAsString(player) + ") nach der Runde ist: " + sum + "\n");
    }

    static void afterGameOutput(Player winner) {
        System.out.println("Der Gewinner ist: " + getPLayerAsString(winner));
    }

    static String getPLayerAsString(Player player) {
        return player.equals(Player.PLAYER1) ? "Player 1" : "Player 2";
    }

}
