package ch12api.lecture;

public class C11String {
    public static void main(String[] args) {

        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a==b); //true
        System.out.println(a==c); //false

        //new 키워드를 쓰면 참조값이 달라진다

        System.out.println(a.equals(b)); //true
        System.out.println(b.equals(c)); //true

    }


}
