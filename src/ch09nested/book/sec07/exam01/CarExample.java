package ch09nested.book.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.run1();
        car.run2();
    car.run3(new Tire(){
        @Override
        public void roll() {
            super.roll();
        }
    });

     //run3은 Tire tire 매개변수로 Tire 타입을 구현한 어떠한 객체든 올수 있는데
        // new Tire로 매개변수칸에서 인스턴스를 만들고, 이어서 그 tire를 상속받는
        //익명 클래스를 적어도 기능한다
    //Tire 도 올 수 있는데 매개변수 칸 안에서 바로 재정의해도 기능한다
        //
    }
}
