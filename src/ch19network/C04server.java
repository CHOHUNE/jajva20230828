package ch19network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C04server {
    public static void main(String[] args) {

       try {
           ServerSocket serverSocket = new ServerSocket(3000);
           Socket socket = serverSocket.accept();

           OutputStream os = socket.getOutputStream();
           OutputStreamWriter ows = new OutputStreamWriter(os);
           BufferedWriter bw = new BufferedWriter(ows);
           try(serverSocket;os;ows;bw){

               bw.write("하이 클라이언트");
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }


    }}



/* 간단한 서버 소켓 생성과 클라이언트 연결을 기다리며 연결되면 클라이언트에게 메세지 전송

코드 순서

서버 소켓(ServerSocket)을 포트 3000에서 생성하고 클라이언트 연결 대기.
클라이언트 연결이 수락되면 출력 스트림 설정.
클라이언트에게 "서버가 실행되었습니다." 메시지를 보내고 소켓과 스트림을 닫음.
예외 처리: 예외 발생 시 스택 트레이스 출력.


*
* */