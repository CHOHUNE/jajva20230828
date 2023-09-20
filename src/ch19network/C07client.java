package ch19network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class C07client {
    public static void main(String[] args) {
        try{
        Socket socket= new Socket("172.30.1.3",5000);
        String path = "C:/Temp/";
        InputStream is =socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);

        FileOutputStream fos =new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        try(bos; fos; is; bis){

            byte[] bytes = new byte[1024];
            int len =0;

            while(((len=bis.read(bytes))!=-1)){
                bos.write(bytes,0,len);
            }
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
*  클라이언트에서 서버로부터 데이터를 수신하고 디렉토리에 저장하는 예제
*
* 서버에 연결: "172.30.1.3" IP 주소와 5000 포트로 서버에 소켓 연결을 시도합니다.

입출력 스트림 설정: 클라이언트에서 서버로부터 데이터를 읽어오기 위해 InputStream을 설정하고, 받은 데이터를 로컬 디렉토리에 저장하기 위해 FileOutputStream을 설정합니다.

데이터 수신 및 저장: InputStream을 통해 서버로부터 데이터를 읽어와서 FileOutputStream을 통해 로컬 디렉토리에 저장합니다.

자원 해제: try-with-resources 블록을 사용하여 모든 열린 스트림과 소켓을 자동으로 닫습니다.

예외 처리: 파일 또는 네트워크와 관련된 예외가 발생하면 예외 정보를 출력합니다.
* */