package ch15.collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C04foreach {
    public static void main(String[] args) {

        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("흥민"));
        list.add(new MyClass04("ㄱㅇ"));
        list.add(new MyClass04("애애애"));

            list.forEach(System.out::println);
            //위의 결과는 println 에 Object가 들어가면 toString이 나오게 되는데 참조값이 나온다
        // toString을 재정의 해야한다
    }
}

class MyClass04 {
    public MyClass04(String name){
        this.name=name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass04{" +
                "name='" + name + '\'' +
                '}';
    }
}
