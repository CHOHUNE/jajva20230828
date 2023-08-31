package ch09nested.book.p05;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony =new Anonymous(){

        };
        anony.field.run();
        anony.method1();


        anony.method2(new Vehicle() {
            @Override
            public void run() {

            }
        });
    // method2에 Vehilce 객체가 매개변수로 잡혀 있다.
        // Vehicle 객체를 상속받는 익명메서드를 매개변수에 직접 생성했다

    }
}
