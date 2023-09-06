package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        /*regularExperession : 정규표현식
         *
         * matchess(regex,str); 해당 정규표현식과 String이 매치하는지 boolean
         * */
        System.out.println("x".matches("x")); // true
        System.out.println("xx".matches("x")); //fase

        System.out.println("xxx".matches("x{3}")); // " x가 3번나옴
        System.out.println("aaa".matches("a{1,3}")); //1번~3번 나오거나

        //dog, doog, dooog 모두 일치하는 정규 패턴 만들기

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
        ;
        System.out.println("dooog".matches("do{1,3}g"));
        // 정규표현식 바로 뒤 문자가 1~3번 반복되는 패턴

//그룹 : ()  하나 이상의 문자
        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        ;
        System.out.println("dog".matches("(do){1,3}g"));


        // 수량 : 제한을 두고 싶지 않을 때 : 1회 이상~
        System.out.println("dodog".matches("(do){1,}g"));
        System.out.println("dododog".matches("(do){1,}g"));
        ;
        System.out.println("dog".matches("(do){1,}g"));

        // 없거나 한 번
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));
        System.out.println("dodog".matches("do?g"));

        // 0번 이상
        System.out.println("dog".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));

        // 1번이상
        System.out.println("dog".matches("d+og"));
        System.out.println("dddog".matches("d+og"));
        System.out.println("og".matches("d+og"));

        //문자 분류 (Character classes)
        System.out.println("dig".matches("d[oi]g")); //true
        System.out.println("dog".matches("d[oi]g")); //true

        System.out.println("dog".matches("d[^oi]g")); //true

        System.out.println("dog".matches("d[a-bh-z]g")); //a-b 까지 h-z 까지 중 하나


        //문자 분류 기호 ( 두개 표현 방법이 같음 )
        System.out.println("1".matches("[0-9]"));
        System.out.println("1".matches("\\d")); //  자바에서는 따옴표 안에 backlash를 쓰려면 따옴표 하나를 더 적어야 한다.
        System.out.println("1".matches("\\D")); //0-9 제외

        //숫자로 시작하면 안되고 영문 대소문자 _ $ 숫자
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("1".matches("[^0-9A-Za-z_$0-9]"));

//        숫자 2~3로 시작 중간에 3~4자리  마지막에 네자리
//          마이너스 기호 있어도 없어도 괜찮음
        String CellNumPattern = "\\d{2,3}-?\\d{3,4}-?\\d{4}";

        //이메일 패턴
        //영문 소문자, 숫자가 여러개 @ 영문 소문자, 숫자 여러개 . 영문 소문자,숫자 여러개

        String mailPattern="[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";

        System.out.println("asddogasd".matches(".*dog.*"));
        System.out.println("asddogcatasd".matches(".*(dog|cat).*"));

    }
}
