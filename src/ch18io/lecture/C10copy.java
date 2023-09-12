package ch18io.lecture;

import java.io.*;

public class C10copy {
    public static void main(String[] args) {
        String src = "C:/Temp/out3.txt";
        String des = "C:/Temp/out3_copy.txt";

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[3];

//            int len1 = is.read(b);
//            os.write(b, 0, len1);
//
//            int len2 = is.read(b);
//            os.write(b, 0, len2);

//            int len3 = is.read(b);
//            os.write(b, 0, len3);
//
//            int len4 = is.read(b);
//            os.write(b, 0, len4);
//
//            int len5 = is.read(b); // -1

            int len = 0;

            while ((len = is.read(b)) != -1) {
                os.write(b, 0, len);
            }

            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*           10byte 파일 변수 생성 후
*       InputStream으로 read 했을때 -1 일 때까지
*       OutputStream 으로 wirte 하기 -> wirte 할 int 변수 필요!
* */