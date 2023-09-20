package ch14.thread.lecture;

public class C14syncronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);
        Thread t1=new Thread( new Task(box));
        t1.start();

        Thread t2=new Thread ( new Task(box));
        t2.start();

        t1.join();
        t2.join();
        // 숫자 단위가 10000을 넘어 가며 여러 쓰레드가 동시다발적으로 실행 돼 20000이 안나올 수 있다
        System.out.println("box.getValue() = " + box.getValue());

    }
}

class Task implements Runnable{
    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<=10000 ; i++){
            box.increment();
        }
    }
}
class MyBox {
    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Object lock =new Object();

    public void increment() {
        synchronized (lock){   // (new Object()) 가 파라메터로 오면 계속 새 객체가 생겨나기 때문에 애초 의도에 벗어나게 된다.
            value++;
        }
    }

    /*
    * public synchronized void increment(){
    *  //메서드 자체가 싱크로나이즈드 될수 있다. 이때는 경쟁하는 lock 객체가 없다
    *  public synchronized void increment(this) 가 축약된 형태인데 경쟁하는 객체는
    *   " this " 함수 자체 라고 보면 된다
    * */

    public MyBox(int value) {
        this.value = value;
    }
}

/* syncronizedBlock 예제
* syncronized여러 객체가 동시에 들어가지 못하게 감싸주는 포장지
* 해당 코드 블럭은 실행되면 묶이고 다 실행되고 나면 반납한다
* 파라메터는 객체가 들어가야 한다 ( 아무 )
*
* */