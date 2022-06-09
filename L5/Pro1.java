public class Pro1 {
    public static void main(String[] args) {
        Account ac = new Account(1122,20000);
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500);
        ac.deposit(3000);
        System.out.println(ac.getBalance());
        System.out.println(ac.getMonthlyInterest());
        System.out.println(ac.getDateCreated());

    }
}