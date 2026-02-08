package b5;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new OfficeStaff("Nguyễn Văn A", 12000);
        Employee e2 = new Manager("Nguyễn Văn B", 13000, 20000);
        e1.display();
        e2.display();
    }
}
