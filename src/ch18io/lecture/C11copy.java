package ch18io.lecture;

import javax.imageio.IIOException;
import java.io.*;

public class C11copy {
    public static void main(String[] args) {
        String src="C:/Temp/test2.png";
        String des="C:/Temp/test3.png";


        try(InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);
        ){
            byte[]buff= new byte[1024];
            int len=0;
            while(true){
             len=is.read(buff);
             if(len==-1)break;
             os.write(buff,0,len);

            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
