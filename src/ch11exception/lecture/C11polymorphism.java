package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try{

        }catch(NullPointerException e){

        }catch(ArithmeticException e){

        }
        try{
            //NullPointException
            //ArithmeticException 두 exception 다 상위타입인 Runtime으로 대치 가능하다
        }catch (RuntimeException e){
            // 여러 exception의 상위 타입
        }
    }
}
