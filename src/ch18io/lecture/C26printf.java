package ch18io.lecture;

public class C26printf {
    public static void main(String[] args) {

        // %s : 문자열 출력
        // % : %%
        // %n :

        System.out.printf("문자열 :%s", "java");
        // 두 번째 파라메터가 %s에 들어가서 출력된다
        System.out.printf("문자열1:%s%n문자열2:%s%n","css","react");
        // 문자열 1에 css 문자열 2에 react가 들어간다.

        //%d : 정수 십진법 출력
        System.out.printf("정수:%d%n",99);
        System.out.printf("정수1:%d%n 정수2:%d%n",100,200);
        System.out.printf("");

        //argument_index$ :
        // 를 쓰면 순서대로 기입하지 않아도 인덱스 넘버를
        // 정해주면 원하는 순서대로 출력할 수 있따.
        System.out.printf("정수2:%2$d%n정수1:%1$%n",100,200);
        System.out.printf("정수:%1$d",9,8); //9
        System.out.printf("정수:%2$d",9,8); //8

    }
}
