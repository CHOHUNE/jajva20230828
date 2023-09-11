package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("J");
        set.add("S");
        set.add("C");

        Iterator<String> iterator= set.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println("item = " + item);
            iterator.remove();
        }

        for( String elem : set){
            System.out.println("elem = " + elem);

            if (elem.equals("java")) {
                set.remove("css");
                // 위 처럼 for문 반복 중에 if 문 안에서
//                set이 변경되면 오류가 발생한다./ if - collection 조작 - exception 발생
            }

        }
    }
}
