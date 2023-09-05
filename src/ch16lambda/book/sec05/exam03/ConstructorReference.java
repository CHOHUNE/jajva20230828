package ch16lambda.book.sec05.exam03;

public class ConstructorReference {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();



        Member m2=person.getMember2(Member::new);

        Member m3=person.getMember2(new Creatable2() {
            @Override
            public Member create(String id, String name) {
                return new Member(id, name);
            }
        });

        System.out.println(m2);
    }
}


//member person (getMember(creatable-String id == meber String id name )