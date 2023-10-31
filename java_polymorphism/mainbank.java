public class main {
    public static void main(String[] args) {
        SavingsAcct savings = new SavingsAcct(101);
        CheckingAcct checking = new CheckingAcct(102, 100);
        //both instance using deposit method from superclass
        savings.deposit(1000);
        checking.deposit(500);

        //both instance using display method from superclass
        savings.DisplayAccountInformation();
        checking.DisplayAccountInformation();

        //withdrawal method for 1st instance
        savings.withdrawal(200);
        System.out.println("\nWithdrawal from Savings Account Succesful");
        savings.DisplayAccountInformation();

        //withdrawal method for 2nd instance
        if(checking.withdrawal(700)){
            System.out.println("\nWithdrawal from Checking Account Succesful");
            checking.DisplayAccountInformation();
        }
        else {
            System.out.println("\nInsufficient Funds for Withdrawal from SavingsAccount");
            checking.DisplayAccountInformation();
        }

    }
}
