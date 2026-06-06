public class UPI implements PaymentMethod {
    String UPI_ID;

    public void pay() {
        System.out.println("Payment via UPI Method" + UPI_ID);
    }

    UPI(String UPI_ID) {
        this.UPI_ID = UPI_ID;
    }

}
