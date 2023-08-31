package ch08interface.book.sec07;

public class ServiceExample implements Service{
    public static void main(String[] args) {
        Service service= new ServiceImpl();

        //디폴트 메소드 :인스턴스를 통해서
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();
        //정적 메소드 : 인터페이스명을 통해서
        // 궁금한 점 : 인터페이스명을 안적고 호출이 가능한지
        Service.staticMethod();
        System.out.println();
        Service.staticMethod();
        System.out.println();
    }


}
//
//class Test1 {
//    public static void method() {
//        System.out.println("Test1.method");
//    }
//}
//
//class Test2 extends Test1 {
//    public static void method2() {
//        method();
//        Test1.method();
//    }
//}
//
//interface AInter {
//    public static void method11() {
//        System.out.println("AInter.method11");
//    }
//}
//
//class Test3 implements AInter {
//    public static void method22() {
//        method11();
//    }
//}
//
//
//
//
//
//












