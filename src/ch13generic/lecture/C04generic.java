/*
package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String, S> o1 = new MyClass04<>();
        o1.setField("java");
        String f1=o1.getField();

        MyClass04<Integer, S> o2 = new MyClass04<>();
        o2.setField(3000);
        int f22 = o2.getField();

        MyClass04<Long, S> o3 = new MyClass04<>();
        o2.setField(5000);
        Long f3= o3.getField();
        long f33= o3.getField();
    }
}

class MyClass04<T, S> {
    private T field;

    public void setField(T field) {
        this.field = field;

    }

    public T getField() {
        return field;
    }
}


*/
/* 임의로 설정한 미정의 제네릭 타입을 이용하여 자동 형변환 하고
*  오토언박싱을 하는 예제
*
* */
