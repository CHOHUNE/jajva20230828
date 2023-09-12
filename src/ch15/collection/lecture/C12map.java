package ch15.collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {

    Map<String,String> map = new HashMap<>();
    map.put("student1","이강인");
    map.put("student2","흥궈");
    map.put("student3","흥궈");
    map.put("student2","흥민");
        System.out.println(map.size());
        map.get("student1");


    }
}

/*
* Map 선언
* put
* size
* put 덮어쓰기
* value얻기
*
* */