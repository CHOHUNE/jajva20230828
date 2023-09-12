package ch18io.book.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("C:/Temp/test.txt");

            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* 1문자씩 읽는 read 와 배열단위로 읽는 read 만들기
*
*
* */
