package ch12api.book.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("샘성", "안드");
        String strObj = myPhone.toString();
        System.out.println(strObj);

    }
}
