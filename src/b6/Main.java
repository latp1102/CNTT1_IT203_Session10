package b6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Mouse", 20));
        products.add(new Product("Keyboard", 50));

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần:");
        for (Product p : products) {
            System.out.println(p);
        }
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("\nSắp xếp theo tên A-Z:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
//Ghi chú
// Anonymous Class được dùng khi cần cài đặt interface với logic phức tạp
// hoặc cần thêm thuộc tính nội bộ, Lambda không làm được điều này
// Lambda Expression chỉ dùng cho Functional Interface và phù hợp khi logic ngắn gọn
// giúp code súc tích và dễ đọc hơn

