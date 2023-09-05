package ch16lambda.book.sec05.exam01;

import ch07extends.book.sec04.exam01.Computer;

public class MethodReferenceExample {
    public static void main (String[] args){
        Person person = new Person();
        person.action(computer::staticMethod);

        computer com = new computer();

        person.action ( com:: instanceMethod);
    }
}
