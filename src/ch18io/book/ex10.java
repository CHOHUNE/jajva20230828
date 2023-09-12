package ch18io.book;

import java.io.*;

public class ex10 {
    public static void main(String[] args) {
        String path="src/ch18io/book/ex10.java";
        File file= new File(path);
        String des="C:/Temp/test10copy.java";

        try(
                InputStream is= new FileInputStream(path);
                OutputStream os = new FileOutputStream(des);
                BufferedInputStream is2= new BufferedInputStream(is);
                BufferedOutputStream os2= new BufferedOutputStream(os);

        ){
            try(is2;os){

                if(!file.exists()){
                    System.out.println("파일이 존재하지 않습니다.");
                }
//                상위 경로가 있는지 검사하는 메서드가 필요함. isDirectory X
//                대상 경로에 폴더명만 끊어서 확인하는 방법도 있다.
//                .getParent()
                if(!file.isDirectory()){
                    file.mkdirs();
                    System.out.println("디렉토리 생성 완료");
                }

                int len=0;
                byte[] buff=new byte[10240];
                while( (len=is.read(buff)) !=-1){
                    os.write(buff,0,len);
                    System.out.println("복사가 성공 되었습니다");

                }
            }
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
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

