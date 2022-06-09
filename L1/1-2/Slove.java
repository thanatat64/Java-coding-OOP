import java.util.Scanner;

public class Slove {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        System.out.print("Value a :");
        a = scan.nextDouble();
        System.out.print("Value b :");
        b = scan.nextDouble();
        System.out.print("Value c :");
        c = scan.nextDouble();
        System.out.print("Value d :");
        d = scan.nextDouble();
        System.out.print("Value e :");
        e = scan.nextDouble();
        System.out.print("Value f :");
        f = scan.nextDouble();
        if((a*d - b*c) == 0){
            System.out.println("Error");
        }
        else{
            System.out.println("x = " + (e*d - b*f)/(a*d - b*c));
            System.out.println("y = " + (a*f-e*c)/(a*d - b*c));
        }

    }
}