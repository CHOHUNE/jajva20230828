package ch19network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C03client {
    public static void main(String[] args) {
        try {


            Socket socket = new Socket("172.30.1.3", 3000);

             InputStream is = socket.getInputStream();
//        socket에서 읽어올 수 있는 건 InputStream 인데 Reader로 변환
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);


            br.readLine();
//        BufferedReader에서 읽기
            try( socket;is;isr;br){
                String line = br.readLine();
                System.out.println("서버가 보낸 내용 =" +line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


