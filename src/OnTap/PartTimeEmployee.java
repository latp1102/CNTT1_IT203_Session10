package OnTap;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Working hours: ");
            int temp = Integer.parseInt(sc.nextLine());
            if(temp >= 0){
                setWorkingHours(temp);
                break;
            }
        }
        while (true){
            System.out.println("Hours rate: ");
            double temp = Double.parseDouble(sc.nextLine());
            if(temp >= 0){
                setHourlyRate(temp);
                break;
            }
        }
    }

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }
    @Override
    public void dispaly() {
        super.dispaly();
        System.out.println("PartTime | Salary: " + getSalary());
    }

}
