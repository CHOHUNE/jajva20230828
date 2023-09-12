package ch11exception.book.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit (10000);
        System.out.println("예금액"+ account.getBalance());

        try{
            account.withdraw(30000);
        }
        catch (InsufficientException e){
            String message= e.getMessage();
            System.out.println(message);
        }
    }
}

//deposit은 int money를 받고  balance 에 +=
// balance 가 money 보다 적게 되므로  throw로 인한 insufficient 발생
// insufficient 에서 String message를 파라메터로 받고
// super로 오류메세지 출력을 받아 해당 설정 메셎 ㅣ출력이 됨
