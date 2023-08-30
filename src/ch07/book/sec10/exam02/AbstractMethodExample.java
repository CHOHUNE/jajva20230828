package ch07.book.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalsound(new Dog()); // 새 인스턴스가 생성됨 위의 인스턴스와 별개
        animalsound(cat); // 위의 cat과 동일한 참조 값
    }


    public static void animalsound(Animal animal) { //Animal 타입이면 무조건 들어올 수 있다.
    animal.sound(); // 상위 타입으로 무엇을 받으면 실제 인스턴스를 실행할 수 있다
    }
}

