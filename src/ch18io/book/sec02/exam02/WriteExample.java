package ch18io.book.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");
            try(os){
                byte[] array={10,20,30};
                os.write(array);
                os.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

/* byte[] 배열을 만들어서 데이터를 수록 후  wirte-> 내보내는 예제

활용
try with resources 활용
byte[]
write()


1.OutputStream-> new FileOutputStream(경로)
2. byte[] 배열 선언

witre ( byte[] b) wirte 메서드에 배열을 다 씀
write ( byte[] b , int off, int len ) off에서 부터 len 개를 씀


* */