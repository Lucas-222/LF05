package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SBahn {
    public static int minLane = 0;
    public static int maxLane = 5;
    public static int minStation = 0;
    public static int maxStation = 6;
    public static int zoneBorder = 3;
    public static int baseCost = 2;

    public static int calculatePrice( int start, int end ) {
        int startLane = start / 10;
        int startStation = start % 10;
        int endLane = end / 10;
        int endStation = end % 10;

        if ( isStationNeighbour( startLane, startStation, endLane, endStation ) ) {
            return 1;
        }

        // Default price
        int cost = baseCost;

        cost += getCountLaneEnds( startStation, endStation );

        if ( isCrossingBorder( startLane, startStation, endLane, endStation ) ) {
            cost++;
        }

        return cost;
    }

    public static boolean isStationNeighbour( int startLane, int startStation, int endLane, int endStation ) {
        // Same lane one station apart
        if ( startLane == endLane ) {
            // If the difference between the stations is "1"
            if ( getDifference( startStation, endStation ) == 1 ) {
                return true;
            }
        }

        // Special if one station is "00" | Other must be "X1"
        if ( startLane == minLane || endLane == minLane ) {
            return startStation == 1 || endStation == 1;
        }

        // Special ring
        if ( startStation == zoneBorder && endStation == zoneBorder ) {
            // Check if one lane is max and the other is start
            if ( (startLane == maxLane && endLane == (minLane+1) ) || (endLane == maxLane && startLane == (minLane+1) ) ) {
                return true;
            }

            // Check if difference between the lanes is "1"
            if ( getDifference( startLane, endLane ) == 1 ) {
                return true;
            }
        }

        return false;
    }

    public static int getCountLaneEnds( int startStation, int endStation ) {
        int count = 0;

        if (startStation == maxStation || startStation == minStation) {
            count++;
        }

        if (endStation == maxStation || endStation == minStation) {
            count++;
        }

        return count;
    }

    public static boolean isCrossingBorder( int startLane, int startStation, int endLane, int endStation ) {
        // Same Lane different station
        if ( startLane == endLane ) {
            if ( startStation <= zoneBorder && endStation > zoneBorder ) {
                return true;
            } else if ( endStation <= zoneBorder && startStation > zoneBorder ) {
                return true;
            }

            return false;
        } else {
            // Different Lane
            if (startStation <= zoneBorder && endStation <= zoneBorder) {
                return false;
            }
        }

        return true;
    }

    public static boolean isInputValid( int start, int end ) {
        if ( start > maxLane || end > maxLane ) {
            return false;
        }

        // Check range
        if ( start < minLane || start / 10 > maxLane || start % 10 > maxStation || start % 10 < minStation) {
            return false;
        }

        if ( end < minLane || end / 10 > maxLane || end % 10 > maxStation || end % 10 < minStation) {
            return false;
        }

        // Check if start == end
        if ( start == end ) {
            return false;
        }

        return true;
    }

    static int getDifference( int start, int end ) {
        return Math.abs(start - end);
    }

}
