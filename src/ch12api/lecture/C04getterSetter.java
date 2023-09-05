package ch12api.lecture;

public class C04getterSetter {

    public static void main(String[] args) {

        /*o1.name"손흥민";
        o1.age=33;  지양하려는 것. 요소에 직접 접근하여 변경하려는 것 */

        MyClass04 o1 = new MyClass04();
        o1.setName("손흥민");
        o1.setAge(23);
    }
}
class MyClass04 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


