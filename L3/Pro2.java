import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {
    static Scanner scan = new Scanner(System.in);

    public static int[] merge(int[] list1, int[] list2) {
        int[] newList = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, newList, 0, list1.length);
        System.arraycopy(list2, 0, newList, list1.length, list2.length);
        Arrays.sort(newList);
        return newList;
    }

    public static void main(String[] args) {
        System.out.print("Enter list1 : ");
        int[] list1 = new int[scan.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.print("Enter list2 : ");
        int[] list2 = new int[scan.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scan.nextInt();
        }
        System.out.print("The merged list is ");
        for (int i : merge(list1, list2)) {
            System.out.print(i + " ");
        }
    }
}
//64010312 thanatat