package ch08interface.book;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc;

        rc= new Television();
        rc.turnOn();

        rc=new Audio();
        rc.turnOn();
    }
}
