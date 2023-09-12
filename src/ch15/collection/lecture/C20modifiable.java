package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {
    public static void main(String[] args) {


    Set<String> set= Set.of("java","Spring");
    Set<String> set2= new HashSet<>(set);

    set2.add("html");
        System.out.println("set1.size() = " + set.size());
        System.out.println("set2.size() = " + set2.size());
}
}