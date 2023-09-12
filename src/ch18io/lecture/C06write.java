package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path="C:/Temp/test2.db";
        try(
                OutputStream os= new FileOutputStream(path);

                ){

            byte[] b={65,66,67,68,69};
            os.write(b);
            os.write(b,0,2);
            os.write(b,2,2);
            os.flush();
        }catch(IOException e){
            e.printStackTrace();

        }
    }
}


/* wirte( byte[], int off , int len) 예제

활용
* ASCII  1byte로 표현할 수 있는 문자표현

과정
String path = "C:/Temp/output.txt"
OutputStream -> FileOutputStream(경로가 담긴 문자변수)
byte[] 선언

*
* */