package ch08extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.printName();
    }
}
class MyClass03{
    private String name;

    void printName(){
        System.out.println(name);
    }
}
class MySubClass031 extends MyClass03{
    void setName(String name){
//        this.name =name;
        // 상위 클래스의 private field는
        // 같은 클래스 내에서만 수정이 가능하다.
    }
    }

