package trainingslager;

import helper.Service;

import java.util.Arrays;

public class Ostern {

    static void main() {
        int start = Service.readInt("Anfangsjahr: ");
        int end = Service.readInt("Endjahr: ");

        for (int i = start; i <= end; i++) {
            System.out.println(Arrays.toString(getOstern(i)));
        }
    }

    public static int[] getOstern(int year) {
        int day = 0;
        int month;
        int m = getM(year);
        int n = getN(year);

        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + m) % 30;
        int e = (2 * b + 4 * c + 6 * d + n) % 7;

        int march = 22 + d + e;
        int april = d + e - 9;

        if (march <= 31) {
            day = march;
            month = 3;
        } else {
            month = 4;
            if (isTwentySixth(april)) {
                day = 19;
            } else if (isTwentyFifth(april)) {
                if (d == 28 && e == 6 && ((11 * (m + 1)) % 30 < 19)) {
                    day = 18;
                }
            } else {
                day = april;
            }
        }

        return new int[] {day, month, year};
    }

    static boolean isTwentySixth(int day) {
        return day == 26;
    }

    static boolean isTwentyFifth(int day) {
        return day == 25;
    }

    static int getM(int year) {
        if (year >= 1583 && year <= 1899) {
            return 23;
        } else if (year >= 1900 && year <= 2199) {
            return 24;
        } else {
            return 25;
        }
    }

    static int getN(int year) {
        if (year >= 1583 && year <= 1699) {
            return 2;
        } else if (year >= 1700 && year <= 1799) {
            return 3;
        } else if (year >= 1800 && year <= 1899) {
            return 4;
        } else if (year >= 1900 && year <= 2099) {
            return 5;
        } else if (year >= 2100 && year <= 2199) {
            return 6;
        } else {
            return 0;
        }
    }

}
