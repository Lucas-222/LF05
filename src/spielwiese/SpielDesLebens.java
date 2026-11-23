package spielwiese;

import helper.Service;

public class SpielDesLebens {

    static void main() {

    }

    private static void game() {
        String[][] board = getBoard();

        setStartingFields(board);

        do {
            round(board);
        } while (Service.readString("Noch eine Runde spielen? ").equals("y"));
    }

    private static void round(String[][] board) {

    }

    private static int getCountNeighbours(String[][] board, int row, int column) {
        return 0;
    }

    private static String[][] getBoard() {
        int size = Service.readInt("Größe: ");
        return Service.fillTwoDimensionalArray(size, size, " - ");
    }

    private static void showBoard(String[][] board) {
        Service.printTwoDimensionalArray(board);
    }

    private static void setStartingFields(String[][] board) {
        do {
            int row = Service.readInt("Bitte Zeile angeben: ");
            int column = Service.readInt("Bitte Spalte angeben: ");

            if (board[row][column].equals(" - ")) {
                board[row][column] = " O ";
                showBoard(board);
            } else {
                Service.error("Feld ist bereits belegt");
            }

        } while (Service.readString("Noch ein Feld setzen? (y | n): ").equals("y"));
    }

}
