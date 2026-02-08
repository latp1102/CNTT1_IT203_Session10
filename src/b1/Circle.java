package b1;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimter(){
        return 2 * Math.PI * radius;
    }
}
