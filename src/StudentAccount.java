public class StudentAccount extends BaseBankAccount {
    private String SchoolName;

    public StudentAccount(String uuid, double balance, Customer customer, String BankAccountNumber) {
        super(uuid, balance, customer, BankAccountNumber);
    }
   public String getSchoolName() {
        return SchoolName;
   }
   public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
   }
}
