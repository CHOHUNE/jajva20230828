package ch08interface.book;

public class Audio implements RemoteControl {
    @Override
    public void turnOn(){
        System.out.println("Audio 켬");
    }
}
