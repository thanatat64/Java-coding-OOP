import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = scan.nextInt();
        int com  = (int)(Math.random()*3);
        if (user == 0) {
            if (com == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw ");
            }
            else if (com == 1){
                System.out.println("The computer is rock. You are scissor. You lost ");
            }
            else{
                System.out.println("The computer is paper. You are scissor. You win!!!! ");
            }
        }
        else if (user == 1) {
            if (com == 0) {
                System.out.println("The computer is scissor. You are rock. You win!!!! ");
            }
            else if (com == 1){
                System.out.println("The computer is rock. You are rock too. It is a draw");
            }
            else{
                System.out.println("The computer is paper. You are rock. You lost ");
            }
        }
        else{
            if (com == 0) {
                System.out.println("The computer is scissor. You are paper. You lost ");
            }
            else if (com == 1){
                System.out.println("The computer is rock. You are paper. You win!!!! ");
            }
            else{
                System.out.println("The computer is paper. You are paper too. It is a draw ");
            }
        }
    }
}
//64010312 ธนทัต จงกิตติสกุล