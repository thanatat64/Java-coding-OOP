public class Faculty extends Employee{
    private String officeHours;
    private int rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,String officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    @Override
    protected String data() {
        return super.data() + String.format(" Faculty{office hours=%s, rank=%d}",officeHours,rank);
    }
    @Override
    public String toString() {
        return "Faculty\n" + data();
    }

}
