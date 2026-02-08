package b2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand){
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+ "- cách di chuyển : Di chuyển bằng sức người");
    }
}
