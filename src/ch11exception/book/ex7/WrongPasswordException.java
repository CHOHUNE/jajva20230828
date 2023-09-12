package ch11exception.book.ex7;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException(String message) {
        super(message);
    }

}
