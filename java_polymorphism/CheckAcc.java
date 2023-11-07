public class CheckAcc extends BankAccount{
    protected double overDraftLimit;

    public CheckingAcc(int account_number, double overDraftLimit){
        super(account_number);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdrawal(double withdrawal){
        if(withdrawal <= overDraftLimit + super.balance){
            super.balance -= withdrawal;
            return true;
        }
        else  {
            return false;

        }
    }

}
