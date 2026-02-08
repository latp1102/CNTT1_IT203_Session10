package OnTap;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    public FullTimeEmployee(){}
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Basic Salary: ");
            double temp = Double.parseDouble(sc.nextLine());
            if(temp >= 0){
                setBasicSalary(temp);
                break;
            }
        }
        while (true){
            System.out.println("Bonus: ");
            double temp = Double.parseDouble(sc.nextLine());
            if(temp >= 0){
                setBonus(temp);
                break;
            }
        }
    }

    @Override
    public double getSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void dispaly() {
        super.dispaly();
        System.out.println("FullTime | Salary: " + getSalary());
    }

}
