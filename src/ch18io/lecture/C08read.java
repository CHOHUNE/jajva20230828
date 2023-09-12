package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {
    public static void main(String[] args) {

        String file = "C:/Temp/Out3.txt";

        try (InputStream is = new FileInputStream(file);
        ) {
            byte[] arr = new byte[3];
            int read= is.read(arr);
            int read1= is.read(arr);
            int read2= is.read(arr);
            int read3= is.read(arr);
            int read4= is.read(arr);

            System.out.println("read1 = " + read1);
            System.out.println("read1 = " + read2);
            System.out.println("read1 = " + read3);
            System.out.println("read1 = " + read4);
//                    3, 3, 3, 1 ,-1

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
예제
read 메서드 파라메터 타입을 써서 활용 해보기 읽어들인
byte 가 없을 경우 -1을 반환하는지 보기

과정


* */
