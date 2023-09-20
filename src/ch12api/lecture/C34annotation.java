package ch12api.lecture;

public class C34annotation {
@MyAnnotation34(name="seoul",value="busan")
int field;
}

@interface MyAnnotation34{
    //elements (attributes)

    String name(); // 요소가 하나 있어도 꼭 부여할 이름의 속성과 할당연산자를 써야한다
    String value(); // 하지만 요소 이름 중 value는 생략이 가능하고 바로 값을 쓸수 있다
    // 하지만 value도 다른 element가 있을 시 언급 해줘야 한다

}