package ch14.thread.book.ex02;

public abstract class ThreadExample {
    public static void main(String[] args) {

        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}


