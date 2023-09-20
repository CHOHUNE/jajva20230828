package ch12api.lecture;

public class C35annotation {
@MyAnnotation35(name={"son","let"})
    int field;
@MyAnnotation35(name={"son"})
    int field2;

@MyAnnotation35(name="son") //값이 한 개일 경우 생략 가능
    int field3;
}

@interface  MyAnnotation35{
    String[] name();

}
