package ch16lambda.book.sec05.exam03;

public class Member {
    private String id;
    private  String name;
    public Member(String id ){
        this.id=id;
        System.out.println("Member(String id)");
    }
    public Member(String id, String name){
        this.id =id;
        this.name=name;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

//객체를 생성하는 생성자와 id와 name으로 객체를 생성하는 생성자를 작성하고
// 필드값을 확인할 수 있도록 toString() 메소드를 재정의 한다
// String 객체 id, name 생성후
// id, id- name 생성자 생성
// alt insert로 String return하는 toString 생성
//