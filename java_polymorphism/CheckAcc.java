public class CheckingAcct extends BankAccount{
    protected double overDraftLimit;

    public CheckingAcct(int Accountnumber, double overDraftLimit){
        super(Accountnumber);
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
