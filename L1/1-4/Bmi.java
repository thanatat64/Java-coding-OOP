import java.util.Scanner;

public class Bmi{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds ");
        double weight = scan.nextDouble() * 0.45359237;
        System.out.print("Enter height in inches ");
        double height = scan.nextDouble() * 0.0254;
        if(height == 0){
            System.out.println("Error");
        }
        else{
            System.out.println("BMI is "+ weight/(height*height));
        }
    }
}