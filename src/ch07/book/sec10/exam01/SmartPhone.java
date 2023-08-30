package ch07.book.sec10.exam01;

public class SmartPhone extends Phone{

    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색");
    }
}
