import java.util.ArrayList;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated  = new Date();
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public Account(){
    }
    public Account(String name, int id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return  balance * getMonthlyInterestRate()/100;
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("*****************************************************************************");
            System.out.println("Withdraw :" + amount + " You can't withdraw because not have enough money");
            System.out.println("*****************************************************************************");
        }
        else{
            if (amount > 0) {
                balance -= amount;
                transactions.add(new Transaction('W', amount, balance, ""));
            }
            else{
            System.out.println("*****************************************************************************");
            System.out.println("Withdraw :" + amount + " Error!!! please try it again");
            System.out.println("*****************************************************************************");
            }
        }
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, ""));
    }
    public int getId() {//accessor(get)
        return id;
    }
    public void setId(int id) {//mutator(set)
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}