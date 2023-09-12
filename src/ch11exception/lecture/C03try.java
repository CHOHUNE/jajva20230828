package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {

        System.out.println("code1...");
        System.out.println("code2...");
        try {
            int i = 0;
            int j = 3 / i; //Aritmetic Exception
        }
        catch(ArithmeticException e){

            System.out.println("exception 발생시 실행되는 코드 ");
            System.out.println("exception 발생시 실행되는 코드2 ");
        }
        System.out.println("code3...");
    }
}
