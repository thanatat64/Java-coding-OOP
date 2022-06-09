import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Pro2 {
    static String[] ranks = { " assistant ", " associate ", " full " };
    static Random rand = new Random();

    public static void main(String[] args) {
        File file = new File("Salary.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 1; i < 1001; i++) {
                int r = rand.nextInt(3);
                writer.printf("FirstName" + i + " LastName" + i + ranks[r] + "%.2f\n",randomSalary(r));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static double randomSalary(int r) {
        if (r == 0) {
            return rand.nextDouble(50000, 80000);
        } else if (r == 1) {
            return rand.nextDouble(60000, 110000);
        }
        return rand.nextDouble(75000, 130000);

    }
}