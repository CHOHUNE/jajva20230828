package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력한문자들");
        System.out.printf("출력할문자들","java",3,3.14);

//        %n: new line
        System.out.printf("출력할 문자들3%n다음줄 출력됨 ");
        System.out.printf("출력.%n");

        //%% : %가 출력됨
        System.out.printf("%n%% : 퍼센트");




    }

}
