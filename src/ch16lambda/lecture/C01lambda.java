package ch16lambda.lecture;

public class C01lambda {

    // 람다식
    MyInterface01 o1= (x,y) -> System.out.println(x+y);
    // 일반 적인 인터페이스 객체생성 오버라이딩
    MyInterface01 o2 = new MyInterface01() {
        @Override
        public void method1(int x, int y) {

        }
    };

}

// lambda expression ( 람다식 )
// 추상 메소드가 하나인 인터페이스의 익명 클래스 객체를 만들 때 사용 가능하다
// 다른 건 재정의 할 필요가 없으니 프라이빗, 디폴트 메소드 개수는 무관
interface MyInterface01 {
    void method1( int x , int y );
}
