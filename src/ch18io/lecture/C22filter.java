package ch18io.lecture;

import java.io.*;

public class C22filter {
    public static void main(String[] args)throws Exception {

        InputStream is = new FileInputStream("");
        InputStreamReader isr= new InputStreamReader(is);
        BufferedReader isrb= new BufferedReader(isr);

        OutputStream os= new FileOutputStream("");
        OutputStreamWriter osr= new OutputStreamWriter(os);
//        BufferedOutputStream bos= new BufferedOutputStream(bos);

    }
}

/*
* 보조 스트림 예제
* Input - FileInput - InputReader - Buff
* */