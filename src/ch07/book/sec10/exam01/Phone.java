package ch07.book.sec10.exam01;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner=owner;
    }
    void turnOn(){
        System.out.println("폰켬");
    }
    void turnOff(){
        System.out.println("폰끔");
    }
}
