package verzweigungen;

public class DatumsValidierer {

    public static boolean validiereDatum( int tag, int monat, int jahr ) {
        // General range
        if ( monat < 1 || monat > 12 ) return false;

        // General range
        if ( tag < 1 || tag > 31 ) return false;

        return switch (monat) {
            // Months with 31 days
            case 1, 3, 5, 7, 8, 10, 12 -> true;

            // Months with 30 days
            case 4, 6, 9, 11 -> tag <= 30;

            // February
            case 2 -> {
                if ( isSchaltjahr(jahr) ) {
                    yield tag <= 29;
                } else {
                    yield tag <= 28;
                }
            }

            default -> false;
        };
    }

    public static boolean isSchaltjahr( int jahr ) {
        if ( jahr % 4 == 0 && jahr % 100 != 0 ) {
            return true;
        } else if ( jahr % 100 == 0 && jahr % 400 == 0 ) {
            return true;
        }
        return false;
    }

}
