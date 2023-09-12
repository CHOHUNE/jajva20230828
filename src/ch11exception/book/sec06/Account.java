package ch11exception.book.sec06;

public class Account {
    private long balance;
    public Account(){}
    public long getBalance(){
        return balance;
    }
    public void deposit (int money){
        balance +=money;
    }
    public void withdraw (int money) throws InsufficientException{
        if ( balance<money){
            throw new InsufficientException("잔고 부족 :" + (money-balance)+ "모자람");
        }
        balance -=money;
    }
}

 /*
 만약 balance 가 money 보다 부족하면 throw로 예외를 발생 시킨다
 예외 메세지는 Insufficientclass에서 message로 정의해놓음
*/