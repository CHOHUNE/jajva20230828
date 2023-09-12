package ch11exception.lecture;

public class C07finally {
    public static void main(String[] args) {
        System.out.println("code1");
        try {
            int j = 3 / 0;
//            exception이 발생되면 이 부분에서 catch 블록
            System.out.println("code2");
            return;
//            exception이 발생되면 이 부분까지 모두 수행
        } catch (ArithmeticException e) {
            System.out.println("cod3");
        } finally {
            System.out.println("code4");
        }
        System.out.println("code5");
    }
}
// exception 이 발생하지 않으면 try문이 끝가지 실행된다
