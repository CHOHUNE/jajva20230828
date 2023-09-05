package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1= new Car("tesla",5000);
        Car car2= new Car("tesla",5000);
        Car car3= new Car("tesla",5000);
        System.out.println(car2.toString());
    }
}


class Car{
    private String model;
    private int price;

    public Car(String model, int pirce){
        this.model=model;
        this.price=price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}



//getter 메소드를 만들면 바로 return하는 메서드가 생성됨
// toString 메소드도 마찬가지로 만들어놓고 car2.toString 하면 됨