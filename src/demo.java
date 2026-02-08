public class demo {
    public interface IColorable{
        // hằng số: mặc định các biến đc khai báo trong interface
        public static final String yellow = "Vàng";
        public static final String red = "đỏ";
        // phương thức trừ tượng là phương thức ko có phần thân
        public abstract void showColor(String color);

        String getColor(String color);
    }
}
