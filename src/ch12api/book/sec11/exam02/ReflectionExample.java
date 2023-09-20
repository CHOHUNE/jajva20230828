package ch12api.book.sec11.exam02;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz=Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드정보]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields) {
            System.out.println(field.getType().getName() + "" + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName()+"(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }
    private static void printParameters(Class[] parameters){
        for(int i=0; i<parameters.length; i++){
            System.out.println(parameters[i].getName());
            if(i<parameters.length-1){
                System.out.println(",");
            }
        }
    }
}

/*Car 클래스)에 대한 생성자, 필드, 메서드 정보를 출력하는 Java 코드*/

/*Car 클래스의 정보를 분석하기 위해 해당 클래스를 Class 객체로 가져옵니다.
생성자 정보를 출력하고, 생성자의 매개변수 타입 정보도 출력합니다.
필드 정보를 출력하고, 필드의 타입과 이름을 출력합니다.
메서드 정보를 출력하고, 메서드의 매개변수 타입 정보도 출력합니다.*/
