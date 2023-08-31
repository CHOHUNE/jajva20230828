package ch08interface.book.sec11.exam06;

public class SoundableExample {

public static String printSound(Soundable soundable){

    System.out.println(soundable.sound());
    // void 타입이라 적어서 한참동안 오류가 발생했다.
    // String 으로 고치는 순간 return값이 있어야 한다


    return null;
}

    public static void main(String[] args) {
    printSound(new Cat());
    printSound(new Dog());


    }
}


