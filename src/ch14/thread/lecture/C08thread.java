package ch14.thread.lecture;

public class C08thread {
    public static void main(String[] args) {

        Thread tread1 = new Thread( ()->{
           for(int i = 0; i<5 ; i++){
               System.out.println("thread1");
               try{Thread.sleep(1000);
           }catch(InterruptedException e){
               throw new RuntimeException(e);
               }
           }
        });
        tread1.start();

        Thread thread2 = new Thread( ()->{
           for(int i=0; i<5 ; i++){
               System.out.println("thread2");
               try{Thread.sleep(1000);}
                       catch(InterruptedException e){
                   throw new RuntimeException(e);
                   }}
        });
        thread2.start();

        for(int i=0; i<5;i++){
            System.out.println("mainThread1");
            try{Thread.sleep(1000);}
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }


    }}



        /* 쓰레드 객체 2개와 메인 쓰레드 1개 만들기 예제 */
/* 각 쓰레드마다 쓰레드명 1초에 한개식 5번 출력
*
* */
/*계속해서 쓰레드를 만드는 방법은 두 가지가 있다 라는 것을 보여주고 있다.
 * 예제는 쓰레드1 쓰레드2 기본 흐름 순서 총 3개의 실행이 동시에 되고 있다는 것을 보여주고 있따.
 *
 * */