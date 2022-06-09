public class Pro2 {
    public static void main(String[] args) {
        Course oop = new Course("oop");
        oop.addStudent("A");
        oop.addStudent("B");
        oop.addStudent("C");
        oop.dropStudent("C");
        oop.clear();
        oop.dropStudent("Godzilla");
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.println(oop.getStudents()[i]);
        }
    }
}
