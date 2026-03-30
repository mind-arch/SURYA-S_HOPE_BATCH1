public class BankEncapsulation{
    public static void main(String[] args) {
        Bank b1=new Bank(10000,5000,5000);
        b1.Withdrawdisplay();
        b1.Depositdisplay();
        b1.checkBalance();
    }
}
class Bank{
    int deposit;
    int withdraw;
    int balance;
    
    Bank(int deposit,int withdraw,int balance){
        this.deposit=deposit;
        this.withdraw=withdraw;
        this.balance=balance;
    }
    void Withdrawdisplay(){
        
        if(withdraw>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-withdraw;
            System.out.println("Withdraw successful. Remaining balance: "+balance);
        }
        
    }
    void Depositdisplay(){
        balance=balance+deposit;
            System.out.println("Deposit successful. Current balance: "+balance);
        
}
void checkBalance(){
    System.out.println("Current balance: "+balance);
}
}   
