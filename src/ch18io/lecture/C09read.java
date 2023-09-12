package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(file)) {
            byte[] b = new byte[3];
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
*
* read( byte) 를 했을 때
* byte[]가 b가  new byte [3]이 할당되면 3byte를 읽어들인다
* 10개의 문자를 3번 불러읽어 마지막 1바이트만 남게 되면 직전에 불러읽어들인 나머지 두개 바이트는 그대로 있고
* 새로 불러 읽어들인 1바이트만 새 값이 씌워진다

* -> 같은 변수에 할당하고 있기 때문
* */
