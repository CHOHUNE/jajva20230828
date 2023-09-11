package ch15.collection.book.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String > set=new HashSet<>();

                set.add("java");
                set.add("jtb");
                set.add("jsp");

        Iterator<String> iterator=set.iterator();
        /* 안에있는 요소들을 차례대로 탐색한다는 뜻
        인터페이스 : 메소드 :
        hasNetx() 다음에 탐색할게 있는지
            netx() 다음 아이템 ( 탐색할 )
            remove() : 삭제
*/

        String next1=iterator.next();
        String next2=iterator.next();
        String next3=iterator.next();
     /*   주로 조합이 맞는  while 문이나 if 문으로 hasNext()가 true일때만
        next() 하도록 설정하면 됨.
     */
        while(iterator.hasNext()){
            String next = iterator.next();

        }

        for( String elem : set){
            System.out.println("elem = " + elem);
        }

    }
}
