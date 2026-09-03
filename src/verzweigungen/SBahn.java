package verzweigungen;

public class SBahn {
    private final static int minLane = 0;
    private final static int maxLane = 5;
    private final static int minStation = 0;
    private final static int maxStation = 6;
    private final static int zoneBorder = 3;
    private final static int baseCost = 2;
    private final static int singleDestinationCost = 1;
    private final static int endStationCost = 1;
    private final static int borderCrossingCost = 1;

    static void main() {
        isInputValid(00, 55);
    }

    public static int calculatePrice(int start, int end) {
        int startLane = start / 10;
        int startStation = start % 10;
        int endLane = end / 10;
        int endStation = end % 10;

        // If station is only "1" apart -> the costs are always "1"
        if (isStationNeighbour(startLane, startStation, endLane, endStation)) return singleDestinationCost;

        // Cost is base cost + (end stations count * end station cost) + border crossing cost
        return baseCost +
                (getCountLaneEnds(startStation, endStation) * endStationCost) +
                (isCrossingBorder(startLane, startStation, endLane, endStation) ? borderCrossingCost : 0);
    }

    private static boolean isStationNeighbour(int startLane, int startStation, int endLane, int endStation) {
        // Same lane one station apart
        if (startLane == endLane) {
            // If the difference between the stations is "1"
            return getDifference(startStation, endStation) == 1;
        }

        // Special if one station is "00" | Other must be "X1"
        if (startLane == minLane || endLane == minLane) {
            return startStation == 1 || endStation == 1;
        }

        // Special ring
        if (startStation == zoneBorder && endStation == zoneBorder) {
            // Check if one lane is max and the other is start
            if ((startLane == maxLane && endLane == (minLane+1)) || (endLane == maxLane && startLane == (minLane+1))) {
                return true;
            } else {
                // Check if difference between the lanes is "1"
                return getDifference(startLane, endLane) == 1;
            }
        }

        return false;
    }

    private static int getCountLaneEnds(int startStation, int endStation) {
        int count = 0;

        if (startStation == maxStation || startStation == minStation) {
            count++;
        }

        if (endStation == maxStation || endStation == minStation) {
            count++;
        }

        return count;
    }

    private static boolean isCrossingBorder(int startLane, int startStation, int endLane, int endStation) {
        // Same Lane different station
        if (startLane == endLane) {
            if (startStation <= zoneBorder && endStation > zoneBorder) {
                return true;
            } else {
                return endStation <= zoneBorder && startStation > zoneBorder;
            }
        } else {
            // Different Lane
            return startStation > zoneBorder || endStation > zoneBorder;
        }
    }

    public static boolean isInputValid(int start, int end) {
        if (isLaneXOrStation0(start) || isLaneXOrStation0(end)) return false;

        // Check range
        if (isOutOfRange(start) || isOutOfRange(end)) return false;

        // Check if start == end
        return start != end;
    }

    private static boolean isOutOfRange(int input) {
        return input % 10 > maxStation || input / 10 > maxLane || input < minLane;
    }

    private static boolean isLaneXOrStation0(int input) {
        if (input / 10 == 0) {
            return input % 10 != 0;
        }

        return false;
    }

    private static int getDifference(int start, int end) {
        return Math.abs(start - end);
    }

    public static int getMaxStation() {
        return maxStation;
    }

    public static int getMaxLane() {
        return maxLane;
    }
}
