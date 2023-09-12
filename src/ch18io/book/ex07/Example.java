package ch18io.book.ex07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String path="C:\\Users\\user\\IdeaProjects\\jajva20230828\\src\\ch18io\\book\\ex07\\Example.java";
        try(
        FileReader fr= new FileReader(path);
        BufferedReader br= new BufferedReader(fr);)
        {
            try (fr;br){
                int rowNumber=0;
                String rowData;
                while(true){

                    rowData= br.readLine();
                    rowNumber++;
                    if(rowData==null)break;
                    System.out.println(rowData);
                    System.out.printf("%2d: %s%n",rowNumber,rowData);
//                    %2개 공간의 숫자:%문자%줄갈음

                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
       }
}

/*
*  readLine 은 더이상 읽을게 없을 때 null을 함 -? if() 문 추가
*
* */