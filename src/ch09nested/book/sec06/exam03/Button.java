package ch09nested.book.sec06.exam03;

public class Button {
    public static interface ClickListenr {
        void onClick();
    }


    private ClickListenr clickListenr;

    public void setClickListenr(ClickListenr clickListenr) {
        this.clickListenr = clickListenr;
    }

    public void click() {
        this.clickListenr.onClick();
    }
}