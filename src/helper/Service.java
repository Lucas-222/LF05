package helper;

import eindimensionaleArrays.Bubblesort;
import eindimensionaleArrays.Zahlensystem;
import helper.exceptions.InvalidInputException;
import methoden.Mathe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Service {

    public static String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new InvalidInputException("Die Eingabe konnte nicht verarbeitet werden");
        }
    }

    public static String readString(String message) {
        System.out.print(message);
        return readString();
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            error("Bitte eine Ganzzahl angeben");
            return readInt();
        }
    }

    public static int readInt(String message) {
        System.out.print(message);

        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            error("Bitte eine Ganzzahl angeben");
            return readInt(message);
        }
    }

    public static double readDouble() {
        try {
            return Double.parseDouble(readString());
        } catch (NumberFormatException e) {
            error("Bitte eine Kommazahl angeben");
            return readDouble();
        }
    }

    public static double readDouble(String message) {
        System.out.print(message);

        try {
            return Double.parseDouble(readString());
        } catch (NumberFormatException e) {
            error("Bitte eine Kommazahl angeben");
            return readDouble(message);
        }
    }

    public static String[] fillStringArray(int length, String textBeforeI, String textAfterI, int iModifier) {
        if (length <= 0 || textBeforeI == null || textAfterI == null) {
            throw new InvalidInputException("Bitte eine positive Ganzzahl angeben");
        }

        String[] arr = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print(textBeforeI + (i+iModifier) + textAfterI);
            arr[i] = readString();
        }

        return arr;
    }

    public static String[] fillStringArray(String message, int length, String textBeforeI, String textAfterI, int iModifier) {
        System.out.println(message);
        return fillStringArray(length, textBeforeI, textAfterI, iModifier);
    }

    public static int[] fillIntArray(int length, String textBeforeI, String textAfterI, int iModifier) {
        if (length <= 0 || textBeforeI == null || textAfterI == null) {
            throw new InvalidInputException("Bitte eine positive Ganzzahl angeben");
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print(textBeforeI + (i+iModifier) + textAfterI);
            arr[i] = readInt();
        }

        return arr;
    }

    public static int[]  fillIntArray(String message, int length, String textBeforeI, String textAfterI, int iModifier) {
        System.out.println(message);
        return fillIntArray(length, textBeforeI, textAfterI, iModifier);
    }

    public static double[] fillDoubleArray(int length, String textBeforeI, String textAfterI, int  iModifier) {
        if (length <= 0 || textBeforeI == null || textAfterI == null) {
            throw new InvalidInputException("Bitte eine positive Ganzzahl angeben");
        }

        double[] arr = new double[length];

        for (int i = 0; i < length; i++) {
            System.out.print(textBeforeI + (i+iModifier) + textAfterI);
            arr[i] = readDouble();
        }

        return arr;
    }

    public static double[] fillDoubleArray(String message, int length, String textBeforeI, String textAfterI, int iModifier) {
        System.out.println(message);
        return fillDoubleArray(length, textBeforeI, textAfterI, iModifier);
    }

    public static String[][] fillTwoDimensionalArray(int lengthOne, int lengthTwo, String text) {
        String[][] arr = new String[lengthOne][lengthTwo];

        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                arr[i][j] = text;
            }
        }

        return arr;
    }

    public static double[][] fillTwoDimensionalArray(int lengthOne, int lengthTwo, double number) {
        double[][] arr = new double[lengthOne][lengthTwo];

        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                arr[i][j] = number;
            }
        }

        return arr;
    }

    public static int[][] fillTwoDimensionalArray(int lengthOne, int lengthTwo, int number) {
        int[][] arr = new int[lengthOne][lengthTwo];

        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                arr[i][j] = number;
            }
        }

        return arr;
    }

    public static String[][] fillTwoDimensionalArray(String message, int lengthOne, int lengthTwo, String text) {
        System.out.println(message);
        return fillTwoDimensionalArray(lengthOne, lengthTwo, text);
    }

    public static double[][] fillTwoDimensionalArray(String message, int lengthOne, int lengthTwo, double number) {
        System.out.println(message);
        return fillTwoDimensionalArray(lengthOne, lengthTwo, number);
    }

    public static int[][] fillTwoDimensionalArray(String message, int lengthOne, int lengthTwo, int number) {
        System.out.println(message);
        return fillTwoDimensionalArray(lengthOne, lengthTwo, number);
    }

    public static void printTwoDimensionalArray(String[][] arr) {
        for (String[] spalte : arr) {
            for (String zeile : spalte) {
                System.out.print(zeile + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoDimensionalArray(double[][] arr) {
        for (double[] spalte : arr) {
            for (double zeile : spalte) {
                System.out.print(zeile + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoDimensionalArray(int[][] arr) {
        for (int[] spalte : arr) {
            for (int zeile : spalte) {
                System.out.print(zeile + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoDimensionalArray(String message, String[][] arr) {
        System.out.println(message);
        printTwoDimensionalArray(arr);
    }

    public static void printTwoDimensionalArray(String message, double[][] arr) {
        System.out.println(message);
        printTwoDimensionalArray(arr);
    }

    public static void printTwoDimensionalArray(String message, int[][] arr) {
        System.out.println(message);
        printTwoDimensionalArray(arr);
    }

    public static double getRandomDouble(double min, double max) {
        return (((max - min) * Math.random()) + min);
    }

    public static int getRandomInt(int min, int max) {
        return (int) (((max - min) * Math.random()) + min);
    }

    public static double[] sort(double[] arr) {
        return Bubblesort.sort(arr);
    }

    public static int[] sort(int[] arr) {
        return Bubblesort.sort(arr);
    }

    public static double[] reverse(double[] arr) {
        return Bubblesort.reverse(arr);
    }

    public static int[] reverse(int[] arr) {
        return Bubblesort.reverse(arr);
    }

    public static boolean contains(double[] arr, double number) {
        for (double i : arr) {
            if (i == number) {
                return true;
            }
        }

        return false;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }

        return false;
    }

    public static String dezimalZuDual(String dezimal) {
        return Zahlensystem.dezimalZuDual(dezimal);
    }

    public static int dezimalZuDual(int dezimal) {
        return Zahlensystem.dezimalZuDual(dezimal);
    }

    public static String dualZuDezimal(String dual) {
        return Zahlensystem.dualZuDezimal(dual);
    }

    public static int dualZuDezimal(int dual) {
        return Zahlensystem.dualZuDezimal(dual);
    }

    public static double round(double number, int nachKommaStellen) {
        return Mathe.runden(number, nachKommaStellen);
    }

    public static void error(String message) {
        error(message, 25);
    }

    public static void error(String message, int time) {
        System.err.println(message);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
