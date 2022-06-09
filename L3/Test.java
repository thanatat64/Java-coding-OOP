public class Test {
    public static void main(String[] args) {
        String name = "Dee";
        String name2 = "Sanfong";
        String name3 = new String("Deee");
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name3));
    }
}
