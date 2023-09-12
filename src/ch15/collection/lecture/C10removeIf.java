package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {

    public static void main(String[] args) {

        Set <String> set=new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("lala");

        set.removeIf(e->e.equals("java"));
    }
}
