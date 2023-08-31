package ch08interface.book.sec11.exam06;

public class Cat implements Soundable{
    @Override
    public String sound() {
        System.out.println("냐옹");
        return null;
    }
}
