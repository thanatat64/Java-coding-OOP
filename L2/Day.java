import java.util.Scanner;

public class Day {
    static Scanner scan = new Scanner(System.in);
    static String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static void main(String[] args) {
        System.out.print("Enter today's day: ");
        int today = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int nextDay = scan.nextInt();
        if (today < 0 || nextDay < 0) {
            System.out.println("you can't input number less than zero");
        }
        else{
            System.out.println("Today is "+ days[today]+" and the future day is "+days[(today + nextDay) % 7]);
        }
    }
}
//64010312 ธนทัต จงกิตติสกุล