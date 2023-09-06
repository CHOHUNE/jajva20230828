package ch12api.book.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {

        Integer obj1=300;
        Integer obj2=300;

        System.out.println("==" + (obj1==obj2));
        System.out.println("equlas"+(obj2.equals(obj1)));
        System.out.println();


        Integer obj3=10;
        Integer obj4=10;
        System.out.println("==" + (obj3==obj4));
        System.out.println("equlas"+(obj3.equals(obj4)));
        System.out.println();

    }
}
