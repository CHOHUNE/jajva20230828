package ch13generic.book.ex2;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value= container2.get();

    }
}

class Container<T>{

    private T field;

    public T get() {
        return field;
    }

    public void set(T field) {
        this.field = field;
    }
}

/*
 여담으로 타입 파라메터는 직접 만들 일은 거의 없고 Set map lIst
 와 함께 미리 만들어진 타입 파라메터들을 활용하는 경우가 대다수이다.

 */
