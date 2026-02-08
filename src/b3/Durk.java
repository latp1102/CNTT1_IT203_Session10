package b3;

public class Durk extends Animal implements Swimmable, Flyable{
    public Durk(String name){
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(getName() + "đang bơi trên mặt nước");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " đang bơi trên trời");
    }
}
