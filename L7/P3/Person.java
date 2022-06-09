public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    public Person(){
    }
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    protected String data(){
        return "Name : " +  getName() + "\n" +  
        "Address : " + getAddress() +"\n" + 
        "Phone : " + getPhoneNumber() + "\n" + 
        "Email : " + getEmail() +"\n" + 
        String.format("Person{name=%s, address=%s, phoneNumber=%s, email=%s}",name,address,phoneNumber,email);

    }

    @Override
    public String toString() {
        return "Person\n"+ data();
    }

    
}