package ch18io.lecture;

import java.io.*;

public class C17copy {
    public static void main(String[] args) {
        String src="src/ch18io/lecture/C17copy.java";
        String des="C:/Temp/C17copy.java";

        try {

            InputStream is= new FileInputStream(src);
            OutputStream os=  new FileOutputStream(des);
            int len=0;
            byte[] buff = new byte[100];
            while( ( len= is.read(buff) )!=-1){
                os.write(buff,0,len);


           }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

/*
copy : 만들기 예제

InputStream => FileInputStream
byte[] , int len ( buff 를 read (얼마나 읽었는지) )
iputstream-read buff 만큼 읽어들이고 다시 off지점부터 buff만큼 read를 반복
outputstream-write read 만큼 쓰고

*/
