package ch08interface.book;

public class TV implements Remocon{

    @Override
    public void powerOn() {
        System.out.println("TV를 켰슴");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
