package ch15.collection.book.exercise.p07;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Board(String title, String content, String s) {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
