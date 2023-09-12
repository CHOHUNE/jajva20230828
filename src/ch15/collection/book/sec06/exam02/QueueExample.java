package ch15.collection.book.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("SendMail","홍길동"));
        messageQueue.offer(new Message("SendSMS","신용권"));
        messageQueue.offer(new Message("SendKaKaotalk","감자바"));

        while(!messageQueue.isEmpty()){
            Message message=messageQueue.poll();
            switch(message.command){
                case "SendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break;
                case " SendSMS" :
                    System.out.println(message.to+"님에게 SMS를 보냅니다");
                    break;
                case "SendKaKaotalk":

            }
        }

    }
}
