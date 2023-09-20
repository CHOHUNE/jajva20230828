package ch12api.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class C26reflection {

    public static void main(String[] args) {


    MyClass26 o1= new MyClass26("son");
    Class c = o1.getClass();

        Class<? extends MyClass26> aClass = o1.getClass();
        System.out.println("c.getName() = " + o1.getName());

        Field[] fileds=c.getDeclaredFields();
        System.out.println("fileds.length = " + fileds.length);

        Constructor[] constructors=c.getDeclaredConstructors();
        System.out.println("constructors.length = " + constructors.length);

        Method[] methods = c.getDeclaredMethods();
        System.out.println("methods.length = " + methods.length);



    }
}
class MyClass26 {
    private String name;

    public MyClass26(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
