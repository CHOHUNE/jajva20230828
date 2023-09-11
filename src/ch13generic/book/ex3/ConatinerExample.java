package ch13generic.book.ex3;

import java.awt.*;

public class ConatinerExample {
    public static void main(String[] args) {

        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍", "도");

        String name1 = container1.getKey();
        String job = container1.getValue();

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
    }
}

class Container<T, N> {

    T key;
    N value;


    public void set(T key, N value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public N getValue() {
        return value;
    }
}
