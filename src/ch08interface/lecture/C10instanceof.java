package ch08interface.lecture;

import java.util.concurrent.ConcurrentMap;

public class C10instanceof {
    public static void main(String[] args) {
        //instanceof
        //연산 결과: boolean
        // 좌변 참조 변수
        //우변 타입( 클래스, 인터페이스)

        CharSequence c ="jajva";
        boolean r1= c instanceof String;
        boolean r2= c instanceof Comparable;
        boolean r3 =c instanceof Object;
        //true가 나왔따 => 안전하게 형변환이 가능하다
    }
}
