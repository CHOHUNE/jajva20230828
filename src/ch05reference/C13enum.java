package ch05reference;

public class C13enum {

//    enum타입 작성 요령
//    전부 참조 타입 : 참조 값이 다르므로 모두 다 다른 객체이다.
//    참조 타입 이므로 equals를 사용하여 비교한다. ( 내부 값 까지 동일한지 비교 )
public static void main(String[] args) {


    MyEnum v1=MyEnum.VALUE1;
    MyEnum v2=MyEnum.VALUE2;
    MyEnum v3=MyEnum.VALUE3;
    MyEnum v4=MyEnum.MY_FIRST_VALUE;
    System.out.println("v4==v3 = " + (v4==v3));
    System.out.println("v4==v3 = " + (v1==v2));

    System.out.println("v4.equals(v3) = " + v4.equals(v3));
    System.out.println("v4.equals(v3) = " + v2.equals(v1));
}
}

enum MyEnum{
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
//    enum 타입으로 만들 수 있는 타입들이 아래 4개로 한정된 상태
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE

        }