package spielwiese;

import helper.Service;

public class DreiGewinnt {
    private enum Player { PLAYER1, PLAYER2 }

    private static final String EMPTY = " ";
    private static final String SYMBOL_1 = "X";
    private static final String SYMBOL_2 = "O";

    private static Player activePlayer = Player.PLAYER1;

    static void main() {
        game();
    }

    private static void game() {
        int rows = Service.readInt("Wie viele Kugeln passen in eine Röhre? ");
        int cols = Service.readInt("Wie viele Röhren hat das Spielfeld? ");

        String[][] board = Service.fillTwoDimensionalArray(rows, cols, EMPTY);
        int turn = 0;

        drawBoard(board);

        while (turn < rows * cols) {
            System.out.println("Spieler " + (activePlayer == Player.PLAYER1 ? "1" : "2") + " ist dran");
            int column = Service.readInt("Welche Röhre? ") - 1;

            if (isOutOfBound(board, column)) {
                Service.error("\nRöhre nicht im Feld\n");
            } else if (dropBall(board, column, symbolOf(activePlayer))) {
                turn++;
                drawBoard(board);
                switchPlayer();
            } else {
                Service.error("\nRöhre schon voll\n");
            }
        }

        int pointsPlayer1 = calculatePoints(board, SYMBOL_1);
        int pointsPlayer2 = calculatePoints(board, SYMBOL_2);

        output(pointsPlayer1, pointsPlayer2);
    }

    private static String symbolOf(Player player) {
        return player == Player.PLAYER1 ? SYMBOL_1 : SYMBOL_2;
    }

    private static boolean dropBall(String[][] board, int column, String symbol) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column].equals(EMPTY)) {
                board[i][column] = symbol;
                return true;
            }
        }
        return false;
    }

    private static void drawBoard(String[][] board) {
        int cols = board[0].length;
        String line = "-".repeat(cols * 4 + 1);

        System.out.println("\nBrett:");

        System.out.print("  ");
        for (int j = 1; j <= cols; j++) {
            System.out.print(j + "   ");
        }

        System.out.println("\n" + line);

        for (String[] row : board) {
            System.out.print("| ");
            for (String cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n" + line);
        }
        System.out.println();
    }

    private static int calculatePoints(String[][] board, String symbol) {
        int points = 0;
        int cols = board[0].length;

        // waagrecht
        for (String[] row : board) {
            int run = 0;
            for (int j = 0; j < cols; j++) {
                if (symbol.equals(row[j])) {
                    run++;
                    if (run == 3) {
                        points++;
                    }
                } else {
                    run = 0;
                }
            }
        }

        // senkrecht
        for (int j = 0; j < cols; j++) {
            int run = 0;
            for (String[] row : board) {
                if (symbol.equals(row[j])) {
                    run++;
                    if (run == 3) {
                        points++;
                    }
                } else {
                    run = 0;
                }
            }
        }

        return points;
    }

    private static boolean isOutOfBound(String[][] board, int column) {
        return column < 0 || column >= board[0].length;
    }

    private static void switchPlayer() {
        activePlayer = activePlayer == Player.PLAYER1 ? Player.PLAYER2 : Player.PLAYER1;
    }

    private static void output(int pointsPlayer1, int pointsPlayer2) {
        System.out.println("Spieler 1: " + pointsPlayer1 + " Punkte");
        System.out.println("Spieler 2: " + pointsPlayer2 + " Punkte");

        if (pointsPlayer1 == pointsPlayer2) {
            System.out.println("Unentschieden");
        } else {
            int winner = pointsPlayer1 > pointsPlayer2 ? 1 : 2;
            System.out.println("Der Gewinner ist Spieler " + winner);
        }
    }
}