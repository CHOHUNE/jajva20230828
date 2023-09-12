package ch18io.lecture;

import java.io.File;

public class C30directory {
    public static void main(String[] args) {
        String path= "C:/Temp/test";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists());
        if(!file.exists()){
            file.mkdir(); // 폴더 만들기 ( 디렉토리 만들기)
        }

    }
}

/*
*
* .isDirectory()  폴더인가 아닌가
* .mkdir()  - make directory
* .mkdirs() - make directories
* */
