package ch12api.book.ex17;

import java.util.regex.Pattern;

public class PatternMactherExample {
    public static void main(String[] args) {


        String id = "5Angle1004";
        String regExp = "^[A-Za-z]\\w{7,11}";
        boolean isMatch =id.matches(regExp);
        boolean isMatch2= Pattern.matches(regExp,id);

        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
