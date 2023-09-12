package ch11exception.book.sec05;

public class ThrowsExample2 {
    public static void main(String[] args) {
        try {
            findeClass();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void findeClass() throws ClassNotFoundException{
        Class.forName(("java.lang.String2"));
    }
}
