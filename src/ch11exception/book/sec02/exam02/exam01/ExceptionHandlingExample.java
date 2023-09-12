package ch11exception.book.sec02.exam02.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재 합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2클래스가 존재 합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("실행흐름 이어감.. ");
        }
    }
}

//forName :
//
//주어진 문자열 이름의 클래스 또는 인터페이스와 연결된 Class 개체를 반환합니
// 다. 이 메서드를 호출하면 다음과 같습니다:
//Class.forName(className, true, currentLoader)
//여기서 currentLoader는 현재 클래스의 정의 클래스 로더를 나타냅니다.
//예를 들어, 다음 코드 조각은 java.lang.thread라는 클래스의 런타임 Class 디스크립터를
// 반환합니다:
//클래스 t = 이름에 대한 클래스.("java.lang.thread")

//public void printStackTrace()
//이 throwable과 그 백트레이스를 표준 에러 스트림에 인쇄한다. 이 메서드는 이 T
// hrowable 객체에 대한 스택 트레이스를 System.err 필드의 값인 에러 출력 스트림에 인쇄합니
// 다. 출력의 첫 번째 줄은 이 객체에 대한 toString() 메서드의 결과를 포함합니다. 나
// 머지 줄은 fillInStackTrace() 메서드에 의해 이전에 기록된 데이터를 나타냅니다. 이
// 정보의 형식은 구현에 따라 다르지만 다음 예제는 전형적인 것으로 간주될 수 있습니다:


