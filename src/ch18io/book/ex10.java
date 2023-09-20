package ch18io.book;

import java.io.*;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        String srcPath = "";
        String desPath = "";

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("원본 파일 경로:");
            srcPath = scanner.nextLine();

            System.out.print("복사 파일 경로:");
            desPath = scanner.nextLine();

            File srcFile = new File(srcPath);
            if (srcFile.exists()) {
                File desFile = new File(desPath);
                File desFileDir = desFile.getParentFile();

                if (!desFileDir.exists()) {
                    desFileDir.mkdirs();
                }

                // 복사하는 일
                InputStream is = new FileInputStream(srcFile);
                OutputStream os = new FileOutputStream(desFile);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bos; bis; os; is;) {
                    byte[] read = new byte[1024];
                    int len = 0;

                    while ((len = is.read(read)) != -1) {
                        os.write(read, 0, len);
                    }

                    System.out.println("복사가 성공되었습니다.");
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


/*
* 원본 파일이 존재하지 않을 경우
* "원본 파일이 존재하지 않습니다." 를 출력
*
* 복사 파일 경로에서 디렉토리가 존재하지 않으면 모든 디렉토리 자동 생성
*
* 복사가 성공 되었을 때 " 복사가 성공 되었습니다"를 출력
*
*
* 1. copy 코드 - int len (읽은 값)  Byte or String ( buffer)
*  write( ㅇ
* 2. 디렉토리 존재하지 않을 경우 실패 메세지
* 3. 디렉토리 존재할 경우 성공 메세지
*
* */

