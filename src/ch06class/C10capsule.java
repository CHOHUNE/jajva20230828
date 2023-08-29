package ch06class;

public class C10capsule {
}

class MyClass10 {

    // 특별한 이유가 없다면 필드는 private 로 만들고
    // 관련된 메소드는 getter, setter를 따로따로 public으로 작성한다
    // 읽기 전용이라면 getter만 쓰기 전용이라면 setter만 쓰면 된다
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
