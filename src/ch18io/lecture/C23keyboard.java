package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {

        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

            // 한줄로 쓰게 된다면 ->?
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            line = br.readLine() ; // 한 줄씩 읽기
            System.out.println("line1 = " + line);
            String line2 = br.readLine();
            System.out.println("line2 = " + line2);
            System.out.printf("");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}


/*
* 여러 스트림 연결하는 예제 (복습 )
* Input, Output  -> IntputStreamReader , OutputStreamReader - >
* BufferStreamReader , BufferStreamWirter
*
* readLine() -> 한 줄씩 읽는 도구  ( try catch )
*
*
* */
