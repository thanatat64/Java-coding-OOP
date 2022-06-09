import java.util.*;
public class Pyramid {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("  ".repeat(num-1-i));
            for (int j = i ; j >= -i  ; j--) {
                System.out.print((Math.abs(j)+1)+ " ");
            }
            System.out.println();
        }
    }
}
