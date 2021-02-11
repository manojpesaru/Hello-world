package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount(1234,0.00, "Manoj",
                "email@manoj.de", "+49-1716196760");
        /*bankAccount.setAccountNumber(1234);
        bankAccount.setBalance(1000);
        bankAccount.setCustomerName("Manoj");
        bankAccount.setEmail("manojpesaru@gmail.com");
        bankAccount.setPhone("01716196760");*/
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(500);
        bankAccount.withdraw(100);

        BankAccount emptyAccount = new BankAccount();
        System.out.println(emptyAccount.getBalance());
        System.out.println(emptyAccount.getCustomerName());

        BankAccount manojaccount = new BankAccount("Buddi","manoj@reddy.com","(0391)-22333");
        System.out.println(manojaccount.getBalance());
        System.out.println(manojaccount.getCustomerName());
    }
}
