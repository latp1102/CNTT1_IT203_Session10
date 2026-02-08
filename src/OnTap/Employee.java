package OnTap;

import java.util.Scanner;

public abstract class Employee implements IEmployee{
    private String id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Id: ");
            String temp = sc.nextLine();
            if(temp.matches("[A-Za-z]{2,4}\\d{4}")){
                setId(temp);
                break;
            }
            System.out.println("Sai định dạng");
        }
        while (true){
            System.out.println("Name: ");
            String temp = sc.nextLine();
            if(temp.length() >= 2){
                setName(temp);
                break;
            }
            System.out.println("Tên tối thiểu 2 ký tự");
        }
        while (true){
            System.out.println("age: ");
            int temp = sc.nextInt();
            if(temp >= 18){
                setAge(temp);
                break;
            }
            System.out.println("Tuổi phải lớn hoặc bằng 18");
        }
    }
    @Override
    public void dispaly() {
        System.out.print(getId() + "|" + getName() + "|" + getAge() + "|");
    }
    public abstract double getSalary();
}
