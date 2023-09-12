package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("code1");
        try{
            int i=0;
            int j=3/i;
            System.out.println("cod3");
        }
        catch (ArithmeticException e){
//            e.printStackTrace(); // 본래 catch블럭에 exception을 추가하면 해당 오류 메세지가 발생해도 안뜨는데
                                    // 이 메세지를 통해서 오류를 표기할 수 있다.
        }
        finally{

        }
        System.out.println("cod4");

    }
}

/*
표준 출력 : 출력된 콘솔  PrintStream out
표준 에러 출력 : 이것도 콘솔  PrintStream arr

두개 다 다른 객체이고 다른 일을 하는데 동시에 출력하기 때문에 다르게 출력될 수도 있음
위에 있던 코드가 맨 아래 출력되고 중간에 오류 메세지가 맨 나중에 뜨는 문제 등이 이러한 원인
*/
