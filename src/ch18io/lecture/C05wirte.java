package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05wirte {
    public static void main(String[] args) {
        String path= "C:/Temp/out2.txt";

        try (OutputStream os = new FileOutputStream(path);  
                ){
            byte[] b=new byte[100];
            os.write(1);
            os.write(2);
            os.flush();
            

        } catch (IOException e) {
            e.toString();
        }
    }
}
