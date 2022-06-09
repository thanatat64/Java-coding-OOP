import java.util.*;
public class Pyramid3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        int num = scan.nextInt();
        if (num < 1 || num > 15) {
            System.out.println("You must enter an integer from 1 to 15");
        }
        else{
            for (int i = 1; i <= num; i++) {
                System.out.print("  ".repeat(num-i));
                for (int j = i ; j > 0  ; j--) {
                    System.out.print(j + " ");
                }
                for (int k = 2; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }      
        }
    }
}
//64010312 ธนทัต จงกิตติสกุล