package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {

        //OutputStream : byte 단위 출력 스트림

        try {
            OutputStream os =new FileOutputStream("out.txt");
            os.write(70);
            os.write(71);
            os.write(73);

            os.close(); // 항상 닫아줘야 함

//            Integer를 넣었지만 나머지 3byte는 버려짐
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
