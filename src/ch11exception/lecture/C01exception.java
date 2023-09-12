package ch11exception.lecture;

public class C01exception {
    public static void main(String[] args) {
        System.out.println("실행코드");
        System.out.println("실행코2드");
        System.out.println("실행코드3");

        int i=0;
        int j =3/i; //ArithmeticException

        System.out.println("실행코드3");
    }
}
