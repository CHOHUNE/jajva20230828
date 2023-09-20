package ch17stream.book.ex06;

import java.util.List;
import java.util.Optional;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3,4,1);
        Integer max= list.stream()
                .reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("max = " + max);

        List<Integer> list2=List.of();
        Integer max2=list2.stream()
                .reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("max2 = " + max2);
        // 위 처럼 리스트가 빈 경우 초기값을 return 하는데 초기값 return을 원치 않을 경우
//      빈 reduce를 쓰는 법은 아래 있다

        Optional<Integer> max3= list2.stream()
                .reduce(Math::max);
        System.out.println("max3 = " + max3);
    }
}
