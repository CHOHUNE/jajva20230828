package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
        }
        catch(Exception e){
            e.printStackTrace();

        }
        System.out.println("main code2");

    }
    private static void method3() throws Exception{
        throw new Exception();
        // 일반 예외는 이 메소드가 예외 처리를 한다고 꼭 표기를 해야함

//        throw new RuntimeException();
        // 컴파일러가 예외 처리 코드 여부 검사를 하지 않음
    }
}
