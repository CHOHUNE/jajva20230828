package ch11exception.book.sec06;

public class InsufficientException extends Exception{
    public InsufficientException(){

    }
    public InsufficientException(String message){
        super(message);
    }
}

/*
* custom 예외 메세지를 만들려면 해당 예외 클래스를 생성하고
* Extends 해서 Exception을 상속 받는다.
* 오류가 날 String 메세지를 파라메터로 잡고
* super(message) 로 부모 클래스의 message를 필드에 선언해
* 매개변수로 잡을 수 있게 해준다
* 왜 두개 생성자를 만들지?
*
*
* */