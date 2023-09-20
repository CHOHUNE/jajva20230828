

package ch12api.lecture;

@MyAnotation33 ( number = 3,name="냠")
public class C33annotation {
    public static void main(String[] args) {

            @MyAnotation33(number=5,name="뇽",address="주소보소")
                int value;

    }
}


@interface MyAnotation33{


    /* 어노테이션에 들어갈 수있는 요소들
    parameter
    argument
    attribute
    element
    *
    * */

    int number(); // 해당 요소 값을 줘야한다.
    String name();
    String address() default "seoul"; // 값을 주지 않아도 기본 값을 주고 싶다
    // 값을 입력하지 않아도 오류가 나지 않지만 원한다면 해당 값을 부여할 수도 있다.
}



