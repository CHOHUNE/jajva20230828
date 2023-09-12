package ch17stream.lecture;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class C20primitive {
    public static void main(String[] args) {
       /* primitiveTypeStream: Intsteam, LongStream, DoubleStream
            참조 타입 : Stream<String,Integer>
            기본 타입 - > 참조 타입 : 자동 박싱 언박싱
            boxed() :Stream<Integer등 > 참조타입을 return 함
       * */
        Integer max = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .max(Math::max)
                .get();
//      boxed를 통해 기본 타입 - > 참조 타입 : 자동 박싱 언박싱

        int max2=IntStream.of(1,2,3,4,5)
                .max()
                .getAsInt();


    }
}
