package ch19network;

import java.io.*;
import java.net.Socket;

public class C05client {
    public static void main(String[] args) {
    String path= "C:/Temp/test.png";

    try {
        Socket socket = new Socket("172.30.1.81", 3000);
        FileInputStream fileInputStream = new FileInputStream(path);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        int len=0;
        byte[] bytes = new byte[1024];
        try(bos;outputStream;bufferedInputStream;fileInputStream;socket){
            while( (len = bufferedInputStream.read(bytes))!= -1 ){
                bos.write(bytes,0,len);
            }

        }
    }
    catch(Exception e){
        e.printStackTrace();
    }

    }}

/* 전송할 파일을 읽어올 Input 은 socket 하고 별도 연결이 필요 없으므로 처음부터 File - > Bufferd 로 불러 들여 온다. */


/* cliet -> server 전송 예제 + copy

파일 경로 설정: path 변수에 전송할 파일의 경로를 지정합니다.

소켓 생성: 서버의 IP 주소(여기서는 "172.30.1.3")와 포트 번호(3000)로 서버에 연결하기 위해 소켓(Socket)을 생성합니다.

입력 스트림 설정: 전송할 파일을 읽어오기 위해 FileInputStream을 사용하고, 이를 BufferedInputStream으로 래핑하여 입출력 성능을 향상시킵니다.

출력 스트림 설정: 파일 데이터를 서버로 전송하기 위해 OutputStream을 얻고, 이를 BufferedOutputStream으로 래핑하여 데이터를 블록 단위로 보내는 입출력 성능을 향상시킵니다.

파일 데이터 전송: 파일의 내용을 읽어와 버퍼를 통해 서버로 전송합니다. 이때 1024바이트씩 읽어와 전송하며, 데이터의 끝까지 반복합니다.

try-with-resources 블록을 사용하여 모든 열린 스트림과 소켓을 자동으로 닫습니다.

예외 처리: 파일이나 네트워크 연결과 관련된 예외가 발생하면 스택 트레이스를 출력합니다.
 */