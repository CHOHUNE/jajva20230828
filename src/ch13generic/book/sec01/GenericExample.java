package ch13generic.book.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1= new Box<String>(); // 오토박싱
        box1.content ="ㅎㅇㅎㅇ"; // 오토 언박싱
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>(); //오토박싱
        box2.content=100;// 오토 언박싱
        int value = box2.content;
        System.out.println(value);
    }
}


//Box class 제네릭을 임의의 T로 잡음
// T타입의 content