package ch08extends.lecture;

public class C27final {
final int a =3;
}


class MyClass27{
    final int age=3;
    final String name;
    //인스턴스가 실행될 때 꼭 실행되는 생성자 코드
    MyClass27(){
        this.name="java";
        //생성자에서 할당할 때도 한 번만 할당하게 된다.
        // 위 처럼 final을 쓰는 법 보다 주로 생성자에서 this. 를 선언하는 방법으로 사용된다.
    }

    MyClass27(String name){
        this.name=name;
    }
}


//변수에 final을 붙이면 한 번만 할당하게 되는데 위 처럼 여러가지 방법이 있다.