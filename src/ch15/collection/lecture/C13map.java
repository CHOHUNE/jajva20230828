package ch15.collection.lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C13map {
    public static void main(String[] args) {
        // map 전체 탐색

        Map <String, String> map = new HashMap<>();
        map.put("학생1","흥궈");
        map.put("학생2","흥궈");
        map.put("학생2","흥민");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        Set<String> keySet= map.keySet();
        for(String keys :keySet){
            System.out.println(keys + map.get(keys));
        }
    for( Map.Entry<String,String> entry : map.entrySet()){
        System.out.println( entry.getKey() + entry.getValue());
    }



    }
}
