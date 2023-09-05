package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {

        String a ="java";
        String b= "spring";
        String c= "hellow world";
        String d= "hi java    ";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());

        String e = """
                 asdsad
                 sadasdasd
                 adsad
                 hell ow as
                 """;
        //text block : 가장 왼쪽 들여쓰기 기준으로 길이가 산정됨
    }
}
