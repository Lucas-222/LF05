package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SBahn {
    public static String start;
    public static String end;
    public static String startLane;
    public static String startStation;
    public static String endLane;
    public static String endStation;

    static void main() {
        setStartEnd();
        //validateInput();
        System.out.println("Kosten: " + calculatePrice(start, end));
    }

    static int calculatePrice(int start, int end) {
        int cost;

        if ( isStationNeighbour() ) {
            return 1;
        }

        // Default price
        cost = 2;

        if ( isEndStation(startStation) ) {
            cost++;
        }

        if ( isEndStation(endStation) ) {
            cost++;
        }

        cost += borderCrossings();

        return cost;
    }

    public static boolean isStationNeighbour() {
        // 1. Same lane one station
        if ( startLane.equals(endLane) ) {
            if ( Math.abs(Integer.parseInt(startStation) - Integer.parseInt(endStation)) == 1 ) {
                return true;
            }
        }

        // Special if one station is "00" | Other must be "X1"
        if ( start.equals("00") || end.equals("00") ) {
            return startStation.equals("1") || endStation.equals("1");
        }

        // Special ring
        if ( startStation.equals("3") && endStation.equals("3") ) {
            if ( Math.abs(Integer.parseInt(startLane) - Integer.parseInt(endLane)) == 1 ) {
                return true;
            }
        }

        return false;
    }

    public static boolean isEndStation(String station) {
        return station.equals("6") || station.equals("0");
    }

    public static int borderCrossings() {
        // Same Lane different station (max 1)
        if ( startLane.equals(endLane) ) {
            if ( Integer.parseInt(startStation) <= 3 && Integer.parseInt(endStation) > 3 ) {
                return 1;
            } else if ( Integer.parseInt(endStation) <= 3 && Integer.parseInt(startStation) > 3 ) {
                return 1;
            }

            return 0;
        }

        // Different Lane
        if ( Integer.parseInt(startStation) > 3 && Integer.parseInt(endStation) > 3 ) {
            return 2;
        } else if ( Integer.parseInt(startStation) <= 3 && Integer.parseInt(endStation) <= 3 ) {
            return 0;
        } else {
            return 1;
        }
    }

    static boolean validateInput() {
        return true;
    }

    static void setStartEnd() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Start: ");
        try {
            start = reader.readLine();
        } catch (IOException e) {
            System.out.println("Fehler bei der Eingabe");
        }

        System.out.print("Ende: ");
        try {
            end = reader.readLine();
        } catch (IOException e) {
            System.out.println("Fehler bei der Eingabe");
        }

        startLane = String.valueOf(start.charAt(0));
        startStation = String.valueOf(start.charAt(1));
        endLane = String.valueOf(end.charAt(0));
        endStation = String.valueOf(end.charAt(1));
    }

}
