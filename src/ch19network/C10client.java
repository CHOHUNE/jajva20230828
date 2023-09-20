package ch19network;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {

        try (
                Socket socket = new Socket("172.8.10.1", 7000);
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter ows = new OutputStreamWriter(os);
                BufferedWriter bws = new BufferedWriter(ows);
                Scanner scanner = new Scanner(System.in);
        ) {
            while (true) {

                String line = scanner.nextLine();
                bws.write(line);
                bws.newLine();
                bws.flush();
                if (line.equals("bye")) break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



/* 사용자로부터 입력을 받아 서버에 텍스트를 전송하는 클라이언트

*서버에 연결 및 출력 스트림 설정: "172.30.1.81" IP 주소와 7000 포트로 서버에 소켓 연결을 시도하고, 서버에 데이터를 보내기 위한 출력 스트림 및 래퍼 스트림을 설정합니다.

사용자 입력 받기: 사용자로부터 텍스트를 입력받기 위해 Scanner를 사용합니다.

텍스트 전송: 사용자가 입력한 텍스트를 서버로 전송하고 버퍼를 비워 즉시 전송합니다.

무한 루프: 사용자가 "yes"를 입력할 때까지 입력과 전송을 반복합니다.

예외 처리: 파일 또는 네트워크 관련 예외가 발생하면 예외 정보를 출력합니다.
*
* */