package ch15.collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21midifiableMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("흥민", 100, "흥궈", 1);

        map1.put("지성", 13);
        Map<String, Integer> map2 = Map.copyOf(map1);
        Map<String, Integer> map3 = new HashMap<>(map1);

    }
}
