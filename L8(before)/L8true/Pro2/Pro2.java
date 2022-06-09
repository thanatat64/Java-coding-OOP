public class Pro2 {
    public static void main(String[] args) {
        GeometricObject[] s = {new Square("red", true, 8),new Square("yellow", true, 9),new Square("blue", true, 10),new Square("black", true,11),new Square("white", true, 12)};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            ((Square)s[i]).howToColor();
            System.out.println();
        }
    }
}