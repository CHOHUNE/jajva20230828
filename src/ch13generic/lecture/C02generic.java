package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {

        MyClass02<String> o1=new MyClass02<>();
        MyClass02<Integer> o2=new MyClass02<>();
        MyClass02<Double> o3=new MyClass02<>();
        MyClass02<Boolean> o4=new MyClass02<>();

    }
}

class MyClass02 <T>{
    private T t;
}



/* generic type
*  클래스명 뒤 or  접근 제한자 뒤 꺽쇄괄호 안  <> 대문자 단문 or 래퍼클래스
* 기본타입을 넣고 싶다?? 하면 자동언박싱을 이용하여 초기화 해준다
*
* 타입 파라메터 작성은  좌항에만 적고 우항에는 생략이 가능하다
* */