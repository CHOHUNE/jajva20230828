package ch07.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//    Phone phone = new Phone(); 불가!!
        SmartPhone smartPhone=new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();

        Phone phone = smartPhone;
        phone.turnOff();
        phone.turnOn();
    }
}
