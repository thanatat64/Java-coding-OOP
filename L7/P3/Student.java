public class Student extends Person{
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    private int status;
    private String[] statusName = {" ","FRESHMAN","SOPHOMORE","JUNIOR","SENIOR"};

    public Student(String name, String address, String phoneNumber, String email,int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    @Override
    protected String data() {
        return super.data() + String.format(" Student{status=%s}",statusName[status]);
    }
    @Override
    public String toString() {
        return "Student\n" + data();
    }
}
