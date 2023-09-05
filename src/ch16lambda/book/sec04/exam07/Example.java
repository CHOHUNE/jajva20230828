package ch16lambda.book.sec04.exam07;

public class Example {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(Operactor operactor){
        int result= scores[0];
        for(int score : scores){
            result=operactor.apply(result,score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(new Operactor() {
            @Override
            public int apply(int x, int y) {
                return Math.max(x, y);

            }
        });

        int min = maxOrMin( (x,y)->{
           return Math.min(x,y);
        });

        System.out.println("최소값"+min);

    }
}
