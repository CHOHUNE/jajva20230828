package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        set.removeIf(e->e.equals("css"));

//    축약버전 css hasnext -? equals "css" .remove();

//        Iterator<String> iterator= set.iterator();
//        while(iterator.hasNext()){
//            String item = iterator.next();
//            if(item.equals("jsp")){
//                iterator.remove();
//                //remove는 set이 아니라 iterator로 해야 한다.
                // set.remove()는 올바르지 않은 표기법


       Iterator<String> iterator= set.iterator();
        System.out.println("iterator = " + iterator);
    }
}
