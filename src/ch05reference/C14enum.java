package ch05reference;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1=MySeason.FALL;
        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.toString() = " + v1.hashCode());
        System.out.println("v1.equals(null) = " + v1.equals(null));

        System.out.println("v1.name() = " + v1.name());
        System.out.println("v1.name() = " + v1.ordinal());

        System.out.println("v1 = " + v1);
    }
}
/* Object 메서드도 사용할 수 있고 Enu의 메소드도 있다. toString메서드는 재구현 되어있다
* */

//실제로는 MySeason은 Enum을 상속 받음
enum MySeason {
    SPRING,SUMMER,FALL,WINTER
}

