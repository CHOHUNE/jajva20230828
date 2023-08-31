package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
    Myinterface11 o3=new Myinterface11() {
        @Override
        public void method() {

        }
    };
    }

    }




interface Myinterface11{
    void method();
}
// 인터페이스도 마찬가지로 바로 객체생성을 할수 없으니 그를 implements 하는 하위
// 클래스를 만들어야 한다.
//하지만 그를 implements 하는 class를 바로 만든다면 추상클래스와 마찬가지로
// 한 번에 인스턴스, 상속이 가능하다
// 익명 클래스, 메소드도 마찬가지로 추상 메소드, 클래스를 전부 재정의 해야한다