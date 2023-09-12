package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C12writer문자입력 {
    public static void main(String[] args) {
        String path = "C:/Temp/out4.txt";
        try(Writer writer=new FileWriter(path)){

            writer.write('손');
            writer.write('흥');
            writer.write('궈');

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}


/*
Writer 추상클래스 -
FileWriter 클래스(파라메터-경로 혹은 경로 String)
wirte 메서드(파라메터 - char or int or String
- (char는 int로 자동 형변환 )


*
**/