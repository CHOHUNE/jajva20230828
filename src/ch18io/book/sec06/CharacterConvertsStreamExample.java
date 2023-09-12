package ch18io.book.sec06;

import java.io.*;

public class CharacterConvertsStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }
}


/* 책 822p
보조스트림을 이용하여 write read 객체 만들기
write ->OutputStream(FileOutputStream) => Writer-OutputStreamWriter( 파라메터: 변환할 변수)
read -> InputStream (FileInputStream) => Reader-InputStreamWriter( 파라메터: 변환할 변수)


 * */