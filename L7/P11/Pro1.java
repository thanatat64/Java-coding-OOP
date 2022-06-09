import java.util.Scanner;

public class Pro1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Color: ");
        String color = scan.nextLine();
        System.out.print("Enter Side1: ");
        System.out.print("is filled?: ");
        boolean filled = scan.nextBoolean();
        double s1 = scan.nextDouble();
        System.out.print("Enter Side2: ");
        double s2 = scan.nextDouble();
        System.out.print("Enter Side3: ");
        double s3 = scan.nextDouble();
        if (Triangle.checkTriangle(s1, s2, s3)) {
            Triangle t1 = new Triangle(color, filled, s1, s2, s3);
            System.out.println(t1);
        }
        else
        {
            System.out.println("invalid side!!! please try again");
        }
    }
} 