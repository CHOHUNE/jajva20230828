package ch16lambda.lecture;

import java.util.*;

public class C05parameter {
    public static void main(String[] args) {
    MyInterface04 o1= (int x)->{} ;
    MyInterface04 o2 = (x) -> {};
    MyInterface04 o3 = x -> {};


     }
}
interface MyInterface04{
    void method(int x);
}
