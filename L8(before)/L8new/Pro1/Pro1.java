import java.util.Scanner;
public class Pro1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("!!!Input 3 sides of the triangle!!! ");
        System.out.print("Input side1 : ");
        double s1 = scan.nextDouble();
        System.out.print("Input side2 : ");
        double s2 = scan.nextDouble();
        System.out.print("Input side3 : ");
        double s3 = scan.nextDouble();
        scan.nextLine();
        System.out.print("The Color is :");
        String color = scan.nextLine();
        System.out.print("The triangle is filled (y/n) : ");
        String check  = scan.nextLine();
        boolean filled = check.equals("y");
        Triangle t1 = new Triangle(color, filled, s1, s2, s3);
        System.out.println();
        System.out.println("---------------------------------------------");

        System.out.println(t1);
    }
}