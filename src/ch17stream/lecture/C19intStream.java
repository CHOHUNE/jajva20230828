package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {

            int max6 =IntStream.of(2,3,4,5,6,6)
                    .sum();



       OptionalInt max= IntStream.of(9,5,10,2,3,4,5,5)
                .max();
        System.out.println("max = " + max);
       OptionalInt min = IntStream.of(1,2,3,4,5)
               .min();
        System.out.println("min = " + min);
        
        OptionalDouble average= IntStream.of(2,3,45,5,5,1,2,3,4)
                .average();
        System.out.println("average.getAsDouble() = " + average.getAsDouble());

    }
}
