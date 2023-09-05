package ch16lambda.book.ex05;

public class Example {
    public static void main(String[] args) {
        Button btnOk=new Button();
        btnOk.setClickListener(()-> System.out.println("Ok"));
        btnOk.click();

        Button btnCancel= new Button();
        btnCancel.setClickListener(()-> System.out.println("Cancel"));
        btnCancel.click();
    }
}

