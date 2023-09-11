package ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
        MyClass09 o1=new MyClass09();
        o1.<Object>method(new Object());

        o1.method(new Object());
    }
}

//MyClass09 객체 생성
/*


*/
class MyClass09{
    public<T> void method(T para){

    }

    public <T> T method2(){
        return null;
    }
} // T 타입의 T제네릭 메서드?

//메서드는 접근 제한자 다음에

// 클래스는 클래스명 다음에