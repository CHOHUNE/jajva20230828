package ch15.collection.book.ex09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map =new HashMap<String,Integer>();
        map.put("blue",96);
        map.put("hong",96);
        map.put("white",96);

        String name=null;
    int maxScore=0;
        int totalScore=0;

        int sum=0;
        int max=0;
        String id="";

for(Map.Entry<String,Integer>entry : map.entrySet()){
    sum+=entry.getValue();

    if(max<entry.getValue()){
        max=entry.getValue();
        id=entry.getKey();
    }
}


        //1번 map forEach문을 사용하기 //파라메터 값을 자동으로 훑음
        map.forEach((k,v)->System.out.println(k+" : " +v));

//        forEach에 생략된 부분
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            String key = e.getKey();
//            Integer value = e.getValue();
//            System.out.println(key + " : " + value);
//        }

        //2번 향상 for문
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println( entry.getKey() + " : " + entry.getValue() );

        //3번 이터레이터
            Set<String> keySet= map.keySet();
            Iterator<String>keyIterator= keySet.iterator();

            while (keyIterator.hasNext()){
                String k= keyIterator.next();
                Integer v=map.get(k);
                System.out.println(k + " : "+ v);
            }

        }
    }
}
