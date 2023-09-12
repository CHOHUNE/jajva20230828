package ch18io.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db");) {
            byte[] data = new byte[100];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.toString();
        }
    }
}
/*유형
read

 * ch18 sec02 exam02 WriteExample 에서 C:/Temp/test2.db에 저장한 내용 끝가지 읽고 출력하기
 * 과정
 * 100byte 변수 생성
 * int read 변수 생성( 파라메터에 byte 변수 ) 파라메터
 * while 로 true일때만 실행 -
 * if 로 num(read)가 -1일때 break
 * for로 num만큼 i가 sout(data[i]
 * catch문은 파일명 못찾을 때 + IOE 오류 제외 추가
 * */
