package methoden.exceptions;

public class InvalidSymbolException extends RuntimeException {

    public InvalidSymbolException(String message) {
        System.err.println("Bitte ein valides Zeichen angeben");
    }
}
