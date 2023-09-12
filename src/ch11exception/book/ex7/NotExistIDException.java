package ch11exception.book.ex7;

public class NotExistIDException extends Exception{
    public NotExistIDException(){}
    public NotExistIDException (String message){
        super(message);
    }
}
