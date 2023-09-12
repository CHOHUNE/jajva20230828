package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        String field1 = "C:/Temp/out5.txt";
        String field2 = "C:/Temp/out6.txt";

        try {
            OutputStream os = new FileOutputStream(field1);
            Writer writer = new FileWriter(field2);
            try (os; writer) {
                os.write(65);
                writer.write(65);

                os.write(48124);
                writer.write(48124);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
* 바이트 단위 - 문자 단위 입출력 스트림 비교
* 결과는 같지만 방식은 전혀 다르므로 때와 상황에 맞게 달리 써야 한다.
*
*
* */