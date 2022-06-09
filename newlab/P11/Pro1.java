import java.util.Scanner;

public class Pro1 {
    static Scanner may = new Scanner(System.in);
    public static void main(String[] args) {
        Circle cir = new Circle("red", true, 5);
        Rectangle rec = new Rectangle("blue", true, 5, 10);
        Triangle tri = new Triangle("black", true, 3, 4, 5);
        String may  =new String();
        GeometricObject.displayObject(may);
        GeometricObject.displayObject(cir);
        System.out.println("--------------------------------------------------------------------");
        GeometricObject.displayObject(rec);
        System.out.println("--------------------------------------------------------------------");
        GeometricObject.displayObject(tri);
        System.out.println("--------------------------------------------------------------------");
    }
} 