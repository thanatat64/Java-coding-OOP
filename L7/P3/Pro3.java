public class Pro3 {
    public static void main(String[] args) {
        String name = "Thanatat";
        String address = "teenoi";
        String phoneNumber = "062-590-2566";
        String email = "64010312@kmitl.ac.th";
        String office = "Home";
        double salary = 30000000;
         
        Person p = new Person(name, address, phoneNumber, email);
        System.out.println(p);
        Student s = new Student(name, address, phoneNumber, email, Student.FRESHMAN);
        System.out.println(s);
        Employee e = new Employee(name, address, phoneNumber, email, office, salary);
        System.out.println(e);
        Faculty f = new Faculty(name, address, phoneNumber, email, office, salary, "24/7", 1);
        System.out.println(f);
        Staff st = new Staff(name, address, phoneNumber, email, office, salary, "always sleeping always eating");
        System.out.println(st);
    }
}
