package ch16lambda.book.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y) -> {
            int result = x+y;
        System.out.println();
    });
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x - y;
                System.out.println();
            }
        });
    }

    private static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
    }
}
