package ch11exception.lecture;

import java.util.List;

public class C15unchecked {
    public static void main(String[] args) {
        var list= List.of(4,2,3);
        list.get(0);
        list.get(1);
        list.get(2);
        //RuntimeException ( UncheckedException )

        System.out.println("프로그램 실행 이어감 ");
        System.out.println("오류가 발생했지만 RuntimeException이기 때문 ");
    }
}
