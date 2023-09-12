package ch18io.lecture;

public class C27printf {
    public static void main(String[] args) {
//        width : 출력할 대상이 차지할 영역
//        s
        System.out.printf("@%1$6s%n","java"); // java는 4개 글자 이지만 6개 공간을 확보
//        문자 맨 앞에 공백을 만든다
        System.out.printf("@%1$2s%n","java"); // 확보할 공간이 작으면 무시하고 출력

//      flag : 출력방법
//            - : 전부 ( 좌측정렬 )
        System.out.printf("@%1$6s@n", "java");
        System.out.printf("@%1$-6s@n", "java");

        //precision
        // 실수(f)와 같이 쓰면 소숫점 이하 출력 개수
        System.out.printf("%1$f%n",3.141592);
        System.out.printf("%1$.3f%n",3.141592);
        System.out.printf("%1$.1f%n",Math.PI);
        System.out.printf("%1$.0f%n",Math.PI);


    }
}
