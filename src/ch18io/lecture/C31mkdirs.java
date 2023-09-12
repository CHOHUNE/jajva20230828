package ch18io.lecture;

import java.io.File;

public class C31mkdirs {
    public static void main(String[] args) {
        // midirs 여러 디렉토리 한 번에 만들기
        String path ="C:/Temp/test1/tes2/tes3";
        //폴더 안에 폴더 안에 폴더 만들기
        File file= new File(path);
        System.out.println("file.exists() = " + file.exists());
        if(!file.exists()){
            file.mkdirs();
            // mkdirs이 아닌 mkdirs를 써야 한다
            // mkdir을 쓰면 여러 폴더를 만들 수 없어 반환값이 false를 반환한다.
        }
    }
}


/*
*
*/