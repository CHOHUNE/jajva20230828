package ch13generic.book.sec03.exam01;

public class GenericExample {

    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
    Box<Integer> box1 = boxing(100);
    int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2=boxing ("홍길동");
        String strValue= box2.get();
        System.out.println(strValue);

    }
}

/*
리턴 타입 앞에 <T> 타입 파라메터가 있는 걸로 보아 제네릭임을 알수 있다
    Box<Integer> box1 = boxing(100);
     괄호 안에 있는 데이터가 Integer임을 유추하고 공란으로 비워둬도 제네릭은 작동한다
    B
    ox<Integer> box1 =<Integer> boxing(100); 본래 이 형태

*/
