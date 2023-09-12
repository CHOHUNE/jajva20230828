package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07inputStream {
    public static void main(String[] args) {

        String path = "C:/Temp/C07.txt";
        try (InputStream is = new FileInputStream(path);
        ) {
            int read1 = is.read();
            is.read();
            is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


/*
*
유형
inputStream 과 read 메서드 활용해서 콘솔에 출력
*
활용
inpustStream 활용
read 메서드 활용 : read() InputStream 으로부터 (1byte) int 0-255 or -1  읽어들임

* 과정
*
* */
