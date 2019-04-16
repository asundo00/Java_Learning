public class Account {

    private String number;
    private double balance;
    private String costumerName;
    private String costumerEmailAdress;
    private String costumerPhoneNumber;

    public Account() {
        this("two hudred", 25.5, "Default name", "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String costumerName, String costumerEmailAdress, String costumerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.costumerName = costumerName;
        this.costumerEmailAdress = costumerEmailAdress;
        this.costumerPhoneNumber = costumerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0)
            System.out.println(" Only " + this.balance + " available. Withdrawal not processed.");
        else {
            this.balance -= withdrawalAmount;
            System.out.println(" Withdrawal of " + withdrawalAmount + "processed. Remaining balace = " +);
        }
    }
}
