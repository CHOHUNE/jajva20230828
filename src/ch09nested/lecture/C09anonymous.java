package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 =new MySubClass091();
        o1.method1();
        // anonymous class : 익명 클래스  ( 왜 이름이 없는지 ? )
        // 상위 클래스를 상속 받는 자식클래스가 있는데
        // 자식클래스의 생성 없이 상속받는 클래스를 만드는 것
        // 선언 방법은 상위 클래스를 객체를 만들고 바로 소괄호로 실행문을 붙여준다
        //생성자 칸은 쓰면 안됨 ( 이미 익명클래스로 인스턴스가 생성 되었기 때문)
        // 클래스의 상속과 인스턴스 생성을 동시에 해서 이름이 없다
      MyClass09 o2= new MyClass09(){
        void method1(){

        }
      };
      o2.method1();

    }
}

class MyClass09{
    void method1(){

    }
}

class MySubClass091 extends MyClass09{
    @Override
    void method1() {
        super.method1();
    }
}