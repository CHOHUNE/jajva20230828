package ch09nested.book.sec07.exam01;

public class Car {
    private Tire tire1= new Tire();

    private Tire tire2=new Tire(){

        @Override
        public void roll(){

        }
    };
    public void run1(){
        tire1.roll();
        tire2.roll();
    }


    public void run2(){
        Tire tire = new Tire(){
            @Override
            public void roll() {
                super.roll();
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();

        //tire 의 하위타입도 tire로 볼수 있으 roll이 올수 있다
    }
}
