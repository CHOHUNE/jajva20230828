package ch13generic.book.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {

        Product<TV,String> product1 = new Product<>();

        product1.setKind((new TV()));
        product1.setModel("스마트 Tv");

        TV tv= product1.getKind();
        String tvModel= product1.getModel();

        Product<Car,String> product2= new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV");

        Car car = product2.getKind();
        String carModel=product2.getModel();

    }
}


//getter 의 메서드가 제네릭 타입파라메터 덕에 강제 형변환이 이루어지지 않음
// getKind getModel 부분