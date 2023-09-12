package ch18io.book.sec02.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test1.png";
        String targetFileName = "C:/Temp/test2.jpeg";

        try (
                InputStream is = new FileInputStream(originalFileName);
                OutputStream os = new FileOutputStream(targetFileName)
        ){
        while(true){
            byte[] data = new byte[1024];
            int num = is.read(data);
            if (num == -1) break;
            os.write(data,0, num);
        }}


        catch(IOException e){
            e.printStackTrace();
        }
    }
}

/* 복사 예제
*
* is
*
**/


