package b1;

public class Rectange implements Shape {
    private double width;
    private double height;
    public Rectange(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimter() {
        return 2 * (width+height);
    }
}
