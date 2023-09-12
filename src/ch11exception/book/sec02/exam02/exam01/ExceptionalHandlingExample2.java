package ch11exception.book.sec02.exam02.exam01;

public class ExceptionalHandlingExample2 {
    public static void printLength(String data){
        try {
            int result =data.length();
            System.out.println("문자수" + result);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
             e.printStackTrace();

//            오류를 표기하는 3가지 방법 /*
//            1. .getMessage() 2. .toString() 3. printStackTrace()

//
        }
        finally{
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");

    }
}
