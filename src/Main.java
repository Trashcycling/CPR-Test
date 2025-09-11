//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1234","French","Fry");
        StudentAccount account = new StudentAccount("12345",0,customer,"8998/4905");
        account.AddBalance(500);
        account.removeBalance(250);
        account.setSchoolName("SPŠE");
        System.out.println("[Hlášení Bankovního Účtu  " + account.getUuid() + "] " + "Student " + customer.getFirstName() +" " + customer.getLastName() + " (" + (customer.getUuid())  +")"  + " ze Školy "+  account.getSchoolName() + " má zůstatek " + account.getBalance()+account.getCurrency());

    }
}