package OnTap;

import java.util.Scanner;


public class Main {
    static Employee[] list = new Employee[100];
    static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ NHÂN SỰ =====\n");
            System.out.println("1. Thêm nhân sự");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm theo id");
            System.out.println("4. Xóa theo id");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập lựa chọn sai");
                    break;
            }
        }while (choice != 0);
    }
    static void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. FullTime");
        System.out.println("2. PartTime");
        System.out.println("Chọn: ");
        int c = Integer.parseInt(sc.nextLine());
        Employee e;
        if(c == 1){
            e = new FullTimeEmployee();
        }else {
            e = new PartTimeEmployee();
        }
        e.input();
        list[size++] = e;
    }
    static void showAll(){
        for(int i = 0; i < size; i++){
            list[i].dispaly();
        }
    }
    static void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        for(int i = 0; i < size; i++){
            if(list[i].getId().equalsIgnoreCase(id)){
                list[i].dispaly();
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }
    static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        for(int i = 0; i < size; i++){
            if(list[i].getId().equalsIgnoreCase(id)){
                for(int j = 0; j < size -1; j++){
                    list[j] = list[j+1];
                }
                size--;
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }
}
