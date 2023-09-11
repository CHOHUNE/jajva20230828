package ch15.collection.book.exercise.p07;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();


        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        boolean contains = list.contains(new Board("제목","내용"));
        System.out.println("contains =" + contains);

        //객체가 담겨져 있는지 확인을 하려 할때 원하지 않는 결과가 나옴
    }
}
