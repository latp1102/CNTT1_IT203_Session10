package b2;

public class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "-cách di chuyển: di chuyển bằng động cơ");
    }
}
