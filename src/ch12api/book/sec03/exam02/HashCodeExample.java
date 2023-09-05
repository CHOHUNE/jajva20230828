package ch12api.book.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {

        Student s1 = new Student(1,"홍홍");
        Student s2 = new Student(2,"홍박사");

        if(s1.hashCode()== s2.hashCode()){
            if (s1.equals(s2)){
                System.out.println("동일객체");
            }
            else {
                System.out.println(" 데이터가 다르므로 동등다른객체");
            }

        }
        else {
            System.out.println("헤시코드가 다르므로 동등객체 나이");
        }
    }
}
