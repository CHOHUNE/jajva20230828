package ch12api.lecture;

public class C19hangul {
    public static void main(String[] args) {

        System.out.println('\uac00');
        System.out.println('\ud7a3');


        System.out.println("손흐이".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("손흐이".matches("[가-힣]{3}"));
    }
}
