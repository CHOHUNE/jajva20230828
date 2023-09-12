package ch11exception.lecture;

public class C09catch심화예제 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 0};
            int i = 3 / arr[0];
            System.out.println("try내의 흐름 ");
        }
/*
        코드 실행시 예상되는 exception 이 여러개일 때엔
        catch 블록을 여러개 만들면 된다!
*/
         catch(ArithmeticException e){
             System.out.println("잘못된 산술 연산");
         }catch(IndexOutOfBoundsException e){
            System.out.println("인덱스 오류");
        }
        System.out.println("실행 흐름 이어감 ");
    }
}
