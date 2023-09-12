package ch11exception.ex6;

public class ex6 {

    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가");

            } finally {
                System.out.println(value);
            }
        }
    }
}

/*
   1트  10
     2트 숫자변환 불가  finally 10 // 10이 나오는 이유 : strArray[i] parseInt 실행이 불가 할당연산자 실행 x 직전에 value값인 10이 출력
     3트  인덱스 초과 finally 10 : 마찬가지로 value에서 할당연산자가 실행 불가 - idexOutOfBound 따라서 직전 값인 value 10이 실행
*/
