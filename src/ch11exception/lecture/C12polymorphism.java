package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
//            ClassCastException
//            NullPointerException
//                    ArithmeticException
        } catch (ClassCastException e) {
//          ClassCastException

        } catch (RuntimeException e) {
//        RuntimeException이 상위 타입으로서 catch문을 여러개 작성시
//        상위 타입의 Exception 이 위에 가도록 작성해야 한다
//            Runtime -> ClassCast 잘못된 순서
        } finally {

        }
    }
}
