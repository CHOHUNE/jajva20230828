package ch16lambda.lecture;

public class C02lambda {

    //lambda
    //(파라미터목록) -> { 메소드 몸통 }
    public static void main(String[] args) {
        MyInterface o1=()->{}; // 코드가 한 줄이면 중괄호 생략이 가능하다

        // 일반적인 작성
        MyInterface o2= new MyInterface() {
            @Override
            public void method() {

            }
        };

    }
}

@FunctionalInterface
interface MyInterface{
    void method();
}