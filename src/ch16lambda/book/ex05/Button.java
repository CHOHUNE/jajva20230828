package ch16lambda.book.ex05;

public class Button {
    @FunctionalInterface
    public static interface ClickListener{

        void onClick();
    }


    //
    private  ClickListener clickListener;
    public void setClickListener(ClickListener clickListener){
        this.clickListener=clickListener;
    }
    public void click(){
        this.clickListener.onClick();
    }
}


//필드 타입,매개변수, 메소드의