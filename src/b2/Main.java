package b2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda");
        Vehicle bicycle = new Bicycle("Đi bộ");
        car.move();
        bicycle.move();
    }
}
