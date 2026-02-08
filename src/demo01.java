public class demo01 {
    public static class car implements demo.IColorable {
        @Override
        public void showColor(String color) {
            System.out.println(color);
        }

        @Override
        public String getColor(String color) {
            return "h" + color.hashCode();
        }
    }
    public static void main(String[] args) {
        demo.IColorable car = new car();
        car.showColor((demo.IColorable.red));
    }
    public abstract class kk{
        private String name;
        protected kk(String name){
            this.name = name;
        }
    }
}
