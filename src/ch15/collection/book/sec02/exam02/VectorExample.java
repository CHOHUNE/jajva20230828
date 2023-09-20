package ch15.collection.book.sec02.exam02;

import ch15.collection.book.exercise.p07.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                list.add(new Board("제목" + i, "내용" + i, "글쓴이" + 1));
            }
        });


        Thread threadB = new Thread(() -> {
            for (int i = 1001; i <= 2000; i++) {
                list.add(new Board("제목" + i, "내용" + i, "글쓴이" + 1));
            }
        });

        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        }catch(Exception e){

        }

        int size= list.size();
        System.out.println("총 객체 수"+ size);
        System.out.println();
    }
}


