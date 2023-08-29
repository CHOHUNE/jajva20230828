package ch08extends.book.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone("갤럭시",
                "은색");
        System.out.println("myPhone.model = " + myPhone.model);
        System.out.println("myPhone.color = " + myPhone.color);

        System.out.println("myPhone.wifi = " + myPhone.wifi);

        myPhone.bell();
        myPhone.snedVoice("냠");
        myPhone.receiveVoice("하잇");
        myPhone.snedVoice("요 히사시부리");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();

    }

}
