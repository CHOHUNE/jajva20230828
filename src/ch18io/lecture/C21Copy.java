//package ch18io.lecture;
//
//import java.io.*;
//
//public class C21Copy {
//    public static void main(String[] args) {
//
//        try (
//                InputStream is = new BufferedInputStream("C:/Temp/test1.png");
//                OutputStream os = new BufferedOutputStream("C:/Temp/test2.jpeg");
//                ){
//            byte[] buff = new byte[1024];
//            int len =0;
//            while( (len=is.read(buff))!=-1) {
//                os.write(buff,0,len);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.toString();
//        }
//    }
//}
