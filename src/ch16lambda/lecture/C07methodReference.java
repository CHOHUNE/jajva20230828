package ch16lambda.lecture;

public class C07methodReference {
    public static void main(String[] args) {
        Myinterface07 o1= (x,y)-> MyClass07P.otherMethod(x,y);
        Myinterface07 o2=MyClass07P::otherMethod;
    }
}

class MyClass07P{
    static void otherMethod(int x, int y ){

    }
}

interface  Myinterface07{
    void method(int x, int y);
}
