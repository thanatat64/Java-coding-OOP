import java.util.Scanner;

public class Pro2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Creating circle 1, input radius: ");
        double rad1 = scan.nextDouble();
        System.out.print("Creating circle 2, input radius: ");
        double rad2 = scan.nextDouble();
        System.out.println("----------------------------------");
        Circle cir1 = new  Circle(rad1);
        Circle cir2 = new Circle(rad2);
        System.out.println("The max circle's radius is :"  + ((Circle)GeometricObject.max(cir1, cir2)).getRadius());
        System.out.println("===================================");
        System.out.print("Creating rectangle 1, input width and height: ");
        double[] input1 = new double[2];
        for (int i = 0; i < input1.length; i++) {
            input1[i] = scan.nextDouble();
        }
        System.out.print("Creating rectangle 2, input width and height: ");
        double[] input2 = new double[2];
        for (int i = 0; i < input2.length; i++) {
            input2[i] = scan.nextDouble();
        }
        System.out.println("-----------------------------------");
        Rectangle rec2 = new Rectangle(input2[0], input2[1]);
        Rectangle rec1 = new Rectangle(input1[0], input1[1]);
        System.out.println("The max rectangle's width and height are: "+ ((Rectangle)GeometricObject.max(rec1, rec2)).getWidth() + "," + ((Rectangle)GeometricObject.max(rec1, rec2)).getHeight());
        System.out.println("===================================");
    }
}
