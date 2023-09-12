package ch18io.book.sec02.exam01;

import java.io.*;
public class WriteExample {
    // 10,20,30 저장된 바이트파일 C:\Temp\test1.db 로출력해서 저장하는 예제
    public static void main(String[] args) {


        try(OutputStream os = new FileOutputStream("C:/Temp/test1.db");)
        {
            try(os) {
                byte a=10;
                byte b=20;
                byte c=30;

                os.write(a);
                os.write(b);
                os.write(c);

                os.flush();
                os.close();
            }catch(IOException e){
                e.printStackTrace();
            }



        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
