package ch07extends.book.sec07.exam02;

public class ChildeExample {
    public static void main(String[] args) {
        Child child= new Child();


        parent parent = child; //변수의 타입은 parent이고 인스턴스는 child이다
        // 그 결과로 method 01 02 만 만들 수 있고
        // 인스턴스는 child 이기에 재정의한 method가 실행된다.
        parent.method01();
        parent.method02();
    }
}
