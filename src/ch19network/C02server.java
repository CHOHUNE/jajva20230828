package ch19network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C02server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            InputStream is =  socket.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            try(serverSocket;is;socket;br){
                String line=br.readLine();
                System.out.println("line = " + line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }}
/*
* ServerSocket 객체를 생성하여 클라이언트의 연결을 수락할 포트(3000)를 설정합니다.

serverSocket.accept()를 호출하여 클라이언트의 연결을 기다리고, 연결이 수락되면 Socket
* 객체를 반환합니다.

데이터를 수신하기 위해 InputStream, InputStreamReader, 및 BufferedReader를 설정합니다.

try-with-resources를 사용하여 자원을 자동으로 닫도록 합니다.

클라이언트로부터 수신한 문자열을 br.readLine()을 사용하여 읽고, 그 값을 출력합니다.

예외가 발생하면 스택 트레이스를 출력하여 예외를 처리합니다.
*
* */