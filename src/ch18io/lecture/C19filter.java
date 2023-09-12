package ch18io.lecture;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C19filter {
    public static void main(String[] args) {
        String src="C:/Temp/out8.txt";
        try{
            InputStream is= new FileInputStream(src);
            Reader reader= new InputStreamReader(is);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/* 스트림 변환 예제

InputStream ( 추상) - FileInputStream (클래스) -
-> Reader( 문자 입출력 ) - InputStreamReader(is) :

*
* */