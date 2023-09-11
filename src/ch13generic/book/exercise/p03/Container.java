
package ch13generic.book.exercise.p03;
public class Container<K,V>{

    private K key;

    private V value;


    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


/*
* K V 제네릭 Container
* K V 게터 세터
* K는 key
* V는 vlaue 선언
* */