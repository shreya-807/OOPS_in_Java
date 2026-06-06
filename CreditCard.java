public class CreditCard extends Card implements PaymentMethod {
    CreditCard(String card_number, String userName) {
        super(card_number, userName);
    }

    public void pay() {
        System.out.println("payment via Credit card");
    }
}
