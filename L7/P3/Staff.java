public class Staff extends Employee{
    private String title;

    public Staff(String title) {
        this.title = title;
    }
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary,String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    } 

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    protected String data() {
        return super.data() + String.format(" Staff{title=%s}",title);
    }
    @Override
    public String toString() {
        return "Staff\n" + data();
    }
}
