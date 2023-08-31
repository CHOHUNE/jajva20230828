package ch09nested.lecture;

public class C10anonymous {

    public static void main(String[] args) {


        MyClass10 o3 = new MyClass10() {
        }; //추상 클래스인데 바로 인스턴스를 생성할 수 있는 이유?
            // 추상클래스를 상속 받는 익명 클래스를 만드록 그 인스턴스를 선언했기 때문
        // 추상클래스는 바로 인스턴스를 만들 수 없고 그를 상속 받는 클래스를
        // 객체를 생성해야 한다.
        }
    }


class MysubClass101 extends MyClass10{

}

abstract class MyClass10{}

