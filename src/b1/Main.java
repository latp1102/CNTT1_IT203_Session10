package b1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectange = new Rectange(4, 5);
        System.out.println("Hình tròn: ");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimter());
        System.out.println();
        System.out.println("Hình chữ nhật: ");
        System.out.println("Diện tích: " + rectange.getArea());
        System.out.println("Chu vi: " + rectange.getPerimter());
    }
}
