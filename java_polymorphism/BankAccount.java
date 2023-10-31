package java_polymorphism;

class BankAccount {

    int account_number;
    float balance = 0;

    BankAccount(int account_number, float balance){

        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(float depositednum){
        this.balance += depositednum;
    }

    public void withdrawal(float withdrawnum){
        this.balance += withdrawnum;
    }

    public void display_acc_info(){
        System.out.println("Account number: "+ account_number);
        System.out.println("Balance: "+ balance);

    }

}