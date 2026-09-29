package helper.exceptions;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String message) {
        System.err.println(message);
        super();
    }
}
