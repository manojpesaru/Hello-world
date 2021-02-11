package learnjava.programming;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){
        this(56789,100,"DefaultName","DefaultEmail","DefaultPhone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance,String customerName, String email, String phone){
        System.out.println("Bank Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String customerName, String email, String phone) {
        this(9999,1000.37, customerName,email,phone);
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount){
        this.balance +=amount;
        System.out.println("Deposit of "+amount+" is processed. Balance is: "+this.balance);

    }
    public void withdraw(double amount){
        if(this.balance-amount<0){
            System.out.println("Only "+this.balance+" is available. Withdrawal is not possible");
        }
        else{
            this.balance-=amount;
            System.out.println("Withdrawal of "+amount+" is processed. Balance is: "+this.balance);
        }
    }
}
