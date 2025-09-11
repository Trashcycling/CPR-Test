public class BankAccount extends BaseBankAccount {

    public BankAccount(String uuid, double balance, Customer customer, String BankAccountNumber) {
        super(uuid, balance, customer, BankAccountNumber);
    }
    public void urok() {
        this.setBalance(this.getBalance()*1.25);
    }
}
