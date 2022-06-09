import java.util.Date;
public class Employee extends Person{
    private Date date = new Date();
    private String office;
    private double salary;

    public Employee() {
    }
    
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }

    public Date getDate() {
        return this.date;
    }
    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    protected String data() {
        return super.data() + String.format(" Employee{Date=%s, office hours=%s, salary=%f}",date,office,salary);
    }
    @Override
    public String toString() {
        return "Employee\n" + data();
    }

}
