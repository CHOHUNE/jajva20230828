package ch16lambda.book.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()->{

        });
        person.action(()-> System.out.println("퇴근띠"));
    }
}
