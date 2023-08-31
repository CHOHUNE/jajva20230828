package ch08interface.book.sec07;

public interface Service{
    default void defaultMethod1(){
        System.out.println("defaultMethod 종속 코드");
        defaultCommon();

    }

    default void defaultMethod2(){
        System.out.println("Service.defaultMethod2 종속코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("Service.defaultCommon");
    }
static void staticMethod(){
    System.out.println("Service.staticMethod");
    staticCommon();
}

  private static void staticCommon() {
      System.out.println("Service.staticCommon");
      System.out.println("Service.staticCommon");
    }

}
