package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C07distinct {

    List<Integer> list=List.of(3,1,4,5,6);
 long count;


    public C07distinct() {
        count = list.stream()
                .distinct()
                .count();
    }
}
