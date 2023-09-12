package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close(); // io stream을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {

        // try-with-resource 문법
        // try-with-resources 문법
        // 변수의 타입은 AutoCloseable이어야 함
        try (OutputStream os = new FileOutputStream("");) {

            os.write(33);
            os.write(67);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
        ) {
            fos.write(234);
            fis.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fio;fos;) {

                fio.read();
                fos.write(33);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void method6() throws IOException {
        // 안좋은 코드임... try catch구문을 생략하려고 햇으나 결과적으로
        //IOException을 throws 했으므로 exception이 발생하면 메서드를 호출한 곳으로 넘어감
        //  아래 기재된 메서드들은 실행되지 않음
//              try-catch-resources나 finally로 예외구문을 써서 예외를 추가하고 발생시 실행되지는 로직을 작성 해야함

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}







