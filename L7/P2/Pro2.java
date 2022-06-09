public class Pro2 {
    public static void main(String[] args) {
        Account ac = new Account("George",1122,1000);
        ac.setAnnualInterestRate(1.5);
        ac.deposit(30);
        ac.deposit(40);
        ac.deposit(30);
        ac.withdraw(-5000);
        ac.withdraw(1000);
        ac.withdraw(1200);
        if (ac.getBalance() < 0) {
            System.out.println("Error!!!");
        }
        else{
            System.out.println("Name: " + ac.getName());
            System.out.println("Account ID:  "+ac.getId());
            System.out.println("Annual interest rate: " + ac.getAnnualInterestRate());
            System.out.println("Balance: "+ ac.getBalance());
            System.out.println("Date                               Type           Amount         Balance   ");
            for (int i = 0; i < ac.getTransactions().size();i++) {
                Transaction t = ac.getTransactions().get(i);
                System.out.println(t.getDate() + "        "+  t.getType() + "              " +  t.getAmount() + "           " + t.getBalance());
            }
        }

    }
}
