package ch18io.book.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try{
            Writer write= new FileWriter("C:/Temp/test.txt");
            char a='A';
            write.write(a);
            char b='B';
            write.write(b);
            char[] arr={'C','D','E'};
            write.write(arr);

            write.write("FGH");

            write.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
