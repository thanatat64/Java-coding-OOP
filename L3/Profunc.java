import java.util.Scanner;

public class Profunc {
    static Scanner scan = new Scanner(System.in);
    public static int computeGCD(int n1, int n2) {
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
    public static void main(String[] args) {
                System.out.print("Enter first number: ");
                int n1 = scan.nextInt();
                System.out.print("Enter second number: ");
                int n2 = scan.nextInt();
                int gcd = computeGCD(n1, n2);
                System.out.println("This is your answer : "+gcd);
    }
}
