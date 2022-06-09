import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Model> car = new ArrayList<Model>();
        System.out.println("!!!!Welcome to your Garage!!!!");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.printf("this is your car number : %d\n", i + 1);
            System.out.print("Enter brand : ");
            String brand = scan.next();
            System.out.print("Enter brandModel : ");
            String brandModel = scan.next();
            System.out.print("Enter CC : ");
            int cc = scan.nextInt();
            System.out.print("Enter yearModel : ");
            int yearModel = scan.nextInt();
            System.out.print("Enter torque : ");
            int torque = scan.nextInt();
            car.add(new Model(cc, yearModel, torque, brand, brandModel));
            System.out.println("------------------------------------------------------------");
        }
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i).toString());
        }
        // use interface
        for (int i = 0; i < car.size()-1; i++) {
                int check = car.get(i).compareTo(car.get(i + 1));
                if (check == 1) {
                    System.out.println("if you want to choose fastest car in garage");
                    System.out.printf("%s %s is fast than %s %s\n", car.get(i).getName(),
                            car.get(i).getNameModel(), car.get(i + 1).getName(), car.get(i + 1).getNameModel());
                } else if (check == -1) {
                    System.out.println("if you want to choose fastest car in garage");
                    System.out.printf("%s %s is fast than %s %s\n", car.get(i + 1).getName(),
                            car.get(i + 1).getNameModel(), car.get(i).getName(), car.get(i).getNameModel());
                }
        }
        //use exception handleling
        System.out.println("***********************************************************");
        int choose;
        System.out.print("choose car number :");
        choose = scan.nextInt();
        try {
            System.out.println("You choose : " + car.get(choose-1).getName() + " " +car.get(choose-1).getNameModel());
            System.out.println("lets go!!!!!!");
        } catch (Exception e) {
            System.out.println("!!!Error Please Try Again!!!");
        }
    }
}
