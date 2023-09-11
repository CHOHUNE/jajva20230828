package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        MyClass<Dog> o1 = new MyClass<>();
        MyClass<Cat> o2 = new MyClass<>();
        MyClass<? extends Animal> o4 = new MyClass<Dog>();
        MyClass<? extends Animal> o3 = new MyClass<Animal>();
        o3.get();

        MyClass<? super Animal> o9 = new MyClass<>();
        o9.set(new Animal());

        Animal.animalmethod();
        Animal ani1=o3.get();
    }
}

class Animal {
    public static void animalmethod() {
    }

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class MyClass<T> {

    public void set(T para) {
    }

    public T get() {
        return null;
    }


}


