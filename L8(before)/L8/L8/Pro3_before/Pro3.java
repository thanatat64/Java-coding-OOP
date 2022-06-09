public class Pro3 {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle("red", true, 5, 8);
        Rectangle shape2 = new Rectangle("white", true, 5, 10);
        System.out.println(shape1);
        System.out.println("======================================================================");
        System.out.println(shape2);
        System.out.println("======================================================================");
        System.out.println(shape1.compareTo(shape2));
        System.out.println(shape1.equals(shape2));
    }
}