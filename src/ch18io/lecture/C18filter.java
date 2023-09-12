package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C18filter {
    public static void main(String[] args) {
        // 보조스트림 (filter stream)
        // : 다른 스트림을 변환하는 스트림
        try {
            OutputStream os = getOutputStream("C:/Temp/out8.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            try (os; osw;) {
                osw.write('손');
                osw.write('흥');
                osw.write('민');

                osw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static OutputStream getOutputStream(String file) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(file);
        return os;
    }
}


/*
* 보조 스트림 예제 : 인코딩을 지정해 문자를 쓰고 싶은 경우
* OutputStream 을 OutputStreamWriter로 감싸기
*
* 스트림 -> 보조스트림1 -> 보조스트림2 -> 파일 -> 보조스트림2->보조스트림1->스트림
* */