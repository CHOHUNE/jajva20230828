package ch07.book.sec03.exam01;

public class SmartPhone extends ch07.book.sec03.exam01.Phone {
    public SmartPhone(String model, String color){
        super();
        this.model=model;
        this.color=color;
        System.out.println("SamrtPhone 생성자 String model String color 파라메터 실행됨 ");
    }
}
