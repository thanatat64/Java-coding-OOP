import java.util.Scanner;
public class Three{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int input = scan.nextInt();
        int num = 0;
        if(input < 1 || input >999){
            System.out.println("Please input number between 0-1000");
        }        
        else{
            while(input > 0){
                num += input % 10;
                input /= 10;
            }
            System.out.println("Answer" + num);
        }
    }
}