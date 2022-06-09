public class Population {
    static Integer birth = 157680000 / 7, death = 157680000 / 13,immig = 157680000 / 45;
    static Integer Popu;
    public static void main(String[] args) {
        Popu = (312032486 + birth + immig) - death  ;
        System.out.println("population for each of the next five years is " + Popu);
    }
}