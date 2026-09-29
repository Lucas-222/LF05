package helper;

import helper.exceptions.InvalidInputException;

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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new InvalidInputException("Bitte eine Ganzzahl angeben");
        }
    }

    public static int readInt(String message) {
        System.out.print(message);
        return readInt();
    }

    public static double readDouble() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new InvalidInputException("Bitte eine Kommazahl oder Ganzzahl angeben");
        }
    }

    public static double readDouble(String message) {
        System.out.print(message);
        return readDouble();
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

}
