package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C29annotation {

    int fileld;
    @MyAnnotation29
    public static void main(@MyAnnotation29 String[] args) {

    }
}

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.LOCAL_VARIABLE
,ElementType.PARAMETER})
//enum 타입 - 해당 요소타입에만 붙일 수 있게 타겟 하겠다.

@interface MyAnnotation29{

}
