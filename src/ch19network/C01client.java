package ch19network;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class C01client {
    public static void main(String[] args) {

        try(
        Socket socket= new Socket ("172.30.1.3",3000);
        Writer writer=new OutputStreamWriter( socket.getOutputStream());
        BufferedWriter bw=new BufferedWriter(writer);
        ){
            bw.write("gdgdbabae");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }}


/*
* Socket 예제

Socket 객체를 생성하여 서버에 연결합니다.

텍스트 데이터를 서버로 보내기 위해 Writer와 BufferedWriter를 설정합니다.

try-with-resources를 사용하여 자원을 자동으로 닫도록 합니다.

"안녕"이라는 문자열을 서버로 전송합니다.

예외가 발생하면 스택 트레이스를 출력하여 예외를 처리합니다.

* *
*
*
* */