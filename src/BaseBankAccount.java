
public class BaseBankAccount {
    private String uuid;
    private double balance;
    private Customer customer;
    private String BankAccountNumber;
    private String Currency = "€";
    public BaseBankAccount(String uuid, double balance, Customer customer, String BankAccountNumber) {
        this.uuid = uuid;
        this.balance = balance;
        this.customer = customer;
        this.BankAccountNumber = BankAccountNumber;
    }
    public String getUuid() {
        return uuid;
    }
    public String  getBankAccountNumber() {
        return BankAccountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void AddBalance(double balance) {
        this.balance += balance;
    }
    public void  removeBalance(double balance) {
        if(this.balance - balance < 0) {
            throw new RuntimeException("Nedostatek Prostředků!");
        }
        this.balance -= balance;
    }
    public String getCurrency() {
        return Currency;
    }
}