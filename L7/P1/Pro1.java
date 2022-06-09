public class Pro1 {
    public static void main(String[] args) {
        Account ac = new Account();
        CheckingAccount ch = new CheckingAccount(1,5000,5000);
        SavingAccount sa = new SavingAccount();
        System.out.println(ch);
        System.out.println("Withdraw: 10000.00");
        ch.withdraw(10000);
        System.out.println("Balance is " + ch.getBalance());
        System.out.println(sa);
        System.out.println("This account  was created at "+ac.getDateCreated());
    }
}