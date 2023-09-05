package ch16lambda.book.sec05.exam03;

public class Person {
    public Member getMember1(Creatable1 creatable1){
        String id="winter";
        Member member = creatable1.create(id);
    return member;
    }

    public  Member getMember2 (Creatable2 creatable2){
        String id= "winter";
        String name="한겨울";
        Member member = creatable2.create(id,name);

        return member;
    }
}


//Person 클래스는 인터페이스Creatable1 과 Creatabl2 매개변수로 갖는
// getMember1 과 get Member2() 메소드를 같이 작성한다
