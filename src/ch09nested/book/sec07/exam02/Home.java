package ch09nested.book.sec07.exam02;

public class Home {
    private RemoteControl rc= new RemoteControl() {
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    };
    public void use1(){
        rc.turnOff();
        rc.turnOn();
    }

    // 객체생성 / 상속 동시에 해도 해당 클래스 내에서 객체 사용이 자유롭다
    public void use2(){
        RemoteControl rc=new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨켬");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨끔");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
    public void use3(RemoteControl rc){
        rc.turnOff();
        rc.turnOn();
    }
}

