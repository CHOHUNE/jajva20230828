package ch15.collection.book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);

        //Entry 4번 홍길동 교체1번 -> 총3개

        System.out.println("총 Entry 수 "+ map.size());
        System.out.println();
        //key를 안다면 get()을 써서 value를 얻어낼 수 있다.
        String key = "홍길동";
        int value = map.get(key);

        //향상 for문
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.forEach((k,v)-> System.out.println(k+ " : " + v));

        //생략된 부분
        for (Entry<String, Integer> e : map.entrySet()) {
            String s = e.getKey();
            Integer i = e.getValue();
            System.out.println(s + " : " + i);
        }

        System.out.println();
        Set<String> keySet =map.keySet();
        Iterator <String>keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v=map.get(k);
            System.out.println(k+ ":" +v);

        }
        System.out.println();
        Set<Entry<String, Integer>> entrySet=map.entrySet();
        Iterator < Entry <String , Integer>> entryIterator=entrySet.iterator();


    }}

