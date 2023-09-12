package ch18io.lecture;

public class C24varagrgs {
    public static void main(String[] args) {

    method1(3);
    method1 (5,6);
    method1(new int[] {10,20,30});

    //가변인자 이후
        method2();
        method2(2);
        method2(3,4);
        method2(6,7,8);
    }

    public static void method3(Double d, String s, int...args){
        //사용시 주의할 점
        //파라미터 목록 마지막에만 작성 가능
    }

//    아규먼트를 활용 한다면? 사용법 : 배열을 사용한다
    public static void method2(int ...nums){
    for (int i = 0 ; i< nums.length ; i++){
        System.out.println("nums[i] = " + nums[i]);

    }
    }


    /* 아규먼트 .. 가 없었다면?*/
    public static void method1(int a){
    }
    public static void method1(int a, int b ){
    }
    public static void method1(int[] arr){
    }

}

/* 변경 가능한 아규먼트 .. 아규먼트가 없었다면? 아규먼트의 역할
* 여러개의 인티저를 받고 싶다?
*  가변인자가 없었던 시절엔 여러개를 적고 오버라이딩 한다.
*
* */