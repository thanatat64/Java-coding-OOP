import java.util.Scanner;

public class Pro1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Name and age: ");
        String[] Value = scan.nextLine().split(" ");
        String name = Value[0];
        int age= Integer.parseInt(Value[1]);
        System.out.print("Weight (input format: 1=kg 2=pound value): ");
        int type = scan.nextInt();
        double weight = scan.nextDouble();
        if (type == 1) {
            weight /= 0.45359237;
        }
        System.out.print("Height (input format: 1=meter 2=feet-inch): ");
        type = scan.nextInt();
        double height;
        if (type == 1) {
            height = scan.nextDouble() / 0.0254;
        }
        else{
            height = scan.nextDouble()*12 + scan.nextDouble();
        }
        BMI bmi = new BMI(name, age, weight, 0, height);
        System.out.println("Your BMI: " + Math.round(bmi.getBMI()*100)/100.0);
        System.out.println("Interpretation: " + bmi.getStatus());
        
    }
}
//String name = scan.nextLine();
// System.out.print("age: ");
//int age = scan.nextInt();