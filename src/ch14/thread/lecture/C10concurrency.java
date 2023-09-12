package ch14.thread.lecture;

public class C10concurrency {
        private static int value = 0;

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000000; i++) {
                    for (int i = 0; i < 100; i++) {
                        value++;
                    }
                });
                t1.start();

                Thread t2 = new Thread(() -> {
                    for (int i = 0; i < 1000000; i++) {
                        for (int i = 0; i < 100; i++) {
                            value++;
                        }
                    });
                    t2.start();

                    try {
                        t1.join();
                        t2.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("value = " + value);
                }
            }




                    /*
                     * 동시에 실행될 때 생기는 문제
                     * 여러 쓰레드가 동시에 하나의 객체를 변경하거나 읽게 하지 말아야 한다.
                     * 여러개의 쓰레드가 동시에 순차적으로 실행하는게 이상적이지만
                     * 개수가 반복되다 보면 순차적으로 실행되는게 아니라 엇갈려서
                     * 의도치 않은 결과를 초래하기도 한다.
                     *
                     *
                     * */
