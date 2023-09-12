package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("예외 발생");
        }
    }


    public static void method1() {
        // 여지것 exception을 잡아만 catch만 했다면
        //throw 키워드 로 직접 생성할 수도 있다.
        System.out.println("code1");
        throw new RuntimeException();
    }
    public static void method2() {

    }

}

