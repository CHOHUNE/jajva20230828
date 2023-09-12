package ch18io.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/test1.db");
            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
유 InputStream 의 read메서드를 -1을 반환할때 break

활 read 메서드는 int값을 반환하므로 int 변수에 할당해서 써야한다

과


* * */