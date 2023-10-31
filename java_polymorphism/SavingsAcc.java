public class SavingsAcct extends BankAccount {

    protected double balance;

    public SavingsAcct(int Accountnumber){
        super(Accountnumber);
    }

    @Override
    public double deposit(double deposit){
        super.balance = (deposit * 0.05) + deposit;
        return this.balance;
    }

}
