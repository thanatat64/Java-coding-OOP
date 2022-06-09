public class SavingAccount extends Account{
    private double overdraftLimit;
    public SavingAccount(){  
    }
    public SavingAccount(int id,double balance){
        super(id,balance);
    }
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    } 
    @Override
    public void withdraw(double amount) {
        if ( getBalance()+ overdraftLimit >= amount) {   
            super.withdraw(amount);
        }
        else{
            System.out.println("Balance is not enough");
        }
    }

    @Override
    public String toString() {
        return "Saving Account---\nBalance is " + getBalance();
    }

}