public class DebitCard extends Card implements PaymentMethod{
     DebitCard(String card_number, String userName){
        super(card_number, userName);
    }
    public void pay(){
        System.out.println("payment via Debit card");
    }
}
