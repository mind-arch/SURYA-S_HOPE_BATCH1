public class Bank{
    public static void main(String[] args) {
       PaymentMethod payment = new PaymentMethod("Visa");
       payment.CreditcardPayment(5000);
       payment.DebtcardPayment(2000);   
       payment.UPIPayment(1000);    
       payment.CashPayment(3000);
    }
}

interface Payment{
    void UPIPayment(int amount);
    void CashPayment(int amount);
    void CreditcardPayment(int amount);
    void DebtcardPayment( int amount);
}
class PaymentMethod implements Payment{
    private String paymentType;
    
    public PaymentMethod(String paymentType) {
        this.paymentType = paymentType;
    }
    
    public void UPIPayment(int amount){
        System.out.println("UPI Payment : " + amount);
    }
     public void CashPayment(int amount){
        System.out.println("Cash Payment : " + amount);
    }
    
    public void CreditcardPayment( int amount){
        System.out.println("Credit Card Payment : " + amount+ "through "+paymentType+"DebtCard");
    }
    public void DebtcardPayment( int amount){
        System.out.println("Debit Card Payment : " + amount + "through "+paymentType +"DebtCard");
    }
}



