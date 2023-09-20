package ch19network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C06sever {
    public static void main(String[] args) {

        String path = "C:/Temp/test-client.png";

        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream((fos));

            try( socket; serverSocket; fos; bos; is; bis) {
                byte[] bytes = new byte[1024];
                int len = 0;

                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                System.out.println("파일 다 받음");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* 파일 수신 서버 생성 과정 예제

이 코드는 클라이언트로부터 파일을 수신하고 지정된 경로에 저장하는 간단한 파일 수신 서버입니다.

서버 소켓(ServerSocket)을 포트 3000에서 생성하고 클라이언트 연결 대기.
클라이언트 연결이 수락되면 클라이언트와 통신하기 위한 소켓(Socket) 생성.
클라이언트로부터 데이터를 읽기 위한 입력 스트림 설정.
수신한 데이터를 파일로 저장하기 위한 출력 스트림 설정.
데이터를 읽어와 파일로 저장하고, 모든 리소스를 자동으로 닫기 위해 try-with-resources 블록 사용.
예외 처리: 파일 또는 네트워크와 관련된 예외가 발생하면 예외 정보 출력.
* */